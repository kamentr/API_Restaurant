package net.kodar.restaurantapi.dataaccess.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import net.kodar.restaurantapi.data.entities.RestaurantMenu;

@Repository
public interface RestaurantMenuRepository extends CrudRepository<RestaurantMenu, Long>{

}
