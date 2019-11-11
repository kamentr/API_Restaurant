package net.kodar.restaurantapi.business.validator.productingredient;

import org.springframework.stereotype.Component;

import net.kodar.restaurantapi.business.validator.GenericValidatorImpl;
import net.kodar.restaurantapi.presentation.param.ProductIngredientParam;
@Component
public class ProductIngredientValidatorImpl extends GenericValidatorImpl<ProductIngredientParam> implements ProductIngredientValidator{

}
