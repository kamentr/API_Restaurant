package net.kodar.restaurantapi.presentation.service.menuitem;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.kodar.restaurantapi.business.processor.menuitem.MenuItemProcessorImpl;
import net.kodar.restaurantapi.presentation.param.MenuItemParam;
import net.kodar.restaurantapi.presentation.result.MenuItemResult;
import net.kodar.restaurantapi.presentation.service.ServiceGeneric;

@RestController
@RequestMapping("menuitem")
public class MenuItemService extends ServiceGeneric<MenuItemParam, MenuItemResult, Long, MenuItemProcessorImpl>{

	@Override
	protected Long getId(MenuItemParam param) {
		return param.getId();
	}}
