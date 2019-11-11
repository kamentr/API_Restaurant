package net.kodar.restaurantapi.business.processor.restaurantmenucategory;

import org.springframework.stereotype.Service;

import net.kodar.restaurantapi.business.processor.ProcessorGenericImpl;
import net.kodar.restaurantapi.business.transformer.param.restaurantmenucategory.RestaurantMenuCategoryParamTransformer;
import net.kodar.restaurantapi.business.transformer.result.restaurantmenucategory.RestaurantMenuCategoryResultTransformer;
import net.kodar.restaurantapi.business.validator.restaurantmenucategory.RestaurantMenuCategoryValidatorImpl;
import net.kodar.restaurantapi.data.entities.RestaurantMenuCategory;
import net.kodar.restaurantapi.dataaccess.dao.restaurantmenucategory.RestaurantMenuCategoryDaoImpl;
import net.kodar.restaurantapi.presentation.param.RestaurantMenuCategoryParam;
import net.kodar.restaurantapi.presentation.result.RestaurantMenuCategoryResult;

@Service
public class RestaurantMenuCategoryProcessorImpl extends ProcessorGenericImpl<RestaurantMenuCategoryParam, RestaurantMenuCategoryResult, Long, RestaurantMenuCategory, RestaurantMenuCategoryDaoImpl, RestaurantMenuCategoryParamTransformer, RestaurantMenuCategoryResultTransformer, RestaurantMenuCategoryValidatorImpl> implements RestaurantMenuCategoryProcessor{

	@Override
	public Long getID(RestaurantMenuCategoryParam param) {
		// TODO Auto-generated method stub
		return param.getId();
	}

}
