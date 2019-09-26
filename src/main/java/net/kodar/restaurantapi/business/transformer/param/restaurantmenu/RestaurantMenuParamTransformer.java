package net.kodar.restaurantapi.business.transformer.param.restaurantmenu;

import org.springframework.stereotype.Component;

import net.kodar.restaurantapi.business.transformer.param.ParamTransformer;
import net.kodar.restaurantapi.data.entities.RestaurantMenu;
import net.kodar.restaurantapi.presentation.param.RestaurantMenuParam;
@Component
public class RestaurantMenuParamTransformer implements ParamTransformer<RestaurantMenuParam, RestaurantMenu, RestaurantMenu> {

	@Override
	public RestaurantMenu apply(RestaurantMenuParam param, RestaurantMenu entity) {
		if (entity == null) {
			entity = new RestaurantMenu();
			entity.setId(param.getId());
		}
		
		entity.setCode(param.getCode());
		entity.setDescription(param.getDescription());
		entity.setName(param.getName());		
		entity.setLocked(param.isLocked());

		entity.setRestaurantMenuCategory(param.getRestaurantMenuCategory());
		entity.setRestaurantMenuStatus(param.getRestaurantMenuStatus());
		entity.setLifecycleStatus(param.getLifecycleStatus());
		
		return entity;
	}

}
