package net.kodar.restaurantapi.business.processor.order;

import net.kodar.restaurantapi.business.processor.Processor;
import net.kodar.restaurantapi.presentation.param.OrderParam;
import net.kodar.restaurantapi.presentation.result.OrderResult;

public interface OrderProcessor extends Processor<OrderParam, OrderResult, Long>{

}
