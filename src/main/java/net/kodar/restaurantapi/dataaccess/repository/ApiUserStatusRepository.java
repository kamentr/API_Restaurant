package net.kodar.restaurantapi.dataaccess.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import net.kodar.restaurantapi.data.entities.ApiUserStatus;

@Repository
public interface ApiUserStatusRepository extends CrudRepository<ApiUserStatus, Long>{

}
