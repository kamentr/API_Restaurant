package net.kodar.restaurantapi.business.processor.ingredientstatus;

import org.springframework.stereotype.Service;

import net.kodar.restaurantapi.business.processor.ProcessorGenericImpl;
import net.kodar.restaurantapi.business.transformer.param.ingredientstatus.IngredientStatusParamTransformer;
import net.kodar.restaurantapi.business.transformer.result.ingredientstatus.IngredientStatusResultTransformer;
import net.kodar.restaurantapi.business.validator.ingredientstatus.IngredientStatusValidatorImpl;
import net.kodar.restaurantapi.data.entities.IngredientStatus;
import net.kodar.restaurantapi.dataaccess.dao.ingredientstatus.IngredientStatusDaoImpl;
import net.kodar.restaurantapi.presentation.param.IngredientStatusParam;
import net.kodar.restaurantapi.presentation.result.IngredientStatusResult;

@Service
public class IngredientStatusProcessorImpl extends ProcessorGenericImpl<IngredientStatusParam, IngredientStatusResult, 
Long, IngredientStatus, IngredientStatusDaoImpl, IngredientStatusParamTransformer, IngredientStatusResultTransformer, IngredientStatusValidatorImpl> implements IngredientStatusProcessor{

	@Override
	public Long getID(IngredientStatusParam param) {
		// TODO Auto-generated method stub
		return param.getId();
	}

}
