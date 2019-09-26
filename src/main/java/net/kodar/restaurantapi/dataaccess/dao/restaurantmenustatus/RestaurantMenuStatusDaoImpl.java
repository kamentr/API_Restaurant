package net.kodar.restaurantapi.dataaccess.dao.restaurantmenustatus;

import org.springframework.stereotype.Component;

import net.kodar.restaurantapi.data.entities.RestaurantMenuStatus;
import net.kodar.restaurantapi.dataaccess.dao.DaoGenericImpl;

@Component
public class RestaurantMenuStatusDaoImpl extends DaoGenericImpl<RestaurantMenuStatus, Long> implements RestaurantMenuStatusDao{

	@Override
	protected Long getId(RestaurantMenuStatus entity) {
		// TODO Auto-generated method stub
		return entity.getId();
	}

}
