package net.kodar.restaurantapi.business.transformer.param.restauranttable;

import org.springframework.stereotype.Component;

import net.kodar.restaurantapi.business.transformer.param.ParamTransformer;
import net.kodar.restaurantapi.data.entities.RestaurantTable;
import net.kodar.restaurantapi.presentation.param.RestaurantTableParam;

@Component
public class RestaurantTableParamTransformer implements ParamTransformer<RestaurantTableParam, RestaurantTable, RestaurantTable> {

	@Override
	public RestaurantTable apply(RestaurantTableParam param, RestaurantTable entity) {
		if (entity == null) {
			entity = new RestaurantTable();
			entity.setId(param.getId());
		}
		
		entity.setCode(param.getCode());
		entity.setDescription(param.getDescription());
		entity.setName(param.getName());		
		entity.setLocked(param.isLocked());

		entity.setRestaurantTableStatus(param.getRestaurantTavbleStatus());
		
		return entity;
	}

}
