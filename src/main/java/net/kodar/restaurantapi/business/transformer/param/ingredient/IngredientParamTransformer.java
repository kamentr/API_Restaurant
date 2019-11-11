package net.kodar.restaurantapi.business.transformer.param.ingredient;

import org.springframework.stereotype.Component;

import net.kodar.restaurantapi.business.transformer.param.ParamTransformer;
import net.kodar.restaurantapi.data.entities.Ingredient;
import net.kodar.restaurantapi.presentation.param.IngredientParam;
@Component
public class IngredientParamTransformer implements ParamTransformer<IngredientParam, Ingredient, Ingredient> {

	@Override
	public Ingredient apply(IngredientParam param, Ingredient entity) {
		if (entity == null) {
			entity = new Ingredient();
			entity.setId(param.getId());
		}
		
		entity.setCode(param.getCode());
		entity.setDescription(param.getDescription());
		entity.setName(param.getName());		
		entity.setLocked(param.isLocked());

		entity.setIngredientStatus(param.getIngredientStatus());
		
		return entity;
	}

}
