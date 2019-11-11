package net.kodar.restaurantapi.presentation.service.restaurantmenustatus;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.kodar.restaurantapi.business.processor.restaurantmenustatus.RestaurantMenuStatusProcessorImpl;
import net.kodar.restaurantapi.presentation.param.RestaurantMenuStatusParam;
import net.kodar.restaurantapi.presentation.result.RestaurantMenuStatusResult;
import net.kodar.restaurantapi.presentation.service.ServiceGeneric;

@RestController
@RequestMapping("restaurantmenustatus")
public class RestaurantMenuStatusService extends
		ServiceGeneric<RestaurantMenuStatusParam, RestaurantMenuStatusResult, Long, RestaurantMenuStatusProcessorImpl> {

	@Override
	protected Long getId(RestaurantMenuStatusParam param) {
		return param.getId();
	}
}
