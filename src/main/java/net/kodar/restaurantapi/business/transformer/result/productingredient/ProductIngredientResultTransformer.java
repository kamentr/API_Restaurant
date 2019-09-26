package net.kodar.restaurantapi.business.transformer.result.productingredient;

import org.springframework.stereotype.Component;

import net.kodar.restaurantapi.business.transformer.result.ResultTransformer;
import net.kodar.restaurantapi.data.entities.ProductIngredient;
import net.kodar.restaurantapi.presentation.result.ProductIngredientResult;
@Component
public class ProductIngredientResultTransformer implements ResultTransformer<ProductIngredient, ProductIngredientResult> {

	@Override
	public ProductIngredientResult apply(ProductIngredient entity) {
		ProductIngredientResult result = new ProductIngredientResult();

		result.setId(entity.getId());
		result.setCode(entity.getCode());
		result.setDescription(entity.getDescription());
		result.setName(entity.getName());

		result.setProduct(entity.getProduct());
		result.setIngredient(entity.getIngredient());
		
		return result;
	}

}
