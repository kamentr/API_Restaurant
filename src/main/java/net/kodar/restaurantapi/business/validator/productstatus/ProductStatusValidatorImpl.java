package net.kodar.restaurantapi.business.validator.productstatus;

import org.springframework.stereotype.Component;

import net.kodar.restaurantapi.business.validator.GenericValidatorImpl;
import net.kodar.restaurantapi.presentation.param.ProductStatusParam;
@Component
public class ProductStatusValidatorImpl extends GenericValidatorImpl<ProductStatusParam> implements ProductStatusValidator{

}
