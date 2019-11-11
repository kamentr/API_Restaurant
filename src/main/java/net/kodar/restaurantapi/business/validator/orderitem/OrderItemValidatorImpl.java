package net.kodar.restaurantapi.business.validator.orderitem;

import org.springframework.stereotype.Component;

import net.kodar.restaurantapi.business.validator.GenericValidatorImpl;
import net.kodar.restaurantapi.presentation.param.OrderItemParam;
@Component
public class OrderItemValidatorImpl extends GenericValidatorImpl<OrderItemParam> implements OrderItemValidator{

}
