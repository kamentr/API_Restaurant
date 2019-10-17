package net.kodar.restaurantapi.business.processor.authentication;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.kodar.restaurantapi.config.ApiCredentials;
import net.kodar.restaurantapi.data.entities.security.ApiSession;
import net.kodar.restaurantapi.dataaccess.dao.apisession.ApiSessionDaoImpl;

@Service
public class AuthenticationProcessorImpl implements AuthenticationProcessor {

	@Autowired
	private ApiCredentials credentials;
	
	@Autowired
	private ApiSessionDaoImpl apiSessionDao;

	@Override
	public void logout() {
		String username = credentials.getAuthentication().getName();
		ApiSession storedSession = apiSessionDao.findByUsername(username);

		if(storedSession!=null)
		apiSessionDao.delete(storedSession.getId());
	}

	public String login() {
		final String uuid = UUID.randomUUID().toString();
		String username = credentials.getAuthentication().getName();
		
		ApiSession apiSession = new ApiSession();
		apiSession.setAuthToken(uuid);
		apiSession.setUsername(username);
		 
		apiSessionDao.save(apiSession);
		
		return uuid;
	}
}