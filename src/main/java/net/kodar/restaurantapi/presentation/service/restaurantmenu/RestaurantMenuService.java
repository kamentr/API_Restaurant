package net.kodar.restaurantapi.presentation.service.restaurantmenu;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.kodar.restaurantapi.business.processor.restaurantmenu.RestaurantMenuProcessorImpl;
import net.kodar.restaurantapi.presentation.param.RestaurantMenuParam;
import net.kodar.restaurantapi.presentation.result.RestaurantMenuResult;
import net.kodar.restaurantapi.presentation.service.ServiceGeneric;

@RestController
@RequestMapping("restaurantmenu")
public class RestaurantMenuService extends ServiceGeneric<RestaurantMenuParam, RestaurantMenuResult, Long, RestaurantMenuProcessorImpl>{

	@Override
	protected Long getId(RestaurantMenuParam param) {
		return param.getId();
	}}
