package net.kodar.restaurantapi.presentation.service.measure;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.kodar.restaurantapi.business.processor.measure.MeasureProcessorImpl;
import net.kodar.restaurantapi.presentation.param.MeasureParam;
import net.kodar.restaurantapi.presentation.result.MeasureResult;
import net.kodar.restaurantapi.presentation.service.ServiceGeneric;

@RestController
@RequestMapping("measure")
public class MeasureService extends ServiceGeneric<MeasureParam, MeasureResult, Long, MeasureProcessorImpl> {

	@Override
	protected Long getId(MeasureParam param) {
		return param.getId();
	}
}
