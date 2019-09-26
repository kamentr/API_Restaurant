package net.kodar.restaurantapi.business.validator.ingredientstatus;

import org.springframework.stereotype.Component;

import net.kodar.restaurantapi.business.validator.GenericValidatorImpl;
import net.kodar.restaurantapi.presentation.param.IngredientStatusParam;

@Component
public class IngredientStatusValidatorImpl extends GenericValidatorImpl<IngredientStatusParam> implements IngredientStatusValidator{

}
