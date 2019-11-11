package net.kodar.restaurantapi.business.transformer.param.orderitem;

import org.springframework.stereotype.Component;

import net.kodar.restaurantapi.business.transformer.param.ParamTransformer;
import net.kodar.restaurantapi.data.entities.OrderItem;
import net.kodar.restaurantapi.presentation.param.OrderItemParam;
@Component
public class OrderItemParamTransformer implements ParamTransformer<OrderItemParam, OrderItem, OrderItem> {

	@Override
	public OrderItem apply(OrderItemParam param, OrderItem entity) {
		if (entity == null) {
			entity = new OrderItem();
			entity.setId(param.getId());
		}
		
		entity.setCode(param.getCode());
		entity.setDescription(param.getDescription());
		entity.setName(param.getName());		
		entity.setLocked(param.isLocked());

		entity.setPrice(param.getPrice());
		entity.setQuantity(param.getQuantitty());
		entity.setProduct(param.getProduct());
		
		return entity;
	}

}
