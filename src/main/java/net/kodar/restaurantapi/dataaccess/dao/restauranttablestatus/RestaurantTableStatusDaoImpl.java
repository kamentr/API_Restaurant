package net.kodar.restaurantapi.dataaccess.dao.restauranttablestatus;

import org.springframework.stereotype.Component;

import net.kodar.restaurantapi.data.entities.RestaurantTableStatus;
import net.kodar.restaurantapi.dataaccess.dao.DaoGenericImpl;

@Component
public class RestaurantTableStatusDaoImpl extends DaoGenericImpl<RestaurantTableStatus, Long> implements RestaurantTableStatusDao{

	@Override
	protected Long getId(RestaurantTableStatus entity) {
		return entity.getId();
	}

}
