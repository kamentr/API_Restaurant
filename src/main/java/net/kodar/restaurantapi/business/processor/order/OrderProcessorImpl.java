package net.kodar.restaurantapi.business.processor.order;


import org.springframework.stereotype.Service;

import net.kodar.restaurantapi.business.processor.ProcessorGenericImpl;
import net.kodar.restaurantapi.business.transformer.param.order.OrderParamTransformer;
import net.kodar.restaurantapi.business.transformer.result.order.OrderResultTransformer;
import net.kodar.restaurantapi.business.validator.order.OrderValidatorImpl;
import net.kodar.restaurantapi.data.entities.Order;
import net.kodar.restaurantapi.dataaccess.dao.order.OrderDaoImpl;
import net.kodar.restaurantapi.presentation.param.OrderParam;
import net.kodar.restaurantapi.presentation.result.OrderResult;

@Service
public class OrderProcessorImpl extends ProcessorGenericImpl<OrderParam, OrderResult, Long, Order, OrderDaoImpl, OrderParamTransformer, OrderResultTransformer, OrderValidatorImpl> implements OrderProcessor{

	@Override
	public Long getID(OrderParam param) {
		// TODO Auto-generated method stub
		return param.getId();
	}

}
