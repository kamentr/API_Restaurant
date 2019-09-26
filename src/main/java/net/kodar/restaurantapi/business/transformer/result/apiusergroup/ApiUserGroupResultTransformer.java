package net.kodar.restaurantapi.business.transformer.result.apiusergroup;

import org.springframework.stereotype.Component;

import net.kodar.restaurantapi.business.transformer.result.ResultTransformer;
import net.kodar.restaurantapi.data.entities.ApiUserGroup;
import net.kodar.restaurantapi.presentation.result.ApiUserGroupResult;
@Component
public class ApiUserGroupResultTransformer implements ResultTransformer<ApiUserGroup, ApiUserGroupResult> {

	@Override
	public ApiUserGroupResult apply(ApiUserGroup entity) {
		ApiUserGroupResult result = new ApiUserGroupResult();

		result.setId(entity.getId());
		result.setCode(entity.getCode());
		result.setDescription(entity.getDescription());
		result.setName(entity.getName());

		result.setApiGroup(result.getApiGroup());
		result.setApiUser(result.getApiUser());
		
		return result;
	}

}
