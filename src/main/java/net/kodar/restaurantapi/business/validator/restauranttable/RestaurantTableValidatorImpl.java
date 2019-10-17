package net.kodar.restaurantapi.business.validator.restauranttable;

import org.springframework.stereotype.Component;

import net.kodar.restaurantapi.business.validator.GenericValidatorImpl;
import net.kodar.restaurantapi.presentation.param.RestaurantTableParam;

@Component
public class RestaurantTableValidatorImpl extends GenericValidatorImpl<RestaurantTableParam> implements RestaurantTableValidator{

}
