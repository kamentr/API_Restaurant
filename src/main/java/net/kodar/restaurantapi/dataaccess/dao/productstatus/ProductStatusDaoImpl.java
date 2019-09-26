package net.kodar.restaurantapi.dataaccess.dao.productstatus;

import org.springframework.stereotype.Component;

import net.kodar.restaurantapi.data.entities.ProductStatus;
import net.kodar.restaurantapi.dataaccess.dao.DaoGenericImpl;

@Component
public class ProductStatusDaoImpl extends DaoGenericImpl<ProductStatus, Long> implements ProductStatusDao{

	@Override
	protected Long getId(ProductStatus entity) {
		// TODO Auto-generated method stub
		return entity.getId();
	}

}
