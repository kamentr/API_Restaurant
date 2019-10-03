package net.kodar.restaurantapi.business.processor.apiusergroup;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.reflections.ReflectionUtils;
import org.springframework.stereotype.Service;

import net.kodar.restaurantapi.business.processor.ProcessorGenericImpl;
import net.kodar.restaurantapi.business.transformer.param.apiusergroup.ApiUserGroupParamTransformer;
import net.kodar.restaurantapi.business.transformer.result.apiusergroup.ApiUserGroupResultTransformer;
import net.kodar.restaurantapi.business.validator.apiusergroup.ApiUserGroupValidatorImpl;
import net.kodar.restaurantapi.data.entities.ApiGroup;
import net.kodar.restaurantapi.data.entities.ApiUser;
import net.kodar.restaurantapi.data.entities.ApiUserGroup;
import net.kodar.restaurantapi.dataaccess.dao.apiusergroup.ApiUserGroupDaoImpl;
import net.kodar.restaurantapi.presentation.param.ApiUserGroupParam;
import net.kodar.restaurantapi.presentation.result.ApiUserGroupResult;
import net.kodar.restaurantapi.util.Utils;

@Service
public class ApiUserGroupProcessorImpl 
extends ProcessorGenericImpl<ApiUserGroupParam, ApiUserGroupResult, Long, ApiUserGroup, ApiUserGroupDaoImpl, ApiUserGroupParamTransformer, ApiUserGroupResultTransformer, ApiUserGroupValidatorImpl> implements ApiUserGroupProcessor{

	@Override
	public Long getID(ApiUserGroupParam param) {
		// TODO Auto-generated method stub
		return param.getId();
	}

	public List<ApiGroup> findByUser(ApiUser user) {
		

		List<ApiGroup> userGroups = new ArrayList<ApiGroup>();
		List<ApiUserGroup> storedUserGroups = this.dao.getAll();
		
		//List<ApiGroup> groups = new ArrayList<ApiGroup>();
//		try {
//			
//			groups = (List<ApiGroup>) Utils.filterListBy(storedUserGroups, user, new ApiGroup());
//			
//		} catch (NoSuchFieldException | SecurityException e) {
//			e.printStackTrace();
//		} catch (IllegalAccessException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		storedUserGroups.stream().filter(g -> g.getApiUser().getId().equals(user.getId())).forEach(g -> userGroups.add(g.getApiGroup()));
		
		return userGroups;  /*userGroups;*/
	}
	
}
