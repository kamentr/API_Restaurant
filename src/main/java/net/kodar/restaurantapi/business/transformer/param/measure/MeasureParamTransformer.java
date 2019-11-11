package net.kodar.restaurantapi.business.transformer.param.measure;

import org.springframework.stereotype.Component;

import net.kodar.restaurantapi.business.transformer.param.ParamTransformer;
import net.kodar.restaurantapi.data.entities.Measure;
import net.kodar.restaurantapi.presentation.param.MeasureParam;
@Component
public class MeasureParamTransformer implements ParamTransformer<MeasureParam, Measure, Measure> {

	@Override
	public Measure apply(MeasureParam param, Measure entity) {
		if (entity == null) {
			entity = new Measure();
			entity.setId(param.getId());
		}

		entity.setCode(param.getCode());
		entity.setDescription(param.getDescription());
		entity.setName(param.getName());
		entity.setLocked(param.isLocked());

		entity.setMeasureUnit(param.getMeasureUnit());

		return entity;
	}
}
