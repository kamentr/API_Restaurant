package net.kodar.restaurantapi.dataaccess.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import net.kodar.restaurantapi.data.entities.LifecycleStatus;

@Repository
public interface LifecycleStatusRepository extends CrudRepository<LifecycleStatus, Long>{

}
