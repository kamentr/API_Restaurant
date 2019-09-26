package net.kodar.restaurantapi.business.processor.productingredient;

import org.springframework.stereotype.Service;

import net.kodar.restaurantapi.business.processor.ProcessorGenericImpl;
import net.kodar.restaurantapi.business.transformer.param.productingredient.ProductIngredientParamTransformer;
import net.kodar.restaurantapi.business.transformer.result.productingredient.ProductIngredientResultTransformer;
import net.kodar.restaurantapi.business.validator.productingredient.ProductIngredientValidatorImpl;
import net.kodar.restaurantapi.data.entities.ProductIngredient;
import net.kodar.restaurantapi.dataaccess.dao.productingredient.ProductIngredientDaoImpl;
import net.kodar.restaurantapi.presentation.param.ProductIngredientParam;
import net.kodar.restaurantapi.presentation.result.ProductIngredientResult;

@Service
public class ProductIngredientProcessorImpl extends ProcessorGenericImpl<ProductIngredientParam, ProductIngredientResult, Long, 
ProductIngredient, ProductIngredientDaoImpl, ProductIngredientParamTransformer, ProductIngredientResultTransformer, ProductIngredientValidatorImpl> implements ProductIngredientProcessor{

	@Override
	public Long getID(ProductIngredientParam param) {
		// TODO Auto-generated method stub
		return param.getId();
	}

}
