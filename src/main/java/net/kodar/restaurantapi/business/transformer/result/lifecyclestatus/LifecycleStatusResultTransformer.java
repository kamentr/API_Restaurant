package net.kodar.restaurantapi.business.transformer.result.lifecyclestatus;

import org.springframework.stereotype.Component;

import net.kodar.restaurantapi.business.transformer.result.ResultTransformer;
import net.kodar.restaurantapi.data.entities.LifecycleStatus;
import net.kodar.restaurantapi.presentation.result.LifecycleStatusResult;
@Component
public class LifecycleStatusResultTransformer implements ResultTransformer<LifecycleStatus, LifecycleStatusResult> {

	@Override
	public LifecycleStatusResult apply(LifecycleStatus entity) {
		LifecycleStatusResult result = new LifecycleStatusResult();

		result.setId(entity.getId());
		result.setCode(entity.getCode());
		result.setDescription(entity.getDescription());
		result.setName(entity.getName());

		return result;
	}

}
