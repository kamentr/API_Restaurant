package net.kodar.restaurantapi.business.validator.order;


import org.springframework.stereotype.Component;

import net.kodar.restaurantapi.business.validator.GenericValidatorImpl;
import net.kodar.restaurantapi.presentation.param.OrderParam;
@Component
public class OrderValidatorImpl extends GenericValidatorImpl<OrderParam> implements OrderValidator{

}
