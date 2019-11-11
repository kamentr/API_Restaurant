package net.kodar.restaurantapi.dataaccess.dao.restaurantmenucategory;

import org.springframework.stereotype.Component;

import net.kodar.restaurantapi.data.entities.RestaurantMenuCategory;
import net.kodar.restaurantapi.dataaccess.dao.DaoGenericImpl;

@Component
public class RestaurantMenuCategoryDaoImpl extends DaoGenericImpl<RestaurantMenuCategory, Long> implements RestaurantMenuCategoryDao{

	@Override
	protected Long getId(RestaurantMenuCategory entity) {
		// TODO Auto-generated method stub
		return entity.getId();
	}

}
