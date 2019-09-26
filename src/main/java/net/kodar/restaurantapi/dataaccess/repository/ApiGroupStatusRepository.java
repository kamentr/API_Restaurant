package net.kodar.restaurantapi.dataaccess.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import net.kodar.restaurantapi.data.entities.ApiGroupStatus;

@Repository
public interface ApiGroupStatusRepository extends CrudRepository<ApiGroupStatus, Long>{

}
