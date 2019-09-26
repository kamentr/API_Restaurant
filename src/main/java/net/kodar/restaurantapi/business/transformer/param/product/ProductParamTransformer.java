package net.kodar.restaurantapi.business.transformer.param.product;

import org.springframework.stereotype.Component;

import net.kodar.restaurantapi.business.transformer.param.ParamTransformer;
import net.kodar.restaurantapi.data.entities.Product;
import net.kodar.restaurantapi.presentation.param.ProductParam;
@Component
public class ProductParamTransformer implements ParamTransformer<ProductParam, Product, Product> {

	@Override
	public Product apply(ProductParam param, Product entity) {
		if (entity == null) {
			entity = new Product();
			entity.setId(param.getId());
		}
		
		entity.setCode(param.getCode());
		entity.setDescription(param.getDescription());
		entity.setName(param.getName());		
		entity.setLocked(param.isLocked());

		entity.setMeasure(param.getMeasure());
		entity.setPrice(param.getPrice());
		entity.setLifecycleStatus(param.getLifecycleStatus());
		entity.setProductStatus(param.getProductStatus());
		
		return entity;
	}

}
