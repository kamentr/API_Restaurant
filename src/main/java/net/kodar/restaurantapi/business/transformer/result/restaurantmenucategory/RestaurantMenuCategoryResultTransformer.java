package net.kodar.restaurantapi.business.transformer.result.restaurantmenucategory;

import org.springframework.stereotype.Component;

import net.kodar.restaurantapi.business.transformer.result.ResultTransformer;
import net.kodar.restaurantapi.data.entities.RestaurantMenuCategory;
import net.kodar.restaurantapi.presentation.result.RestaurantMenuCategoryResult;
@Component
public class RestaurantMenuCategoryResultTransformer implements ResultTransformer<RestaurantMenuCategory, RestaurantMenuCategoryResult> {

	@Override
	public RestaurantMenuCategoryResult apply(RestaurantMenuCategory entity) {
		RestaurantMenuCategoryResult result = new RestaurantMenuCategoryResult();

		result.setId(entity.getId());
		result.setCode(entity.getCode());
		result.setDescription(entity.getDescription());
		result.setName(entity.getName());
		
		return result;
	}

}
