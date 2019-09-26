package net.kodar.restaurantapi.dataaccess.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import net.kodar.restaurantapi.data.entities.RestaurantMenuStatus;

@Repository
public interface RestaurantMenuStatusRepository extends CrudRepository<RestaurantMenuStatus, Long>{

}
