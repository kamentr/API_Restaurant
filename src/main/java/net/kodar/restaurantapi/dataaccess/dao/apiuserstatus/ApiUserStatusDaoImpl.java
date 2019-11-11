package net.kodar.restaurantapi.dataaccess.dao.apiuserstatus;

import org.springframework.stereotype.Component;

import net.kodar.restaurantapi.data.entities.ApiUserStatus;
import net.kodar.restaurantapi.dataaccess.dao.DaoGenericImpl;

@Component
public class ApiUserStatusDaoImpl extends DaoGenericImpl<ApiUserStatus, Long> implements ApiUserStatusDao{

	@Override
	protected Long getId(ApiUserStatus entity) {
		// TODO Auto-generated method stub
		return entity.getId();
	}

}
