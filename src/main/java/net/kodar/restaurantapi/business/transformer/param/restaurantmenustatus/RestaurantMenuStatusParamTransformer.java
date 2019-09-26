package net.kodar.restaurantapi.business.transformer.param.restaurantmenustatus;

import org.springframework.stereotype.Component;

import net.kodar.restaurantapi.business.transformer.param.ParamTransformer;
import net.kodar.restaurantapi.data.entities.RestaurantMenuStatus;
import net.kodar.restaurantapi.presentation.param.RestaurantMenuStatusParam;

@Component
public class RestaurantMenuStatusParamTransformer implements ParamTransformer<RestaurantMenuStatusParam, RestaurantMenuStatus, RestaurantMenuStatus> {

	@Override
	public RestaurantMenuStatus apply(RestaurantMenuStatusParam param, RestaurantMenuStatus entity) {
		if (entity == null) {
			entity = new RestaurantMenuStatus();
			entity.setId(param.getId());
		}
		
		entity.setCode(param.getCode());
		entity.setDescription(param.getDescription());
		entity.setName(param.getName());		
		entity.setLocked(param.isLocked());

		return entity;
	}

}
