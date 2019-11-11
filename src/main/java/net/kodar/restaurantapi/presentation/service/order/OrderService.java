package net.kodar.restaurantapi.presentation.service.order;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.kodar.restaurantapi.business.processor.order.OrderProcessorImpl;
import net.kodar.restaurantapi.presentation.param.OrderParam;
import net.kodar.restaurantapi.presentation.result.OrderResult;
import net.kodar.restaurantapi.presentation.service.ServiceGeneric;

@RestController
@RequestMapping("order")
public class OrderService extends ServiceGeneric<OrderParam, OrderResult, Long, OrderProcessorImpl> {

	@Override
	protected Long getId(OrderParam param) {
		return param.getId();
	}
}
