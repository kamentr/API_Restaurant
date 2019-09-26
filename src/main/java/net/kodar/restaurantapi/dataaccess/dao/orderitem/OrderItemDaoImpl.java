package net.kodar.restaurantapi.dataaccess.dao.orderitem;

import org.springframework.stereotype.Component;

import net.kodar.restaurantapi.data.entities.OrderItem;
import net.kodar.restaurantapi.dataaccess.dao.DaoGenericImpl;

@Component
public class OrderItemDaoImpl extends DaoGenericImpl<OrderItem, Long> implements OrderItemDao{

	@Override
	protected Long getId(OrderItem entity) {
		// TODO Auto-generated method stub
		return entity.getId();
	}

}
