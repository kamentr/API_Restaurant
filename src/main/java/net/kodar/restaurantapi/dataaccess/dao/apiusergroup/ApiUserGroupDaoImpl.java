package net.kodar.restaurantapi.dataaccess.dao.apiusergroup;

import org.springframework.stereotype.Component;

import net.kodar.restaurantapi.data.entities.ApiUserGroup;
import net.kodar.restaurantapi.dataaccess.dao.DaoGenericImpl;

@Component
public class ApiUserGroupDaoImpl extends DaoGenericImpl<ApiUserGroup, Long> implements ApiUserGroupDao{

	@Override
	protected Long getId(ApiUserGroup entity) {
		// TODO Auto-generated method stub
		return entity.getId();
	}

}
