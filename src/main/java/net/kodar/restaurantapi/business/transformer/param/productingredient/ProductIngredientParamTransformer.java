package net.kodar.restaurantapi.business.transformer.param.productingredient;

import org.springframework.stereotype.Component;

import net.kodar.restaurantapi.business.transformer.param.ParamTransformer;
import net.kodar.restaurantapi.data.entities.ProductIngredient;
import net.kodar.restaurantapi.presentation.param.ProductIngredientParam;
@Component
public class ProductIngredientParamTransformer implements ParamTransformer<ProductIngredientParam, ProductIngredient, ProductIngredient> {

	@Override
	public ProductIngredient apply(ProductIngredientParam param, ProductIngredient entity) {
		if (entity == null) {
			entity = new ProductIngredient();
			entity.setId(param.getId());
		}
		
		entity.setCode(param.getCode());
		entity.setDescription(param.getDescription());
		entity.setName(param.getName());		
		entity.setLocked(param.isLocked());
		
		entity.setIngredient(param.getIngredient());
		entity.setProduct(param.getProduct());

		return entity;
	}

}
