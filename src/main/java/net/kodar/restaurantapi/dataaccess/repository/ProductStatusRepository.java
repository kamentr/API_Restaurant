package net.kodar.restaurantapi.dataaccess.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import net.kodar.restaurantapi.data.entities.ProductStatus;

@Repository
public interface ProductStatusRepository extends CrudRepository<ProductStatus, Long>{
}
