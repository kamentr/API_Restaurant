package net.kodar.restaurantapi.dataaccess.dao.apisession;

import net.kodar.restaurantapi.data.entities.security.ApiSession;
import net.kodar.restaurantapi.dataaccess.dao.Dao;

public interface ApiSessionDao extends Dao<ApiSession, Integer>{

	ApiSession findByUsername(String username);
}
