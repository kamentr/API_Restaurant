package net.kodar.restaurantapi.business.processor.restauranttablestatus;

import org.springframework.stereotype.Service;

import net.kodar.restaurantapi.business.processor.ProcessorGenericImpl;
import net.kodar.restaurantapi.business.transformer.param.restauranttablestatus.RestaurantTableStatusParamTransformer;
import net.kodar.restaurantapi.business.transformer.result.restauranttablestatus.RestaurantTableStatusResultTransformer;
import net.kodar.restaurantapi.business.validator.restauranttablestatus.RestaurantTableStatusValidatorImpl;
import net.kodar.restaurantapi.data.entities.RestaurantTableStatus;
import net.kodar.restaurantapi.dataaccess.dao.restauranttablestatus.RestaurantTableStatusDaoImpl;
import net.kodar.restaurantapi.presentation.param.RestaurantTableStatusParam;
import net.kodar.restaurantapi.presentation.result.RestaurantTableStatusResult;

@Service
public class RestaurantTableStatusProcessorImpl extends ProcessorGenericImpl<RestaurantTableStatusParam, RestaurantTableStatusResult, Long, RestaurantTableStatus, RestaurantTableStatusDaoImpl, RestaurantTableStatusParamTransformer, RestaurantTableStatusResultTransformer, RestaurantTableStatusValidatorImpl> implements RestaurantTableStatusProcessor{

	@Override
	public Long getID(RestaurantTableStatusParam param) {
		// TODO Auto-generated method stub
		return param.getId();
	}
}
