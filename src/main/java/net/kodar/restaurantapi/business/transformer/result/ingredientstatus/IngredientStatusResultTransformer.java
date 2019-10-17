package net.kodar.restaurantapi.business.transformer.result.ingredientstatus;

import org.springframework.stereotype.Component;

import net.kodar.restaurantapi.business.transformer.result.ResultTransformer;
import net.kodar.restaurantapi.data.entities.IngredientStatus;
import net.kodar.restaurantapi.presentation.result.IngredientStatusResult;
@Component
public class IngredientStatusResultTransformer implements ResultTransformer<IngredientStatus,IngredientStatusResult> {

	@Override
	public IngredientStatusResult apply(IngredientStatus entity) {
		IngredientStatusResult result = new IngredientStatusResult();

		result.setId(entity.getId());
		result.setCode(entity.getCode());
		result.setDescription(entity.getDescription());
		result.setName(entity.getName());

		return result;
	}

}
