package net.kodar.restaurantapi.dataaccess.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import net.kodar.restaurantapi.data.entities.Ingredient;

@Repository
public interface IngredientRepository extends CrudRepository<Ingredient, Long>{

}
