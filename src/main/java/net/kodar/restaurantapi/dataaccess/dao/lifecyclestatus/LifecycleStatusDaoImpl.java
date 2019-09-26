package net.kodar.restaurantapi.dataaccess.dao.lifecyclestatus;

import org.springframework.stereotype.Component;

import net.kodar.restaurantapi.data.entities.LifecycleStatus;
import net.kodar.restaurantapi.dataaccess.dao.DaoGenericImpl;

@Component
public class LifecycleStatusDaoImpl extends DaoGenericImpl<LifecycleStatus, Long> implements LifecycleStatusDao{

	@Override
	protected Long getId(LifecycleStatus entity) {
		// TODO Auto-generated method stub
		return entity.getId();
	}

}
