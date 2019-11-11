package net.kodar.restaurantapi.business.transformer.result.apiuserstatus;

import org.springframework.stereotype.Component;

import net.kodar.restaurantapi.business.transformer.result.ResultTransformer;
import net.kodar.restaurantapi.data.entities.ApiUserStatus;
import net.kodar.restaurantapi.presentation.result.ApiUserStatusResult;
@Component
public class ApiUserStatusResultTransformer implements ResultTransformer<ApiUserStatus, ApiUserStatusResult> {

	@Override
	public ApiUserStatusResult apply(ApiUserStatus entity) {
		ApiUserStatusResult result = new ApiUserStatusResult();

		result.setId(entity.getId());
		result.setCode(entity.getCode());
		result.setDescription(entity.getDescription());
		result.setName(entity.getName());

		
		
		return result;
	}

}
