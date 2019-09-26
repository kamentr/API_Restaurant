package net.kodar.restaurantapi.business.processor.authentication;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import net.kodar.restaurantapi.config.ApiCredentials;
import net.kodar.restaurantapi.data.entities.security.ApiSession;
import net.kodar.restaurantapi.data.entities.security.CustomUsernamePasswordAuthentication;
import net.kodar.restaurantapi.dataaccess.dao.apisession.ApiSessionDao;
import net.kodar.restaurantapi.dataaccess.dao.apisession.ApiSessionDaoImpl;
import net.kodar.restaurantapi.dataaccess.dao.apiuser.ApiUserDaoImpl;
import net.kodar.restaurantapi.dataaccess.dao.apiusergroup.ApiUserGroupDaoImpl;
import net.kodar.restaurantapi.dataaccess.repository.ApiSessionRepository;

@Service
public class AuthenticationProcessorImpl implements AuthenticationProcessor {

	@Autowired
	private ApiCredentials credentials;
	
	@Autowired
	private ApiSessionDaoImpl apiSessionDao;

	@Autowired
	private ApiUserDaoImpl userDao;

	@Autowired
	private ApiUserGroupDaoImpl groupDao; 

	@Override
	public void logout() {
		String username = credentials.getAuthentication().getName();
		ApiSession storedSession = apiSessionDao.findByUsername(username);

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


//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		CustomUser user = userDao.findByUsername(username);
//		if (user == null) {
//			throw new UsernameNotFoundException(String.format("No user found with username '%s'.", username));
//		} else {
//			List<UserGroup> authtorities = groupDao.findByUsername(username);
//			CustomUsernamePasswordAuthentication authentication = new CustomUsernamePasswordAuthentication(username, null, authtorities);
//			securityContext.setAuthentication(authentication);
//			
//			return user;
//		}
//	}
}