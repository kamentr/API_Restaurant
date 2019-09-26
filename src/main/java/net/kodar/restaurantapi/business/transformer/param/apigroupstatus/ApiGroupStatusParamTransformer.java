package net.kodar.restaurantapi.business.transformer.param.apigroupstatus;

import org.springframework.stereotype.Component;

import net.kodar.restaurantapi.business.transformer.param.ParamTransformer;
import net.kodar.restaurantapi.data.entities.ApiGroupStatus;
import net.kodar.restaurantapi.presentation.param.ApiGroupStatusParam;

@Component
public class ApiGroupStatusParamTransformer implements ParamTransformer<ApiGroupStatusParam, ApiGroupStatus, ApiGroupStatus> {

	@Override
	public ApiGroupStatus apply(ApiGroupStatusParam param, ApiGroupStatus entity) {
		if (entity == null) {
			entity = new ApiGroupStatus();
			entity.setId(param.getId());
		}
		
		entity.setCode(param.getCode());
		entity.setDescription(param.getDescription());
		entity.setName(param.getName());		
		entity.setLocked(param.isLocked());

		
		
		return entity;
	}

}
