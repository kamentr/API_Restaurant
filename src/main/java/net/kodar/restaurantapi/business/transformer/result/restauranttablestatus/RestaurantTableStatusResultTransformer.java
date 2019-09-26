package net.kodar.restaurantapi.business.transformer.result.restauranttablestatus;

import org.springframework.stereotype.Component;

import net.kodar.restaurantapi.business.transformer.result.ResultTransformer;
import net.kodar.restaurantapi.data.entities.RestaurantTableStatus;
import net.kodar.restaurantapi.presentation.result.RestaurantTableStatusResult;

@Component
public class RestaurantTableStatusResultTransformer implements ResultTransformer<RestaurantTableStatus, RestaurantTableStatusResult> {

	@Override
	public RestaurantTableStatusResult apply(RestaurantTableStatus entity) {
		RestaurantTableStatusResult result = new RestaurantTableStatusResult();

		result.setId(entity.getId());
		result.setCode(entity.getCode());
		result.setDescription(entity.getDescription());
		result.setName(entity.getName());
		
		return result;
	}


}
