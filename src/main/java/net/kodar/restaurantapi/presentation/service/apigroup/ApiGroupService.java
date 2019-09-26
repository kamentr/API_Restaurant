package net.kodar.restaurantapi.presentation.service.apigroup;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.kodar.restaurantapi.business.processor.apigroup.ApiGroupProcessorImpl;
import net.kodar.restaurantapi.presentation.param.ApiGroupParam;
import net.kodar.restaurantapi.presentation.result.ApiGroupResult;
import net.kodar.restaurantapi.presentation.service.ServiceGeneric;

@RestController
@RequestMapping("apigroup")
public class ApiGroupService extends ServiceGeneric<ApiGroupParam, ApiGroupResult, Long, ApiGroupProcessorImpl>{

	@Override
	protected Long getId(ApiGroupParam param) {
		return param.getId();
	}
}