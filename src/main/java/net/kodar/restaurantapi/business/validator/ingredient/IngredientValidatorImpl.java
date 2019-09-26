package net.kodar.restaurantapi.business.validator.ingredient;

import org.springframework.stereotype.Component;

import net.kodar.restaurantapi.business.validator.GenericValidatorImpl;
import net.kodar.restaurantapi.presentation.param.IngredientParam;
@Component
public class IngredientValidatorImpl extends GenericValidatorImpl<IngredientParam> implements IngredientValidator{

}
