package net.kodar.restaurantapi.dataaccess.dao.ingredientstatus;

import org.springframework.stereotype.Component;

import net.kodar.restaurantapi.data.entities.IngredientStatus;
import net.kodar.restaurantapi.dataaccess.dao.DaoGenericImpl;

@Component
public class IngredientStatusDaoImpl extends DaoGenericImpl<IngredientStatus, Long> implements IngredientStatusDao{

	@Override
	protected Long getId(IngredientStatus entity) {
		// TODO Auto-generated method stub
		return entity.getId();
	}

}
