package net.kodar.restaurantapi.business.transformer.result.order;

import org.springframework.stereotype.Component;

import net.kodar.restaurantapi.business.transformer.result.ResultTransformer;
import net.kodar.restaurantapi.data.entities.Order;
import net.kodar.restaurantapi.presentation.result.OrderResult;
@Component
public class OrderResultTransformer implements ResultTransformer<Order, OrderResult> {

	@Override
	public OrderResult apply(Order entity) {
		OrderResult result = new OrderResult();

		result.setId(entity.getId());
		result.setCode(entity.getCode());
		result.setDescription(entity.getDescription());
		result.setName(entity.getName());
		result.setLifecycleStatus(entity.getLifecycleStatus());

		result.setOrderStatus(entity.getOrderStatus());
		
		return result;
	}

}
