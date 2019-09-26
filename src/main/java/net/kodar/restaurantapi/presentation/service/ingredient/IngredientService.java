package net.kodar.restaurantapi.presentation.service.ingredient;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.kodar.restaurantapi.business.processor.ingredient.IngredientProcessorImpl;
import net.kodar.restaurantapi.presentation.param.IngredientParam;
import net.kodar.restaurantapi.presentation.result.IngredientResult;
import net.kodar.restaurantapi.presentation.service.ServiceGeneric;

@RestController
@RequestMapping("ingredient")
public class IngredientService
		extends ServiceGeneric<IngredientParam, IngredientResult, Long, IngredientProcessorImpl> {

	@Override
	protected Long getId(IngredientParam param) {
		return param.getId();
	}
}
