package net.kodar.restaurantapi.business.processor.measure;

import org.springframework.stereotype.Service;

import net.kodar.restaurantapi.business.processor.ProcessorGenericImpl;
import net.kodar.restaurantapi.business.transformer.param.measure.MeasureParamTransformer;
import net.kodar.restaurantapi.business.transformer.result.measure.MeasureResultTransformer;
import net.kodar.restaurantapi.business.validator.measure.MeasureValidatorImpl;
import net.kodar.restaurantapi.data.entities.Measure;
import net.kodar.restaurantapi.dataaccess.dao.measure.MeasureDaoImpl;
import net.kodar.restaurantapi.presentation.param.MeasureParam;
import net.kodar.restaurantapi.presentation.result.MeasureResult;

@Service
public class MeasureProcessorImpl extends ProcessorGenericImpl<MeasureParam, MeasureResult, Long, Measure, MeasureDaoImpl, MeasureParamTransformer, MeasureResultTransformer, MeasureValidatorImpl> implements MeasureProcessor{

	@Override
	public Long getID(MeasureParam param) {
		// TODO Auto-generated method stub
		return param.getId();
	}

}
