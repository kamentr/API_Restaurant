package net.kodar.restaurantapi.dataaccess.dao.productingredient;

import org.springframework.stereotype.Component;

import net.kodar.restaurantapi.data.entities.ProductIngredient;
import net.kodar.restaurantapi.dataaccess.dao.DaoGenericImpl;

@Component
public class ProductIngredientDaoImpl extends DaoGenericImpl<ProductIngredient, Long> implements ProductIngredientDao{

	@Override
	protected Long getId(ProductIngredient entity) {
		// TODO Auto-generated method stub
		return entity.getId();
	}

}
