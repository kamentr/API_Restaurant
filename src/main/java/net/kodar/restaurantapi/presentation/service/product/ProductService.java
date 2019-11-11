package net.kodar.restaurantapi.presentation.service.product;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.kodar.restaurantapi.business.processor.product.ProductProcessorImpl;
import net.kodar.restaurantapi.presentation.param.ProductParam;
import net.kodar.restaurantapi.presentation.result.ProductResult;
import net.kodar.restaurantapi.presentation.service.ServiceGeneric;

@RestController
@RequestMapping("product")
public class ProductService extends ServiceGeneric<ProductParam, ProductResult, Long, ProductProcessorImpl>{

	@Override
	protected Long getId(ProductParam param) {
		return param.getId();
	}}
