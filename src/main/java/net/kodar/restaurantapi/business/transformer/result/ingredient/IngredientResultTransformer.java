package net.kodar.restaurantapi.business.transformer.result.ingredient;

import org.springframework.stereotype.Component;

import net.kodar.restaurantapi.business.transformer.result.ResultTransformer;
import net.kodar.restaurantapi.data.entities.Ingredient;
import net.kodar.restaurantapi.presentation.result.IngredientResult;
@Component
public class IngredientResultTransformer implements ResultTransformer<Ingredient, IngredientResult> {

	@Override
	public IngredientResult apply(Ingredient entity) {
		IngredientResult result = new IngredientResult();

		result.setId(entity.getId());
		result.setCode(entity.getCode());
		result.setDescription(entity.getDescription());
		result.setName(entity.getName());

		result.setIngredientStatus(entity.getIngredientStatus());
		
		return result;
	}

}
