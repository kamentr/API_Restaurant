package net.kodar.restaurantapi.business.transformer.param.apiusergroup;

import org.springframework.stereotype.Component;

import net.kodar.restaurantapi.business.transformer.param.ParamTransformer;
import net.kodar.restaurantapi.data.entities.ApiUserGroup;
import net.kodar.restaurantapi.presentation.param.ApiUserGroupParam;
@Component
public class ApiUserGroupParamTransformer implements ParamTransformer<ApiUserGroupParam, ApiUserGroup, ApiUserGroup> {

	@Override
	public ApiUserGroup apply(ApiUserGroupParam param, ApiUserGroup entity) {
		if (entity == null) {
			entity = new ApiUserGroup();
			entity.setId(param.getId());
		}
		
		entity.setCode(param.getCode());
		entity.setDescription(param.getDescription());
		entity.setName(param.getName());		
		entity.setLocked(param.isLocked());

		entity.setApiGroup(param.getApiGroup());
		entity.setApiUser(param.getApiUser());
				
		return entity;
	}

}
