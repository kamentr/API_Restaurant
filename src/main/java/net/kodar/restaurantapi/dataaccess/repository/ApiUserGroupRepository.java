package net.kodar.restaurantapi.dataaccess.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import net.kodar.restaurantapi.data.entities.ApiGroup;
import net.kodar.restaurantapi.data.entities.ApiUser;
import net.kodar.restaurantapi.data.entities.ApiUserGroup;

@Repository
public interface ApiUserGroupRepository extends CrudRepository<ApiUserGroup, Long>{
	List<ApiGroup> findByApiUser(ApiUser apiUser);
}
