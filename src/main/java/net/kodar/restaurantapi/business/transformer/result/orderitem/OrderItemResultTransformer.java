package net.kodar.restaurantapi.business.transformer.result.orderitem;

import org.springframework.stereotype.Component;

import net.kodar.restaurantapi.business.transformer.result.ResultTransformer;
import net.kodar.restaurantapi.data.entities.OrderItem;
import net.kodar.restaurantapi.presentation.result.OrderItemResult;
@Component
public class OrderItemResultTransformer implements ResultTransformer<OrderItem, OrderItemResult> {

	@Override
	public OrderItemResult apply(OrderItem entity) {
		OrderItemResult result = new OrderItemResult();

		result.setId(entity.getId());
		result.setCode(entity.getCode());
		result.setDescription(entity.getDescription());
		result.setName(entity.getName());
		result.setLifecycleStatus(entity.getLifecycleStatus());

		
		return result;
	}

}
