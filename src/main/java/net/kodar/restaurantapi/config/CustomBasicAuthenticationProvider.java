package net.kodar.restaurantapi.config;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import net.kodar.restaurantapi.business.processor.apigroup.ApiGroupProcessorImpl;
import net.kodar.restaurantapi.business.processor.apiusergroup.ApiUserGroupProcessorImpl;
import net.kodar.restaurantapi.data.entities.ApiGroup;
import net.kodar.restaurantapi.data.entities.ApiUser;
import net.kodar.restaurantapi.data.entities.security.CustomUsernamePasswordAuthentication;
import net.kodar.restaurantapi.dataaccess.dao.apiuser.ApiUserDaoImpl;

@Component
public class CustomBasicAuthenticationProvider implements AuthenticationProvider {

	@Autowired
	private ApiUserDaoImpl userDao;

	@Autowired
	private BCryptPasswordEncoder encoder;

	@Autowired
	private ApiGroupProcessorImpl groupsProcessor;

	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {

		CustomUsernamePasswordAuthentication customAuth = (CustomUsernamePasswordAuthentication) authentication;
		if (customAuth != null) {

			if (null != authentication.getCredentials()) {

				String username = Optional.of(authentication.getName()).orElse("");
				String password = Optional.of((authentication.getCredentials()).toString()).orElse("");

				Optional<ApiUser> storedUser = Optional.ofNullable(userDao.findByUsername(username));

				String storedPassword = storedUser.map(u -> u.getPassword()).orElse("");

				if (storedUser.isPresent() && encoder.matches(password, storedPassword)) {
					List<ApiGroup> userAuthorities = groupsProcessor.findByUser(storedUser.get().getUsername());

					authentication = new CustomUsernamePasswordAuthentication(username, password, userAuthorities);
					return authentication;
				}
			}
		}

		return null;
	}

	@Override
	public boolean supports(Class<?> authentication) {
		return true;
	}

}
