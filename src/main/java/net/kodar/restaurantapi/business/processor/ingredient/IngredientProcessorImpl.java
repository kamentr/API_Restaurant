package net.kodar.restaurantapi.business.processor.ingredient;

import org.springframework.stereotype.Service;

import net.kodar.restaurantapi.business.processor.ProcessorGenericImpl;
import net.kodar.restaurantapi.business.transformer.param.ingredient.IngredientParamTransformer;
import net.kodar.restaurantapi.business.transformer.result.ingredient.IngredientResultTransformer;
import net.kodar.restaurantapi.business.validator.ingredient.IngredientValidatorImpl;
import net.kodar.restaurantapi.data.entities.Ingredient;
import net.kodar.restaurantapi.dataaccess.dao.ingredient.IngredientDaoImpl;
import net.kodar.restaurantapi.presentation.param.IngredientParam;
import net.kodar.restaurantapi.presentation.result.IngredientResult;

@Service
public class IngredientProcessorImpl extends
		ProcessorGenericImpl<IngredientParam, IngredientResult, Long, Ingredient, IngredientDaoImpl, IngredientParamTransformer, IngredientResultTransformer, IngredientValidatorImpl>
		implements IngredientProcessor {
                                                                
	@Override
	public Long getID(IngredientParam param) {
		// TODO Auto-generated method stub
		return param.getId();
	}

}
