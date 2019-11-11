package net.kodar.restaurantapi.presentation.service.apiuser;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.kodar.restaurantapi.business.processor.apiuser.ApiUserProcessorImpl;
import net.kodar.restaurantapi.presentation.param.ApiUserParam;
import net.kodar.restaurantapi.presentation.result.ApiUserResult;
import net.kodar.restaurantapi.presentation.service.ServiceGeneric;

@RestController
@RequestMapping("/apiuser")
public class ApiUserService extends ServiceGeneric<ApiUserParam, ApiUserResult, Long, ApiUserProcessorImpl> {

	@Override
	protected Long getId(ApiUserParam param) {
		return param.getId();
	}
}
