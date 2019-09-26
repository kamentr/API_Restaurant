package net.kodar.restaurantapi.dataaccess.dao.order;

import org.springframework.stereotype.Component;

import net.kodar.restaurantapi.data.entities.Order;
import net.kodar.restaurantapi.dataaccess.dao.DaoGenericImpl;

@Component
public class OrderDaoImpl extends DaoGenericImpl<Order, Long> implements OrderDao{

	@Override
	protected Long getId(Order entity) {
		// TODO Auto-generated method stub
		return entity.getId();
	}

}
