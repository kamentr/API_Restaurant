package net.kodar.restaurantapi.presentation.service.apiuserstatus;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.kodar.restaurantapi.business.processor.apiuserstatus.ApiUserStatusProcessorImpl;
import net.kodar.restaurantapi.presentation.param.ApiUserStatusParam;
import net.kodar.restaurantapi.presentation.result.ApiUserStatusResult;
import net.kodar.restaurantapi.presentation.service.ServiceGeneric;

@RestController
@RequestMapping("apiuserstatus")
public class ApiUserStatusService
		extends ServiceGeneric<ApiUserStatusParam, ApiUserStatusResult, Long, ApiUserStatusProcessorImpl> {

	@Override
	protected Long getId(ApiUserStatusParam param) {
		return param.getId();
	}
}
