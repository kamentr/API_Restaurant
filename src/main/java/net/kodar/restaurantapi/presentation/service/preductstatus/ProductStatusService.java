package net.kodar.restaurantapi.presentation.service.preductstatus;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.kodar.restaurantapi.business.processor.productstatus.ProductStatusProcessorImpl;
import net.kodar.restaurantapi.presentation.param.ProductStatusParam;
import net.kodar.restaurantapi.presentation.result.ProductStatusResult;
import net.kodar.restaurantapi.presentation.service.ServiceGeneric;

@RestController
@RequestMapping("productstatus")
public class ProductStatusService extends ServiceGeneric<ProductStatusParam, ProductStatusResult, Long, ProductStatusProcessorImpl>{

	@Override
	protected Long getId(ProductStatusParam param) {
		return param.getId();
	}}
