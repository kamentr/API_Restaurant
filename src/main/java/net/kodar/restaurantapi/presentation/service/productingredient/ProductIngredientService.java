package net.kodar.restaurantapi.presentation.service.productingredient;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.kodar.restaurantapi.business.processor.productingredient.ProductIngredientProcessorImpl;
import net.kodar.restaurantapi.presentation.param.ProductIngredientParam;
import net.kodar.restaurantapi.presentation.result.ProductIngredientResult;
import net.kodar.restaurantapi.presentation.service.ServiceGeneric;

@RestController
@RequestMapping("productingredient")
public class ProductIngredientService extends ServiceGeneric<ProductIngredientParam, ProductIngredientResult, Long, ProductIngredientProcessorImpl>{

	@Override
	protected Long getId(ProductIngredientParam param) {
		return param.getId();
	}}
