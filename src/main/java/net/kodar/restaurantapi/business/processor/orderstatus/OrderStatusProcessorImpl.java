package net.kodar.restaurantapi.business.processor.orderstatus;

import org.springframework.stereotype.Service;

import net.kodar.restaurantapi.business.processor.ProcessorGenericImpl;
import net.kodar.restaurantapi.business.transformer.param.orderstatus.OrderStatusParamTransformer;
import net.kodar.restaurantapi.business.transformer.result.orderstatus.OrderStatusResultTransformer;
import net.kodar.restaurantapi.business.validator.orderstatus.OrderStatusValidatorImpl;
import net.kodar.restaurantapi.data.entities.OrderStatus;
import net.kodar.restaurantapi.dataaccess.dao.orderstatus.OrderStatusDaoImpl;
import net.kodar.restaurantapi.presentation.param.OrderStatusParam;
import net.kodar.restaurantapi.presentation.result.OrderStatusResult;

@Service
public class OrderStatusProcessorImpl extends ProcessorGenericImpl<OrderStatusParam, OrderStatusResult, Long, OrderStatus, OrderStatusDaoImpl, OrderStatusParamTransformer, OrderStatusResultTransformer, OrderStatusValidatorImpl> implements OrderStatusProcessor{

	@Override
	public Long getID(OrderStatusParam param) {
		// TODO Auto-generated method stub
		return param.getId();
	}

}
