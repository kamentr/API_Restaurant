package net.kodar.restaurantapi.business.processor.restauranttable;

import org.springframework.stereotype.Service;

import net.kodar.restaurantapi.business.processor.ProcessorGenericImpl;
import net.kodar.restaurantapi.business.transformer.param.restauranttable.RestaurantTableParamTransformer;
import net.kodar.restaurantapi.business.transformer.result.restauranttable.RestaurantTableResultTransformer;
import net.kodar.restaurantapi.business.validator.restauranttable.RestaurantTableValidator;
import net.kodar.restaurantapi.data.entities.RestaurantTable;
import net.kodar.restaurantapi.dataaccess.dao.restauranttable.RestaurantTableDaoImpl;
import net.kodar.restaurantapi.dataaccess.dao.restauranttablestatus.RestaurantTableStatusDaoImpl;
import net.kodar.restaurantapi.presentation.param.RestaurantTableParam;
import net.kodar.restaurantapi.presentation.result.RestaurantTableResult;

@Service
public class RestaurantTableProcessorImpl extends ProcessorGenericImpl<RestaurantTableParam, RestaurantTableResult, Long, RestaurantTable, RestaurantTableDaoImpl, RestaurantTableParamTransformer, RestaurantTableResultTransformer, RestaurantTableValidator>{

	@Override
	public Long getID(RestaurantTableParam param) {
		// TODO Auto-generated method stub
		return param.getId();
	}

}
