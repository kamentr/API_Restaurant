package net.kodar.restaurantapi.business.transformer.result.restaurantmenu;

import org.springframework.stereotype.Component;

import net.kodar.restaurantapi.business.transformer.result.ResultTransformer;
import net.kodar.restaurantapi.data.entities.RestaurantMenu;
import net.kodar.restaurantapi.presentation.result.RestaurantMenuResult;
@Component
public class RestaurantMenuResultTransformer implements ResultTransformer<RestaurantMenu, RestaurantMenuResult> {

	@Override
	public RestaurantMenuResult apply(RestaurantMenu entity) {
		RestaurantMenuResult result = new RestaurantMenuResult();

		result.setId(entity.getId());
		result.setCode(entity.getCode());
		result.setDescription(entity.getDescription());
		result.setName(entity.getName());
		result.setLifecycleStatus(entity.getLifecycleStatus());

		result.setRestaurantMenuCategory(entity.getRestaurantMenuCategory());
		result.setRestaurantMenuStatus(entity.getRestaurantMenuStatus());
		
		return result;
	}

}
