package net.kodar.restaurantapi.business.transformer.result.productstatus;

import org.springframework.stereotype.Component;

import net.kodar.restaurantapi.business.transformer.result.ResultTransformer;
import net.kodar.restaurantapi.data.entities.ProductStatus;
import net.kodar.restaurantapi.presentation.result.ProductStatusResult;
@Component
public class ProductStatusResultTransformer implements ResultTransformer<ProductStatus, ProductStatusResult> {

	@Override
	public ProductStatusResult apply(ProductStatus entity) {
		ProductStatusResult result = new ProductStatusResult();

		result.setId(entity.getId());
		result.setCode(entity.getCode());
		result.setDescription(entity.getDescription());
		result.setName(entity.getName());
		
		return result;
	}

}
