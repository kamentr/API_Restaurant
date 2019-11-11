package net.kodar.restaurantapi.presentation.service.apigroupstatus;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.kodar.restaurantapi.business.processor.apigroupstatus.ApiGroupStatusProcessorImpl;
import net.kodar.restaurantapi.presentation.param.ApiGroupStatusParam;
import net.kodar.restaurantapi.presentation.result.ApiGroupStatusResult;
import net.kodar.restaurantapi.presentation.service.ServiceGeneric;

@RestController
@RequestMapping("apigroupstatus")
public class ApiGroupStatusService
		extends ServiceGeneric<ApiGroupStatusParam, ApiGroupStatusResult, Long, ApiGroupStatusProcessorImpl> {

	@Override
	protected Long getId(ApiGroupStatusParam param) {
		return param.getId();
	}
}
