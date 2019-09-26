package net.kodar.restaurantapi.business.transformer.result.menuitem;

import org.springframework.stereotype.Component;

import net.kodar.restaurantapi.business.transformer.result.ResultTransformer;
import net.kodar.restaurantapi.data.entities.MenuItem;
import net.kodar.restaurantapi.presentation.result.MenuItemResult;
@Component
public class MenuItemResultTransformer implements ResultTransformer<MenuItem, MenuItemResult> {

	@Override
	public MenuItemResult apply(MenuItem entity) {
		MenuItemResult result = new MenuItemResult();

		result.setId(entity.getId());
		result.setCode(entity.getCode());
		result.setDescription(entity.getDescription());
		result.setName(entity.getName());

		result.setPrice(entity.getPrice());
		result.setMeasure(entity.getMeasure());
		
		return result;
	}

}
