package net.kodar.restaurantapi.business.processor.restaurantmenustatus;

import org.springframework.stereotype.Service;

import net.kodar.restaurantapi.business.processor.ProcessorGenericImpl;
import net.kodar.restaurantapi.business.transformer.param.restaurantmenustatus.RestaurantMenuStatusParamTransformer;
import net.kodar.restaurantapi.business.transformer.result.restaurantmenustatus.RestaurantMenuStatusResultTransformer;
import net.kodar.restaurantapi.business.validator.restaurantmenucategory.RestaurantMenuCategoryValidatorImpl;
import net.kodar.restaurantapi.data.entities.RestaurantMenuStatus;
import net.kodar.restaurantapi.dataaccess.dao.restaurantmenustatus.RestaurantMenuStatusDaoImpl;
import net.kodar.restaurantapi.presentation.param.RestaurantMenuStatusParam;
import net.kodar.restaurantapi.presentation.result.RestaurantMenuStatusResult;

@Service
public class RestaurantMenuStatusProcessorImpl extends ProcessorGenericImpl<
RestaurantMenuStatusParam,
RestaurantMenuStatusResult, Long, 
RestaurantMenuStatus, 
RestaurantMenuStatusDaoImpl, 
RestaurantMenuStatusParamTransformer, 
RestaurantMenuStatusResultTransformer,
RestaurantMenuCategoryValidatorImpl> implements RestaurantMenuStatusProcessor{

	@Override
	public Long getID(RestaurantMenuStatusParam param) {
		// TODO Auto-generated method stub
		return param.getId();
	}
}
