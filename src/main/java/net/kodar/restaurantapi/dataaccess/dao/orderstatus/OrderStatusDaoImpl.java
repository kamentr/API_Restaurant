package net.kodar.restaurantapi.dataaccess.dao.orderstatus;

import org.springframework.stereotype.Component;

import net.kodar.restaurantapi.data.entities.OrderStatus;
import net.kodar.restaurantapi.dataaccess.dao.DaoGenericImpl;

@Component
public class OrderStatusDaoImpl extends DaoGenericImpl<OrderStatus, Long> implements OrderStatusDao{

	@Override
	protected Long getId(OrderStatus entity) {
		// TODO Auto-generated method stub
		return entity.getId();
	}

}
