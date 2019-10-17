package net.kodar.restaurantapi.business.processor.apigroupstatus;

import org.springframework.stereotype.Service;

import net.kodar.restaurantapi.business.processor.ProcessorGenericImpl;
import net.kodar.restaurantapi.business.transformer.param.apigroupstatus.ApiGroupStatusParamTransformer;
import net.kodar.restaurantapi.business.transformer.result.apigroupstatus.ApiGroupStatusResultTransformer;
import net.kodar.restaurantapi.business.validator.apigroupstatus.ApiGroupStatusValidatorImpl;
import net.kodar.restaurantapi.data.entities.ApiGroupStatus;
import net.kodar.restaurantapi.dataaccess.dao.apigroupstatus.ApiGroupStatusDaoImpl;
import net.kodar.restaurantapi.presentation.param.ApiGroupStatusParam;
import net.kodar.restaurantapi.presentation.result.ApiGroupStatusResult;

@Service
public class ApiGroupStatusProcessorImpl extends ProcessorGenericImpl<
ApiGroupStatusParam, ApiGroupStatusResult, Long, ApiGroupStatus, ApiGroupStatusDaoImpl, ApiGroupStatusParamTransformer, ApiGroupStatusResultTransformer, ApiGroupStatusValidatorImpl> implements ApiGroupStatusProcessor{

	@Override
	public Long getID(ApiGroupStatusParam param) {
		return param.getId();
	}

}
