package net.kodar.restaurantapi.dataaccess.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import net.kodar.restaurantapi.data.entities.security.ApiSession;

@Repository
public interface ApiSessionRepository extends CrudRepository<ApiSession, Integer> {
	ApiSession findByUsername(String username);
	ApiSession findByAuthToken(String authToken);
}
