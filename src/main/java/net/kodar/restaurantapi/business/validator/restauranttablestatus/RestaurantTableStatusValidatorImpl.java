package net.kodar.restaurantapi.business.validator.restauranttablestatus;

import org.springframework.stereotype.Component;

import net.kodar.restaurantapi.business.validator.GenericValidatorImpl;
import net.kodar.restaurantapi.presentation.param.RestaurantTableStatusParam;

@Component
public class RestaurantTableStatusValidatorImpl extends GenericValidatorImpl<RestaurantTableStatusParam> implements RestaurantTableStatusValidator{

}
