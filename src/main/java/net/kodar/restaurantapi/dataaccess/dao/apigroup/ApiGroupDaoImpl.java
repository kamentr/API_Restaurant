package net.kodar.restaurantapi.dataaccess.dao.apigroup;

import org.springframework.stereotype.Component;

import net.kodar.restaurantapi.data.entities.ApiGroup;
import net.kodar.restaurantapi.dataaccess.dao.DaoGenericImpl;

@Component
public class ApiGroupDaoImpl extends DaoGenericImpl<ApiGroup, Long> implements ApiGroupDao{

	@Override
	protected Long getId(ApiGroup entity) {
		// TODO Auto-generated method stub
		return entity.getId();
	}

	

}
