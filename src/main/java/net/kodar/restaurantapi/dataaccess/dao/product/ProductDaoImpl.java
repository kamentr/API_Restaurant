package net.kodar.restaurantapi.dataaccess.dao.product;

import org.springframework.stereotype.Component;

import net.kodar.restaurantapi.data.entities.Product;
import net.kodar.restaurantapi.dataaccess.dao.DaoGenericImpl;

@Component
public class ProductDaoImpl extends DaoGenericImpl<Product, Long> implements ProductDao{

	@Override
	protected Long getId(Product entity) {
		// TODO Auto-generated method stub
		return entity.getId();
	}

}
