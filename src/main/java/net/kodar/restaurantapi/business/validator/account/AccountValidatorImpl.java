package net.kodar.restaurantapi.business.validator.account;

import org.springframework.stereotype.Component;

import net.kodar.restaurantapi.business.validator.GenericValidatorImpl;
import net.kodar.restaurantapi.presentation.param.AccountParam;
@Component
public class AccountValidatorImpl extends GenericValidatorImpl<AccountParam> implements AccountValidator{

}	
