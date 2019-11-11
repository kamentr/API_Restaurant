package net.kodar.restaurantapi.business.processor.productstatus;

import org.springframework.stereotype.Service;

import net.kodar.restaurantapi.business.processor.ProcessorGenericImpl;
import net.kodar.restaurantapi.business.transformer.param.productstatus.ProductStatusParamTransformer;
import net.kodar.restaurantapi.business.transformer.result.productstatus.ProductStatusResultTransformer;
import net.kodar.restaurantapi.business.validator.productstatus.ProductStatusValidatorImpl;
import net.kodar.restaurantapi.data.entities.ProductStatus;
import net.kodar.restaurantapi.dataaccess.dao.productstatus.ProductStatusDaoImpl;
import net.kodar.restaurantapi.presentation.param.ProductStatusParam;
import net.kodar.restaurantapi.presentation.result.ProductStatusResult;

@Service
public class ProductStatusProcessorImpl extends ProcessorGenericImpl<ProductStatusParam, ProductStatusResult, Long, ProductStatus, ProductStatusDaoImpl, ProductStatusParamTransformer, ProductStatusResultTransformer, ProductStatusValidatorImpl> implements ProductStatusProcessor{

	@Override
	public Long getID(ProductStatusParam param) {
		// TODO Auto-generated method stub
		return param.getId();
	}

}
