package net.kodar.restaurantapi.business.transformer.param.menuitem;

import org.springframework.stereotype.Component;

import net.kodar.restaurantapi.business.transformer.param.ParamTransformer;
import net.kodar.restaurantapi.data.entities.MenuItem;
import net.kodar.restaurantapi.presentation.param.MenuItemParam;
@Component
public class MenuItemParamTransformer implements ParamTransformer<MenuItemParam, MenuItem, MenuItem> {

	@Override
	public MenuItem apply(MenuItemParam param, MenuItem entity) {
		if (entity == null) {
			entity = new MenuItem();
			entity.setId(param.getId());
		}
		
		entity.setCode(param.getCode());
		entity.setDescription(param.getDescription());
		entity.setName(param.getName());		
		entity.setLocked(param.isLocked());

		entity.setMeasure(param.getMeasure());
		entity.setPrice(param.getPrice());
		
		return entity;
	}

}
