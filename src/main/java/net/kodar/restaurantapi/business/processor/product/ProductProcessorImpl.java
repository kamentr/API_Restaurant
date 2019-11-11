package net.kodar.restaurantapi.business.processor.product;

import org.springframework.stereotype.Service;

import net.kodar.restaurantapi.business.processor.ProcessorGenericImpl;
import net.kodar.restaurantapi.business.transformer.param.product.ProductParamTransformer;
import net.kodar.restaurantapi.business.transformer.result.product.ProductResultTransformer;
import net.kodar.restaurantapi.business.validator.product.ProductValidatorImpl;
import net.kodar.restaurantapi.data.entities.Product;
import net.kodar.restaurantapi.dataaccess.dao.product.ProductDaoImpl;
import net.kodar.restaurantapi.presentation.param.ProductParam;
import net.kodar.restaurantapi.presentation.result.ProductResult;

@Service
public class ProductProcessorImpl extends ProcessorGenericImpl<ProductParam, ProductResult, Long, Product, ProductDaoImpl, ProductParamTransformer, ProductResultTransformer, ProductValidatorImpl> implements ProductProcessor{

	@Override
	public Long getID(ProductParam param) {
		// TODO Auto-generated method stub
		return param.getId();
	}

}
