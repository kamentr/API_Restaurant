package net.kodar.restaurantapi.business.transformer.result.apigroup;

import org.springframework.stereotype.Component;

import net.kodar.restaurantapi.business.transformer.result.ResultTransformer;
import net.kodar.restaurantapi.data.entities.ApiGroup;
import net.kodar.restaurantapi.presentation.result.ApiGroupResult;
@Component
public class ApiGroupResultTransformer implements ResultTransformer<ApiGroup, ApiGroupResult> {

	@Override
	public ApiGroupResult apply(ApiGroup entity) {
		ApiGroupResult result = new ApiGroupResult();

		result.setId(entity.getId());
		result.setCode(entity.getCode());
		result.setDescription(entity.getDescription());
		result.setName(entity.getName());
		result.setLifecycleStatus(entity.getLifecycleStatus());

		result.setApiGroupStatus(result.getApiGroupStatus());
		
		return result;
	}

}
