package net.kodar.restaurantapi.business.validator.product;

import org.springframework.stereotype.Component;

import net.kodar.restaurantapi.business.validator.GenericValidatorImpl;
import net.kodar.restaurantapi.presentation.param.ProductParam;
@Component
public class ProductValidatorImpl extends GenericValidatorImpl<ProductParam> implements ProductValidator{

}
