package net.kodar.restaurantapi.business.transformer.result.restauranttable;

import org.springframework.stereotype.Component;

import net.kodar.restaurantapi.business.transformer.result.ResultTransformer;
import net.kodar.restaurantapi.data.entities.RestaurantTable;
import net.kodar.restaurantapi.presentation.result.RestaurantTableResult;

@Component
public class RestaurantTableResultTransformer implements ResultTransformer<RestaurantTable, RestaurantTableResult> {

	@Override
	public RestaurantTableResult apply(RestaurantTable entity) {
		RestaurantTableResult result = new RestaurantTableResult();

		result.setId(entity.getId());
		result.setCode(entity.getCode());
		result.setDescription(entity.getDescription());
		result.setName(entity.getName());
		
		result.setRestaurantTavbleStatus(entity.getRestaurantTableStatus());
		
		return result;
	}


}
