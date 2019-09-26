package net.kodar.restaurantapi.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import net.kodar.restaurantapi.business.processor.apigroup.ApiGroupProcessorImpl;
import net.kodar.restaurantapi.business.processor.apiusergroup.ApiUserGroupProcessorImpl;
import net.kodar.restaurantapi.data.entities.ApiGroup;
import net.kodar.restaurantapi.data.entities.ApiUser;
import net.kodar.restaurantapi.data.entities.security.CustomUsernamePasswordAuthentication;
import net.kodar.restaurantapi.dataaccess.dao.apigroup.ApiGroupDao;
import net.kodar.restaurantapi.dataaccess.dao.apiuser.ApiUserDaoImpl;

@Component
public class CustomAuthenticationProvider implements AuthenticationProvider {

	@Autowired
	private ApiUserDaoImpl userDao;

	@Autowired
	private ApiUserGroupProcessorImpl groupsProcessor;

	@Autowired
	private BCryptPasswordEncoder encoder;

	@Override
	public Authentication authenticate(Authentication auth) {

		CustomUsernamePasswordAuthentication authentication = (CustomUsernamePasswordAuthentication) auth;
		String username = authentication.getName();
		if (authentication.getName() != null) {

			ApiUser user = userDao.findByUsername(username);
			List<ApiGroup> userAuthorities = groupsProcessor.findByUser(user);
			
			authentication = new CustomUsernamePasswordAuthentication(user.getUsername(), user.getPassword(),
					userAuthorities);

			return authentication;
		}
		
		return null;
	}

	@Override
	public boolean supports(Class<?> authentication) {
		return true;
	}

}