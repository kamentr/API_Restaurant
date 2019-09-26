package net.kodar.restaurantapi.business.transformer.param.apiuser;

import org.springframework.stereotype.Component;

import net.kodar.restaurantapi.business.transformer.param.ParamTransformer;
import net.kodar.restaurantapi.data.entities.ApiUser;
import net.kodar.restaurantapi.presentation.param.ApiGroupParam;
import net.kodar.restaurantapi.presentation.param.ApiUserParam;
@Component
public class ApiUserParamTransformer implements ParamTransformer<ApiUserParam, ApiUser, ApiUser> {

	@Override
	public ApiUser apply(ApiUserParam param, ApiUser entity) {
		if (entity == null) {
			entity = new ApiUser();
			entity.setId(param.getId());
		}
		
		entity.setCode(param.getCode());
		entity.setDescription(param.getDescription());
		entity.setName(param.getName());		
		entity.setLocked(param.isLocked());

		entity.setApiUserStatus(param.getApiUserStatus());
		entity.setPassword(param.getPassword());
		entity.setUsername(param.getUsername());
		
		return entity;
	}

}
