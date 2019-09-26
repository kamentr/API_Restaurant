package net.kodar.restaurantapi.business.processor.menuitem;


import org.springframework.stereotype.Service;

import net.kodar.restaurantapi.business.processor.ProcessorGenericImpl;
import net.kodar.restaurantapi.business.transformer.param.menuitem.MenuItemParamTransformer;
import net.kodar.restaurantapi.business.transformer.result.menuitem.MenuItemResultTransformer;
import net.kodar.restaurantapi.business.validator.menuitem.MenuItemValidatorImpl;
import net.kodar.restaurantapi.data.entities.MenuItem;
import net.kodar.restaurantapi.dataaccess.dao.menuitem.MenuItemDaoImpl;
import net.kodar.restaurantapi.presentation.param.MenuItemParam;
import net.kodar.restaurantapi.presentation.result.MenuItemResult;

@Service
public class MenuItemProcessorImpl extends ProcessorGenericImpl<MenuItemParam, MenuItemResult, Long, MenuItem, 
MenuItemDaoImpl, MenuItemParamTransformer, MenuItemResultTransformer, MenuItemValidatorImpl> implements MenuItemProcessor{

	@Override
	public Long getID(MenuItemParam param) {
		// TODO Auto-generated method stub
		return param.getId();
	}

}
