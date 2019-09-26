package net.kodar.restaurantapi.business.transformer.result.apiuser;

import org.springframework.stereotype.Component;

import net.kodar.restaurantapi.business.transformer.result.ResultTransformer;
import net.kodar.restaurantapi.data.entities.ApiUser;
import net.kodar.restaurantapi.presentation.result.ApiUserResult;
@Component
public class ApiUserResultTransformer implements ResultTransformer<ApiUser, ApiUserResult> {

	@Override
	public ApiUserResult apply(ApiUser entity) {
		ApiUserResult result = new ApiUserResult();

		result.setId(entity.getId());
		result.setCode(entity.getCode());
		result.setDescription(entity.getDescription());
		result.setName(entity.getName());
		result.setLifecycleStatus(entity.getLifecycleStatus());

		result.setApiUserStatus(result.getApiUserStatus());
		
		return result;
	}

}
