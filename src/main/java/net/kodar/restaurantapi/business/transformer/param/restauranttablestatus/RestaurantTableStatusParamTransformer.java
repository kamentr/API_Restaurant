package net.kodar.restaurantapi.business.transformer.param.restauranttablestatus;

import org.springframework.stereotype.Component;

import net.kodar.restaurantapi.business.transformer.param.ParamTransformer;
import net.kodar.restaurantapi.data.entities.RestaurantTableStatus;
import net.kodar.restaurantapi.presentation.param.RestaurantTableStatusParam;

@Component
public class RestaurantTableStatusParamTransformer implements ParamTransformer<RestaurantTableStatusParam, RestaurantTableStatus, RestaurantTableStatus> {

	@Override
	public RestaurantTableStatus apply(RestaurantTableStatusParam param, RestaurantTableStatus entity) {
		if (entity == null) {
			entity = new RestaurantTableStatus();
			entity.setId(param.getId());
		}
		
		entity.setCode(param.getCode());
		entity.setDescription(param.getDescription());
		entity.setName(param.getName());		
		entity.setLocked(param.isLocked());

		
		return entity;
	}

}
