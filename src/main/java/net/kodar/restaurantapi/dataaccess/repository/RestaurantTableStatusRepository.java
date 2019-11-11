package net.kodar.restaurantapi.dataaccess.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import net.kodar.restaurantapi.data.entities.RestaurantTableStatus;

@Repository
public interface RestaurantTableStatusRepository extends CrudRepository<RestaurantTableStatus, Long>{

}
