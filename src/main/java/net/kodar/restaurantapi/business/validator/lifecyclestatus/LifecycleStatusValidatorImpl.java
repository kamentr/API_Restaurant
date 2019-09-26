package net.kodar.restaurantapi.business.validator.lifecyclestatus;

import org.springframework.stereotype.Component;

import net.kodar.restaurantapi.business.validator.GenericValidatorImpl;
import net.kodar.restaurantapi.presentation.param.LifecycleStatusParam;
@Component
public class LifecycleStatusValidatorImpl extends GenericValidatorImpl<LifecycleStatusParam> implements LifecycleStatusValidator{

}
