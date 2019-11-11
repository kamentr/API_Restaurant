package net.kodar.restaurantapi.business.transformer.result.orderstatus;

import org.springframework.stereotype.Component;

import net.kodar.restaurantapi.business.transformer.result.ResultTransformer;
import net.kodar.restaurantapi.data.entities.OrderStatus;
import net.kodar.restaurantapi.presentation.result.OrderStatusResult;
@Component
public class OrderStatusResultTransformer implements ResultTransformer<OrderStatus, OrderStatusResult> {

	@Override
	public OrderStatusResult apply(OrderStatus entity) {
		OrderStatusResult result = new OrderStatusResult();

		result.setId(entity.getId());
		result.setCode(entity.getCode());
		result.setDescription(entity.getDescription());
		result.setName(entity.getName());

		
		return result;
	}

}
