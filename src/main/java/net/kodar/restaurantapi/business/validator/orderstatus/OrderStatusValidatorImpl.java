package net.kodar.restaurantapi.business.validator.orderstatus;

import org.springframework.stereotype.Component;

import net.kodar.restaurantapi.business.validator.GenericValidatorImpl;
import net.kodar.restaurantapi.presentation.param.OrderStatusParam;
@Component
public class OrderStatusValidatorImpl extends GenericValidatorImpl<OrderStatusParam> implements OrderStatusValidator{

}
