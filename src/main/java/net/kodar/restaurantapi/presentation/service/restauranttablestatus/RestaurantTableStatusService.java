package net.kodar.restaurantapi.presentation.service.restauranttablestatus;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.kodar.restaurantapi.business.processor.restauranttablestatus.RestaurantTableStatusProcessorImpl;
import net.kodar.restaurantapi.presentation.param.RestaurantTableStatusParam;
import net.kodar.restaurantapi.presentation.result.RestaurantTableStatusResult;
import net.kodar.restaurantapi.presentation.service.ServiceGeneric;

@RestController
@RequestMapping("restauranttablestatus")
public class RestaurantTableStatusService extends ServiceGeneric<RestaurantTableStatusParam, RestaurantTableStatusResult, Long, RestaurantTableStatusProcessorImpl>{

	@Override
	protected Long getId(RestaurantTableStatusParam param) {
		// TODO Auto-generated method stub
		return param.getId();
	}

}
