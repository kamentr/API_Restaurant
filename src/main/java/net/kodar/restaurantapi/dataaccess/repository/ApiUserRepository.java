package net.kodar.restaurantapi.dataaccess.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import net.kodar.restaurantapi.data.entities.ApiUser;

@Repository
public interface ApiUserRepository extends CrudRepository<ApiUser, Long>{

	ApiUser findByUsername(String username);

}
