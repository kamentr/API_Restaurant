package net.kodar.restaurantapi.business.transformer.param.restaurantmenucategory;

import org.springframework.stereotype.Component;

import net.kodar.restaurantapi.business.transformer.param.ParamTransformer;
import net.kodar.restaurantapi.data.entities.RestaurantMenuCategory;
import net.kodar.restaurantapi.presentation.param.RestaurantMenuCategoryParam;
@Component
public class RestaurantMenuCategoryParamTransformer implements ParamTransformer<RestaurantMenuCategoryParam, RestaurantMenuCategory, RestaurantMenuCategory> {

	@Override
	public RestaurantMenuCategory apply(RestaurantMenuCategoryParam param, RestaurantMenuCategory entity) {
		if (entity == null) {
			entity = new RestaurantMenuCategory();
			entity.setId(param.getId());
		}
		
		entity.setCode(param.getCode());
		entity.setDescription(param.getDescription());
		entity.setName(param.getName());		
		entity.setLocked(param.isLocked());

		return entity;
	}

}
