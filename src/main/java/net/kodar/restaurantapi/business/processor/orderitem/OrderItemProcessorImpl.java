package net.kodar.restaurantapi.business.processor.orderitem;

import org.springframework.stereotype.Service;

import net.kodar.restaurantapi.business.processor.ProcessorGenericImpl;
import net.kodar.restaurantapi.business.transformer.param.orderitem.OrderItemParamTransformer;
import net.kodar.restaurantapi.business.transformer.result.orderitem.OrderItemResultTransformer;
import net.kodar.restaurantapi.business.validator.orderitem.OrderItemValidatorImpl;
import net.kodar.restaurantapi.data.entities.OrderItem;
import net.kodar.restaurantapi.dataaccess.dao.orderitem.OrderItemDaoImpl;
import net.kodar.restaurantapi.presentation.param.OrderItemParam;
import net.kodar.restaurantapi.presentation.result.OrderItemResult;

@Service
public class OrderItemProcessorImpl extends ProcessorGenericImpl<OrderItemParam, OrderItemResult, Long, OrderItem, OrderItemDaoImpl, OrderItemParamTransformer, OrderItemResultTransformer, OrderItemValidatorImpl> implements OrderItemProcessor{

	@Override
	public Long getID(OrderItemParam param) {
		// TODO Auto-generated method stub
		return param.getId();
	}

}
