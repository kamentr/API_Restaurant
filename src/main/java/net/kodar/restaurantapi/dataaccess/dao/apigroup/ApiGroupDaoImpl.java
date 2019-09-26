package net.kodar.restaurantapi.dataaccess.dao.apigroup;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import net.kodar.restaurantapi.data.entities.ApiGroup;
import net.kodar.restaurantapi.data.entities.ApiUser;
import net.kodar.restaurantapi.dataaccess.dao.DaoGenericImpl;
import net.kodar.restaurantapi.dataaccess.repository.ApiGroupRepository;

@Component
public class ApiGroupDaoImpl extends DaoGenericImpl<ApiGroup, Long> implements ApiGroupDao{

	@Autowired
	private ApiGroupRepository repo;
	
	@Override
	protected Long getId(ApiGroup entity) {
		// TODO Auto-generated method stub
		return entity.getId();
	}



}
