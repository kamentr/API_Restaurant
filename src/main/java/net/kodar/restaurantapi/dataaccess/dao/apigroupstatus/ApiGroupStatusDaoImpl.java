package net.kodar.restaurantapi.dataaccess.dao.apigroupstatus;

import org.springframework.stereotype.Component;

import net.kodar.restaurantapi.data.entities.ApiGroupStatus;
import net.kodar.restaurantapi.dataaccess.dao.DaoGenericImpl;

@Component
public class ApiGroupStatusDaoImpl extends DaoGenericImpl<ApiGroupStatus, Long> implements ApiGroupStatusDao{

	@Override
	protected Long getId(ApiGroupStatus entity) {
		// TODO Auto-generated method stub
		return entity.getId();
	}

}
