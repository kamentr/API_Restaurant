package net.kodar.restaurantapi.business.transformer.param.apigroup;

import org.springframework.stereotype.Component;

import net.kodar.restaurantapi.business.transformer.param.ParamTransformer;
import net.kodar.restaurantapi.data.entities.ApiGroup;
import net.kodar.restaurantapi.presentation.param.ApiGroupParam;

@Component
public class ApiGroupParamTransformer implements ParamTransformer<ApiGroupParam, ApiGroup, ApiGroup> {

	@Override
	public ApiGroup apply(ApiGroupParam param, ApiGroup entity) {
		if (entity == null) {
			entity = new ApiGroup();
			entity.setId(param.getId());
		}
		
		entity.setCode(param.getCode());
		entity.setDescription(param.getDescription());
		entity.setName(param.getName());		
		entity.setLocked(param.isLocked());

		
		return entity;
	}
}
