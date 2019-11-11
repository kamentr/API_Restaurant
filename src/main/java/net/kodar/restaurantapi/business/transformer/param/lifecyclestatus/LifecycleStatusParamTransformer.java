package net.kodar.restaurantapi.business.transformer.param.lifecyclestatus;

import org.springframework.stereotype.Component;

import net.kodar.restaurantapi.business.transformer.param.ParamTransformer;
import net.kodar.restaurantapi.data.entities.LifecycleStatus;
import net.kodar.restaurantapi.presentation.param.LifecycleStatusParam;
@Component
public class LifecycleStatusParamTransformer implements ParamTransformer<LifecycleStatusParam, LifecycleStatus, LifecycleStatus> {

	@Override
	public LifecycleStatus apply(LifecycleStatusParam param, LifecycleStatus entity) {
		if (entity == null) {
			entity = new LifecycleStatus();
			entity.setId(param.getId());
		}
		
		entity.setCode(param.getCode());
		entity.setDescription(param.getDescription());
		entity.setName(param.getName());		
		entity.setLocked(param.isLocked());

		return entity;
	}

}
