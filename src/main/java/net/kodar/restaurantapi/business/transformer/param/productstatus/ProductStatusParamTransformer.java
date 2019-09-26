package net.kodar.restaurantapi.business.transformer.param.productstatus;

import org.springframework.stereotype.Component;

import net.kodar.restaurantapi.business.transformer.param.ParamTransformer;
import net.kodar.restaurantapi.data.entities.ProductStatus;
import net.kodar.restaurantapi.presentation.param.ProductStatusParam;
@Component
public class ProductStatusParamTransformer implements ParamTransformer<ProductStatusParam, ProductStatus, ProductStatus> {

	@Override
	public ProductStatus apply(ProductStatusParam param, ProductStatus entity) {
		if (entity == null) {
			entity = new ProductStatus();
			entity.setId(param.getId());
		}
		
		entity.setCode(param.getCode());
		entity.setDescription(param.getDescription());
		entity.setName(param.getName());		
		entity.setLocked(param.isLocked());

		return entity;
	}

}
