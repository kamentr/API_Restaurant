package net.kodar.restaurantapi.dataaccess.dao.apisession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import net.kodar.restaurantapi.data.entities.security.ApiSession;
import net.kodar.restaurantapi.dataaccess.dao.DaoGenericImpl;
import net.kodar.restaurantapi.dataaccess.repository.ApiSessionRepository;

@Component
public class ApiSessionDaoImpl extends DaoGenericImpl<ApiSession, Integer> implements ApiSessionDao{

	@Autowired
	private ApiSessionRepository sessionRepo;
	
	@Override
	protected Integer getId(ApiSession apiSession) {
		return apiSession.getId();
	}

	@Override
	public ApiSession findByUsername(String username) {
		return this.sessionRepo.findByUsername(username);
	}
}
