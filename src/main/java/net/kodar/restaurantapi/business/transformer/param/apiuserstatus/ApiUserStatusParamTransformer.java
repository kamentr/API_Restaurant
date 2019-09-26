package net.kodar.restaurantapi.business.transformer.param.apiuserstatus;

import org.springframework.stereotype.Component;

import net.kodar.restaurantapi.business.transformer.param.ParamTransformer;
import net.kodar.restaurantapi.data.entities.ApiUserStatus;
import net.kodar.restaurantapi.presentation.param.ApiUserStatusParam;
@Component
public class ApiUserStatusParamTransformer implements ParamTransformer<ApiUserStatusParam, ApiUserStatus, ApiUserStatus> {

	@Override
	public ApiUserStatus apply(ApiUserStatusParam param, ApiUserStatus entity) {
		if (entity == null) {
			entity = new ApiUserStatus();
			entity.setId(param.getId());
		}
		
		entity.setCode(param.getCode());
		entity.setDescription(param.getDescription());
		entity.setName(param.getName());		
		entity.setLocked(param.isLocked());

		return entity;
	}

}
