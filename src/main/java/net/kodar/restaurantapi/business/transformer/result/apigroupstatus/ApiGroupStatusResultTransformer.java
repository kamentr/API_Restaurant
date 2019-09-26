package net.kodar.restaurantapi.business.transformer.result.apigroupstatus;

import org.springframework.stereotype.Component;

import net.kodar.restaurantapi.business.transformer.result.ResultTransformer;
import net.kodar.restaurantapi.data.entities.ApiGroupStatus;
import net.kodar.restaurantapi.presentation.result.ApiGroupStatusResult;
@Component
public class ApiGroupStatusResultTransformer implements ResultTransformer<ApiGroupStatus, ApiGroupStatusResult> {

	@Override
	public ApiGroupStatusResult apply(ApiGroupStatus entity) {
		ApiGroupStatusResult result = new ApiGroupStatusResult();

		result.setId(entity.getId());
		result.setCode(entity.getCode());
		result.setDescription(entity.getDescription());
		result.setName(entity.getName());
		
		
		return result;
	}

}
