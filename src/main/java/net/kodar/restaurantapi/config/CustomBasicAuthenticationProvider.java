package net.kodar.restaurantapi.config;

import java.io.IOException;
import java.util.List;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import net.kodar.restaurantapi.business.processor.apiusergroup.ApiUserGroupProcessorImpl;
import net.kodar.restaurantapi.data.entities.ApiBasicAuthentication;
import net.kodar.restaurantapi.data.entities.ApiGroup;
import net.kodar.restaurantapi.data.entities.ApiUser;
import net.kodar.restaurantapi.data.entities.security.ApiSession;
import net.kodar.restaurantapi.data.entities.security.CustomUsernamePasswordAuthentication;
import net.kodar.restaurantapi.dataaccess.dao.apiuser.ApiUserDaoImpl;
import net.kodar.restaurantapi.dataaccess.dao.apiusergroup.ApiUserGroupDao;
import net.kodar.restaurantapi.dataaccess.repository.ApiSessionRepository;
import net.kodar.restaurantapi.dataaccess.repository.ApiUserGroupRepository;

@Component
public class CustomBasicAuthenticationProvider implements AuthenticationProvider {

	@Autowired
	private ApiUserDaoImpl userDao;

	@Autowired
	private BCryptPasswordEncoder encoder;

	@Autowired
	private ApiUserGroupProcessorImpl groupsProcessor;

	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {

		CustomUsernamePasswordAuthentication customAuth = (CustomUsernamePasswordAuthentication) authentication;
		if (customAuth != null) {
			String username = authentication.getName();
			String password = authentication.getCredentials().toString();

			ApiUser storedUser = userDao.findByUsername(username);

			String storedPassword = storedUser.getPassword();

			if (storedUser != null && encoder.matches(password, storedPassword)) {
				List<ApiGroup> userAuthorities = groupsProcessor.findByUser(storedUser);

				authentication = new CustomUsernamePasswordAuthentication(username, password, userAuthorities);
				return authentication;
			}
		}
		
		return null;
	}

	@Override
	public boolean supports(Class<?> authentication) {
		return true;
	}

}
