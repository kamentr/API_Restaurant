package net.kodar.restaurantapi.dataaccess.dao.apiuser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import net.kodar.restaurantapi.data.entities.ApiUser;
import net.kodar.restaurantapi.dataaccess.dao.DaoGenericImpl;
import net.kodar.restaurantapi.dataaccess.repository.ApiUserRepository;

@Component
public class ApiUserDaoImpl extends DaoGenericImpl<ApiUser, Long> implements ApiUserDao{

	@Autowired
	private ApiUserRepository repo;
	
	@Override
	protected Long getId(ApiUser entity) {
		return entity.getId();
	}

	public ApiUser findByUsername(String username) {
		return this.repo.findByUsername(username);
	}


}
