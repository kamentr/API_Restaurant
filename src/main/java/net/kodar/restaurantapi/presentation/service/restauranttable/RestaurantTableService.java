package net.kodar.restaurantapi.presentation.service.restauranttable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.kodar.restaurantapi.business.processor.restauranttable.RestaurantTableProcessorImpl;
import net.kodar.restaurantapi.presentation.param.RestaurantTableParam;
import net.kodar.restaurantapi.presentation.result.RestaurantTableResult;
import net.kodar.restaurantapi.presentation.service.ServiceGeneric;

@RestController
@RequestMapping("restauranttable")
public class RestaurantTableService extends ServiceGeneric<RestaurantTableParam, RestaurantTableResult, Long, RestaurantTableProcessorImpl>{

	@Override
	protected Long getId(RestaurantTableParam param) {
		// TODO Auto-generated method stub
		return param.getId();
	}

}
