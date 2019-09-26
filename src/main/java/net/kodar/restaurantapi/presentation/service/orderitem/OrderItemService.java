package net.kodar.restaurantapi.presentation.service.orderitem;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.kodar.restaurantapi.business.processor.orderitem.OrderItemProcessorImpl;
import net.kodar.restaurantapi.presentation.param.OrderItemParam;
import net.kodar.restaurantapi.presentation.result.OrderItemResult;
import net.kodar.restaurantapi.presentation.service.ServiceGeneric;

@RestController
@RequestMapping("orderitem")
public class OrderItemService extends ServiceGeneric<OrderItemParam, OrderItemResult, Long, OrderItemProcessorImpl> {

	@Override
	protected Long getId(OrderItemParam param) {
		return param.getId();
	}
}
