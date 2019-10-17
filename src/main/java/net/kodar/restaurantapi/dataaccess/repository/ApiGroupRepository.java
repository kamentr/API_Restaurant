package net.kodar.restaurantapi.dataaccess.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import net.kodar.restaurantapi.data.entities.ApiGroup;

@Repository
public interface ApiGroupRepository extends CrudRepository<ApiGroup, Long> {

	//List<ApiGroup> findByApiUser(ApiUser user);
}
