package net.kodar.restaurantapi.dataaccess.dao.menuitem;

import org.springframework.stereotype.Component;

import net.kodar.restaurantapi.data.entities.MenuItem;
import net.kodar.restaurantapi.dataaccess.dao.DaoGenericImpl;

@Component
public class MenuItemDaoImpl extends DaoGenericImpl<MenuItem, Long> implements MenuItemDao{

	@Override
	protected Long getId(MenuItem entity) {
		// TODO Auto-generated method stub
		return entity.getId();
	}

}
