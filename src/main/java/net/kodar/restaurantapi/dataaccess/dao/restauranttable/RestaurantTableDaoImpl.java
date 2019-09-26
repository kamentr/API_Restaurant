package net.kodar.restaurantapi.dataaccess.dao.restauranttable;

import org.springframework.stereotype.Component;

import net.kodar.restaurantapi.data.entities.RestaurantTable;
import net.kodar.restaurantapi.dataaccess.dao.DaoGenericImpl;

@Component
public class RestaurantTableDaoImpl extends DaoGenericImpl<RestaurantTable, Long> implements RestaurantTableDao{

	@Override
	protected Long getId(RestaurantTable entity) {
		// TODO Auto-generated method stub
		return entity.getId();
	}

}
