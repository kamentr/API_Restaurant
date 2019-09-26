package net.kodar.restaurantapi.business.transformer.param.order;

import org.springframework.stereotype.Component;

import net.kodar.restaurantapi.business.transformer.param.ParamTransformer;
import net.kodar.restaurantapi.data.entities.Order;
import net.kodar.restaurantapi.presentation.param.OrderParam;
@Component
public class OrderParamTransformer implements ParamTransformer<OrderParam, Order, Order> {

	@Override
	public Order apply(OrderParam param, Order entity) {
		if (entity == null) {
			entity = new Order();
			entity.setId(param.getId());
		}
		
		entity.setCode(param.getCode());
		entity.setDescription(param.getDescription());
		entity.setName(param.getName());		
		entity.setLocked(param.isLocked());

		entity.setLifecycleStatus(param.getLifecycleStatus());
		entity.setOrderStatus(param.getOrderStatus());
		
		return entity;
	}

}
