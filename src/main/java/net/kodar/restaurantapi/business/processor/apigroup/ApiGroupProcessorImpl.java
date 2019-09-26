package net.kodar.restaurantapi.business.processor.apigroup;

import java.util.List;

import org.springframework.stereotype.Service;

import net.kodar.restaurantapi.business.processor.ProcessorGenericImpl;
import net.kodar.restaurantapi.business.transformer.param.apigroup.ApiGroupParamTransformer;
import net.kodar.restaurantapi.business.transformer.result.apigroup.ApiGroupResultTransformer;
import net.kodar.restaurantapi.business.validator.apigroup.ApiGroupValidatorImpl;
import net.kodar.restaurantapi.data.entities.ApiGroup;
import net.kodar.restaurantapi.data.entities.ApiUser;
import net.kodar.restaurantapi.dataaccess.dao.apigroup.ApiGroupDaoImpl;
import net.kodar.restaurantapi.presentation.param.ApiGroupParam;
import net.kodar.restaurantapi.presentation.result.ApiGroupResult;

@Service
public class ApiGroupProcessorImpl extends 
ProcessorGenericImpl<ApiGroupParam, ApiGroupResult, Long, ApiGroup, ApiGroupDaoImpl, ApiGroupParamTransformer, ApiGroupResultTransformer, ApiGroupValidatorImpl>
implements ApiGroupProcessor{

	@Override
	public Long getID(ApiGroupParam param) {
		// TODO Auto-generated method stub
		return param.getId();
	}



}
