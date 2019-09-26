package net.kodar.restaurantapi.business.validator.apigroup;

import org.springframework.stereotype.Component;

import net.kodar.restaurantapi.business.validator.GenericValidatorImpl;
import net.kodar.restaurantapi.presentation.param.ApiGroupParam;
@Component
public class ApiGroupValidatorImpl extends GenericValidatorImpl<ApiGroupParam> implements ApiGroupValidator{

}
