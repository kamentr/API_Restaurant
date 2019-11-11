package net.kodar.restaurantapi.business.transformer.result.measure;

import org.springframework.stereotype.Component;

import net.kodar.restaurantapi.business.transformer.result.ResultTransformer;
import net.kodar.restaurantapi.data.entities.Measure;
import net.kodar.restaurantapi.presentation.result.MeasureResult;
@Component
public class MeasureResultTransformer implements ResultTransformer<Measure, MeasureResult> {

	@Override
	public MeasureResult apply(Measure entity) {
		MeasureResult result = new MeasureResult();

		result.setId(entity.getId());
		result.setCode(entity.getCode());
		result.setDescription(entity.getDescription());
		result.setName(entity.getName());

		result.setMeasureUnit(entity.getMeasureUnit());
		
		return result;
	}

}
