package net.kodar.restaurantapi.business.processor.apiuser;

import org.springframework.stereotype.Service;

import net.kodar.restaurantapi.business.processor.ProcessorGenericImpl;
import net.kodar.restaurantapi.business.transformer.param.apiuser.ApiUserParamTransformer;
import net.kodar.restaurantapi.business.transformer.result.apiuser.ApiUserResultTransformer;
import net.kodar.restaurantapi.business.validator.apiuser.ApiUserValidatorImpl;
import net.kodar.restaurantapi.data.entities.ApiUser;
import net.kodar.restaurantapi.dataaccess.dao.apiuser.ApiUserDaoImpl;
import net.kodar.restaurantapi.presentation.param.ApiUserParam;
import net.kodar.restaurantapi.presentation.result.ApiUserResult;

@Service
public class ApiUserProcessorImpl extends 
ProcessorGenericImpl<ApiUserParam,
ApiUserResult, Long, ApiUser, ApiUserDaoImpl, ApiUserParamTransformer, ApiUserResultTransformer, ApiUserValidatorImpl> implements ApiUserProcessor{

	@Override
	public Long getID(ApiUserParam param) {
		// TODO Auto-generated method stub
		return param.getId();
	}

}
