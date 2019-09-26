package net.kodar.restaurantapi.business.processor.lifecyclestatus;

import org.springframework.stereotype.Service;

import net.kodar.restaurantapi.business.processor.ProcessorGenericImpl;
import net.kodar.restaurantapi.business.transformer.param.lifecyclestatus.LifecycleStatusParamTransformer;
import net.kodar.restaurantapi.business.transformer.result.lifecyclestatus.LifecycleStatusResultTransformer;
import net.kodar.restaurantapi.business.validator.lifecyclestatus.LifecycleStatusValidatorImpl;
import net.kodar.restaurantapi.data.entities.LifecycleStatus;
import net.kodar.restaurantapi.dataaccess.dao.lifecyclestatus.LifecycleStatusDaoImpl;
import net.kodar.restaurantapi.presentation.param.LifecycleStatusParam;
import net.kodar.restaurantapi.presentation.result.LifecycleStatusResult;

@Service
public class LifecycleStatusProcessorImpl extends ProcessorGenericImpl<LifecycleStatusParam, LifecycleStatusResult, Long, LifecycleStatus, LifecycleStatusDaoImpl, LifecycleStatusParamTransformer, LifecycleStatusResultTransformer, LifecycleStatusValidatorImpl> implements LifecycleStatusProcessor{

	@Override
	public Long getID(LifecycleStatusParam param) {
		// TODO Auto-generated method stub
		return param.getId();
	}

}
