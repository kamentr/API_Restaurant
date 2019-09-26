package net.kodar.restaurantapi.dataaccess.dao.ingredient;

import org.springframework.stereotype.Component;

import net.kodar.restaurantapi.data.entities.Ingredient;
import net.kodar.restaurantapi.dataaccess.dao.DaoGenericImpl;

@Component
public class IngredientDaoImpl extends DaoGenericImpl<Ingredient, Long> implements IngredientDao{

	@Override
	protected Long getId(Ingredient entity) {
		// TODO Auto-generated method stub
		return entity.getId();
	}

}
