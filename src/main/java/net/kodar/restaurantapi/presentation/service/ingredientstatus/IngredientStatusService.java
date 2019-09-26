package net.kodar.restaurantapi.presentation.service.ingredientstatus;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.kodar.restaurantapi.business.processor.ingredientstatus.IngredientStatusProcessorImpl;
import net.kodar.restaurantapi.presentation.param.IngredientStatusParam;
import net.kodar.restaurantapi.presentation.result.IngredientStatusResult;
import net.kodar.restaurantapi.presentation.service.ServiceGeneric;

@RestController
@RequestMapping("ingredientstatus")
public class IngredientStatusService extends ServiceGeneric<IngredientStatusParam, IngredientStatusResult, Long, IngredientStatusProcessorImpl>{

	@Override
	protected Long getId(IngredientStatusParam param) {
		return param.getId();
	}}
