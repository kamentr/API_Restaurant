package net.kodar.restaurantapi.dataaccess.dao.restaurantmenu;

import org.springframework.stereotype.Component;

import net.kodar.restaurantapi.data.entities.RestaurantMenu;
import net.kodar.restaurantapi.dataaccess.dao.DaoGenericImpl;

@Component
public class RestaurantMenuDaoImpl extends DaoGenericImpl<RestaurantMenu, Long> implements RestaurantMenuDao{

	@Override
	protected Long getId(RestaurantMenu entity) {
		// TODO Auto-generated method stub
		return entity.getId();
	}

}
