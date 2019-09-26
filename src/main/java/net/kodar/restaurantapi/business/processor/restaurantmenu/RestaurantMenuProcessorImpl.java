package net.kodar.restaurantapi.business.processor.restaurantmenu;

import org.springframework.stereotype.Service;

import net.kodar.restaurantapi.business.processor.ProcessorGenericImpl;
import net.kodar.restaurantapi.business.transformer.param.restaurantmenu.RestaurantMenuParamTransformer;
import net.kodar.restaurantapi.business.transformer.result.restaurantmenu.RestaurantMenuResultTransformer;
import net.kodar.restaurantapi.business.validator.restaurantmenu.RestaurantMenuValidatorImpl;
import net.kodar.restaurantapi.data.entities.RestaurantMenu;
import net.kodar.restaurantapi.dataaccess.dao.restaurantmenu.RestaurantMenuDaoImpl;
import net.kodar.restaurantapi.presentation.param.RestaurantMenuParam;
import net.kodar.restaurantapi.presentation.result.RestaurantMenuResult;

@Service
public class RestaurantMenuProcessorImpl extends ProcessorGenericImpl<RestaurantMenuParam, RestaurantMenuResult, Long, RestaurantMenu, RestaurantMenuDaoImpl, RestaurantMenuParamTransformer, RestaurantMenuResultTransformer, RestaurantMenuValidatorImpl> implements RestaurantMenuProcessor{

	@Override
	public Long getID(RestaurantMenuParam param) {
		// TODO Auto-generated method stub
		return param.getId();
	}

}
