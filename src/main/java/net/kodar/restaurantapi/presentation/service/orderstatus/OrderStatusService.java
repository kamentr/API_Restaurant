package net.kodar.restaurantapi.presentation.service.orderstatus;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.kodar.restaurantapi.business.processor.orderstatus.OrderStatusProcessorImpl;
import net.kodar.restaurantapi.presentation.param.OrderStatusParam;
import net.kodar.restaurantapi.presentation.result.OrderStatusResult;
import net.kodar.restaurantapi.presentation.service.ServiceGeneric;

@RestController
@RequestMapping("orderstatus")
public class OrderStatusService
		extends ServiceGeneric<OrderStatusParam, OrderStatusResult, Long, OrderStatusProcessorImpl> {

	@Override
	protected Long getId(OrderStatusParam param) {
		return param.getId();
	}
}
