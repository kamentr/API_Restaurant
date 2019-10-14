package net.kodar.restaurantapi.business.processor.apigroup;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.kodar.restaurantapi.business.processor.ProcessorGenericImpl;
import net.kodar.restaurantapi.business.transformer.param.apigroup.ApiGroupParamTransformer;
import net.kodar.restaurantapi.business.transformer.result.apigroup.ApiGroupResultTransformer;
import net.kodar.restaurantapi.business.validator.apigroup.ApiGroupValidatorImpl;
import net.kodar.restaurantapi.data.entities.ApiGroup;
import net.kodar.restaurantapi.data.entities.ApiUser;
import net.kodar.restaurantapi.data.entities.ApiUserGroup;
import net.kodar.restaurantapi.dataaccess.dao.apigroup.ApiGroupDaoImpl;
import net.kodar.restaurantapi.dataaccess.dao.apiuser.ApiUserDao;
import net.kodar.restaurantapi.dataaccess.dao.apiuser.ApiUserDaoImpl;
import net.kodar.restaurantapi.dataaccess.dao.apiusergroup.ApiUserGroupDaoImpl;
import net.kodar.restaurantapi.dataaccess.repository.ApiUserGroupRepository;
import net.kodar.restaurantapi.presentation.param.ApiGroupParam;
import net.kodar.restaurantapi.presentation.result.ApiGroupResult;

@Service
public class ApiGroupProcessorImpl extends 
ProcessorGenericImpl<ApiGroupParam, ApiGroupResult, Long, ApiGroup, ApiGroupDaoImpl, ApiGroupParamTransformer, ApiGroupResultTransformer, ApiGroupValidatorImpl>
implements ApiGroupProcessor{

	@Autowired
	private ApiUserGroupDaoImpl apiUserGroupDao;
	
	@Autowired
	private ApiUserGroupRepository repo; 
	
	@Autowired
	private ApiUserDaoImpl userDao;
	
	@Override
	public Long getID(ApiGroupParam param) {
		return param.getId();
	}

	public List<ApiGroup> findByUser(String username) {

		List<ApiGroup> userGroups = new ArrayList<ApiGroup>();
		List<ApiUserGroup> storedUserGroups = apiUserGroupDao.getAll();
		
		//userGroups = Utils.filterListBy(storedUserGroups, "apiUser", filterPredicate);

		storedUserGroups.stream().filter(g -> g.getApiUser().getUsername().equals(username))
				.forEach(g -> userGroups.add(g.getApiGroup()));

		return userGroups; 
	}

}
