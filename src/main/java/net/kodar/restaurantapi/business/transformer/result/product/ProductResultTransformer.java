package net.kodar.restaurantapi.business.transformer.result.product;

import org.springframework.stereotype.Component;

import net.kodar.restaurantapi.business.transformer.result.ResultTransformer;
import net.kodar.restaurantapi.data.entities.Product;
import net.kodar.restaurantapi.presentation.result.ProductResult;
@Component
public class ProductResultTransformer implements ResultTransformer<Product, ProductResult> {

	@Override
	public ProductResult apply(Product entity) {
		ProductResult result = new ProductResult();

		result.setId(entity.getId());
		result.setCode(entity.getCode());
		result.setDescription(entity.getDescription());
		result.setName(entity.getName());
		result.setLifecycleStatus(entity.getLifecycleStatus());

		result.setMeasure(entity.getMeasure());
		result.setPrice(entity.getPrice());
		result.setProductStatus(entity.getProductStatus());
		
		return result;
	}

}
