package net.kodar.restaurantapi.business.transformer.param.orderstatus;

import org.springframework.stereotype.Component;

import net.kodar.restaurantapi.business.transformer.param.ParamTransformer;
import net.kodar.restaurantapi.data.entities.OrderStatus;
import net.kodar.restaurantapi.presentation.param.OrderStatusParam;
@Component
public class OrderStatusParamTransformer implements ParamTransformer<OrderStatusParam, OrderStatus, OrderStatus> {

	@Override
	public OrderStatus apply(OrderStatusParam param, OrderStatus entity) {
		if (entity == null) {
			entity = new OrderStatus();
			entity.setId(param.getId());
		}
		
		entity.setCode(param.getCode());
		entity.setDescription(param.getDescription());
		entity.setName(param.getName());		
		entity.setLocked(param.isLocked());

		return entity;
	}

}
