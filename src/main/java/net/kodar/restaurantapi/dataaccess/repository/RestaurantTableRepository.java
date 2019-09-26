package net.kodar.restaurantapi.dataaccess.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import net.kodar.restaurantapi.data.entities.RestaurantTable;

@Repository
public interface RestaurantTableRepository extends CrudRepository<RestaurantTable, Long>{

}
