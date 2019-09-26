package net.kodar.restaurantapi.dataaccess.dao.measure;

import org.springframework.stereotype.Component;

import net.kodar.restaurantapi.data.entities.Measure;
import net.kodar.restaurantapi.dataaccess.dao.DaoGenericImpl;

@Component
public class MeasureDaoImpl extends DaoGenericImpl<Measure, Long> implements MeasureDao{

	@Override
	protected Long getId(Measure entity) {
		// TODO Auto-generated method stub
		return entity.getId();
	}

}
