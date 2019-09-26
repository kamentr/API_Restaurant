package net.kodar.restaurantapi.business.transformer.result.restaurantmenustatus;

import org.springframework.stereotype.Component;

import net.kodar.restaurantapi.business.transformer.result.ResultTransformer;
import net.kodar.restaurantapi.data.entities.RestaurantMenuStatus;
import net.kodar.restaurantapi.presentation.result.RestaurantMenuStatusResult;
@Component
public class RestaurantMenuStatusResultTransformer implements ResultTransformer<RestaurantMenuStatus, RestaurantMenuStatusResult> {

	@Override
	public RestaurantMenuStatusResult apply(RestaurantMenuStatus entity) {
		RestaurantMenuStatusResult result = new RestaurantMenuStatusResult();

		result.setId(entity.getId());
		result.setCode(entity.getCode());
		result.setDescription(entity.getDescription());
		result.setName(entity.getName());
		
		return result;
	}


}
