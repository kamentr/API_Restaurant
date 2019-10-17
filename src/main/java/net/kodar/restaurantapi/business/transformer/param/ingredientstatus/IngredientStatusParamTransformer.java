package net.kodar.restaurantapi.business.transformer.param.ingredientstatus;

import org.springframework.stereotype.Component;

import net.kodar.restaurantapi.business.transformer.param.ParamTransformer;
import net.kodar.restaurantapi.data.entities.IngredientStatus;
import net.kodar.restaurantapi.presentation.param.IngredientStatusParam;
@Component
public class IngredientStatusParamTransformer implements ParamTransformer<IngredientStatusParam, IngredientStatus, IngredientStatus> {

	@Override
	public IngredientStatus apply(IngredientStatusParam param, IngredientStatus entity) {
		if (entity == null) {
			entity = new IngredientStatus();
			entity.setId(param.getId());
		}
		
		entity.setCode(param.getCode());
		entity.setDescription(param.getDescription());
		entity.setName(param.getName());		
		entity.setLocked(param.isLocked());

		return entity;
	}

}
