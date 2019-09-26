package net.kodar.restaurantapi.business.validator.menuitem;

import org.springframework.stereotype.Component;

import net.kodar.restaurantapi.business.validator.GenericValidatorImpl;
import net.kodar.restaurantapi.presentation.param.MenuItemParam;
@Component
public class MenuItemValidatorImpl extends GenericValidatorImpl<MenuItemParam> implements MenuItemValidator{

}
