package net.kodar.restaurantapi.business.validator.apiuser;

import org.springframework.stereotype.Component;

import net.kodar.restaurantapi.business.validator.GenericValidatorImpl;
import net.kodar.restaurantapi.presentation.param.ApiUserParam;
@Component
public class ApiUserValidatorImpl extends GenericValidatorImpl<ApiUserParam> implements ApiUserValidator{

}
