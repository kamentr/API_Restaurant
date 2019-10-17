package net.kodar.restaurantapi.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import net.kodar.restaurantapi.business.processor.apigroup.ApiGroupProcessorImpl;
import net.kodar.restaurantapi.data.entities.ApiGroup;
import net.kodar.restaurantapi.data.entities.ApiUser;
import net.kodar.restaurantapi.data.entities.security.ApiSession;
import net.kodar.restaurantapi.data.entities.security.CustomUsernamePasswordAuthentication;
import net.kodar.restaurantapi.dataaccess.dao.apiuser.ApiUserDaoImpl;
import net.kodar.restaurantapi.dataaccess.repository.ApiSessionRepository;

@Component
public class CustomAuthTokenAuthenticationProvider implements AuthenticationProvider {

	@Autowired
	private ApiUserDaoImpl userDao;

	@Autowired
	private ApiGroupProcessorImpl groupsProcessor;

	@Autowired
	private ApiSessionRepository sessionRepository;

	@Override
	public Authentication authenticate(Authentication auth) {

		CustomUsernamePasswordAuthentication authentication = (CustomUsernamePasswordAuthentication) auth;
		
		String authToken = authentication.getAuthToken();

		ApiSession storedSession = sessionRepository.findByAuthToken(authToken);

		if (storedSession != null) {

			ApiUser user = userDao.findByUsername(storedSession.getUsername());
			List<ApiGroup> userAuthorities = groupsProcessor.findByUser(user.getUsername());

			authentication = new CustomUsernamePasswordAuthentication(user.getUsername(), user.getPassword(), authToken,
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