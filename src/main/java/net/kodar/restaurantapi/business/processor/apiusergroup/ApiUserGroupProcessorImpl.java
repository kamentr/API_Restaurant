package net.kodar.restaurantapi.business.processor.apiusergroup;

import org.springframework.stereotype.Service;

import net.kodar.restaurantapi.business.processor.ProcessorGenericImpl;
import net.kodar.restaurantapi.business.transformer.param.apiusergroup.ApiUserGroupParamTransformer;
import net.kodar.restaurantapi.business.transformer.result.apiusergroup.ApiUserGroupResultTransformer;
import net.kodar.restaurantapi.business.validator.apiusergroup.ApiUserGroupValidatorImpl;
import net.kodar.restaurantapi.data.entities.ApiUserGroup;
import net.kodar.restaurantapi.dataaccess.dao.apiusergroup.ApiUserGroupDaoImpl;
import net.kodar.restaurantapi.presentation.param.ApiUserGroupParam;
import net.kodar.restaurantapi.presentation.result.ApiUserGroupResult;

@Service
public class ApiUserGroupProcessorImpl extends
		ProcessorGenericImpl<ApiUserGroupParam, ApiUserGroupResult, Long, ApiUserGroup, ApiUserGroupDaoImpl, ApiUserGroupParamTransformer, ApiUserGroupResultTransformer, ApiUserGroupValidatorImpl>
		implements ApiUserGroupProcessor {

	@Override
	public Long getID(ApiUserGroupParam param) {
		// TODO Auto-generated method stub
		return param.getId();
	}

}
