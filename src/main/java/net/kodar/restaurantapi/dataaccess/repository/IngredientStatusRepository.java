package net.kodar.restaurantapi.dataaccess.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import net.kodar.restaurantapi.data.entities.IngredientStatus;

@Repository
public interface IngredientStatusRepository extends CrudRepository<IngredientStatus, Long>{

}
