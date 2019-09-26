package net.kodar.restaurantapi.presentation.service.apiusergroup;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.kodar.restaurantapi.business.processor.apiusergroup.ApiUserGroupProcessorImpl;
import net.kodar.restaurantapi.presentation.param.ApiUserGroupParam;
import net.kodar.restaurantapi.presentation.result.ApiUserGroupResult;
import net.kodar.restaurantapi.presentation.service.ServiceGeneric;

@RestController
@RequestMapping("apiusergroup")
public class ApiUserGroupService
		extends ServiceGeneric<ApiUserGroupParam, ApiUserGroupResult, Long, ApiUserGroupProcessorImpl> {

	@Override
	protected Long getId(ApiUserGroupParam param) {
		return param.getId();
	}
}
