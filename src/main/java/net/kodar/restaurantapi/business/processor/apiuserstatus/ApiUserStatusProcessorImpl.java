package net.kodar.restaurantapi.business.processor.apiuserstatus;

import org.springframework.stereotype.Service;

import net.kodar.restaurantapi.business.processor.ProcessorGenericImpl;
import net.kodar.restaurantapi.business.transformer.param.apiuserstatus.ApiUserStatusParamTransformer;
import net.kodar.restaurantapi.business.transformer.result.apiuserstatus.ApiUserStatusResultTransformer;
import net.kodar.restaurantapi.business.validator.apiuserstatus.ApiUserStatusValidatorImpl;
import net.kodar.restaurantapi.data.entities.ApiUserStatus;
import net.kodar.restaurantapi.dataaccess.dao.apiuserstatus.ApiUserStatusDaoImpl;
import net.kodar.restaurantapi.presentation.param.ApiUserStatusParam;
import net.kodar.restaurantapi.presentation.result.ApiUserStatusResult;

@Service
public class ApiUserStatusProcessorImpl extends ProcessorGenericImpl<ApiUserStatusParam, ApiUserStatusResult, Long, ApiUserStatus, ApiUserStatusDaoImpl, ApiUserStatusParamTransformer, ApiUserStatusResultTransformer, ApiUserStatusValidatorImpl> implements ApiUserStatusProcessor{

	@Override
	public Long getID(ApiUserStatusParam param) {
		// TODO Auto-generated method stub
		return param.getId();
	}

}
