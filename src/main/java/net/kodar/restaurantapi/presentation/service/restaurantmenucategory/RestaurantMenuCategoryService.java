package net.kodar.restaurantapi.presentation.service.restaurantmenucategory;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.kodar.restaurantapi.business.processor.restaurantmenucategory.RestaurantMenuCategoryProcessorImpl;
import net.kodar.restaurantapi.presentation.param.RestaurantMenuCategoryParam;
import net.kodar.restaurantapi.presentation.result.RestaurantMenuCategoryResult;
import net.kodar.restaurantapi.presentation.service.ServiceGeneric;

@RestController
@RequestMapping("restaurantmenucategory")
public class RestaurantMenuCategoryService extends ServiceGeneric<RestaurantMenuCategoryParam, RestaurantMenuCategoryResult, Long, RestaurantMenuCategoryProcessorImpl>{

	@Override
	protected Long getId(RestaurantMenuCategoryParam param) {
		return param.getId();
	}}
