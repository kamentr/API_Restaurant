package net.kodar.restaurantapi.presentation.service.lifecyclestatus;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.kodar.restaurantapi.business.processor.lifecyclestatus.LifecycleStatusProcessorImpl;
import net.kodar.restaurantapi.presentation.param.LifecycleStatusParam;
import net.kodar.restaurantapi.presentation.result.LifecycleStatusResult;
import net.kodar.restaurantapi.presentation.service.ServiceGeneric;

@RestController
@RequestMapping("lifecyclestatus")
public class LifecycleStatusService
		extends ServiceGeneric<LifecycleStatusParam, LifecycleStatusResult, Long, LifecycleStatusProcessorImpl> {

	@Override
	protected Long getId(LifecycleStatusParam param) {
		return param.getId();
	}
}
