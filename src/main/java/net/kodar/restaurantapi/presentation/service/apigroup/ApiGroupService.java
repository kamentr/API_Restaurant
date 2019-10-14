package net.kodar.restaurantapi.presentation.service.apigroup;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import net.kodar.restaurantapi.business.processor.apigroup.ApiGroupProcessorImpl;
import net.kodar.restaurantapi.data.entities.ApiGroup;
import net.kodar.restaurantapi.presentation.param.ApiGroupParam;
import net.kodar.restaurantapi.presentation.result.ApiGroupResult;
import net.kodar.restaurantapi.presentation.service.ServiceGeneric;

@RestController
@RequestMapping("apigroup")
public class ApiGroupService extends ServiceGeneric<ApiGroupParam, ApiGroupResult, Long, ApiGroupProcessorImpl>{

	
	@Override
	protected Long getId(ApiGroupParam param) {
		return param.getId();
	}
	
	@GetMapping("/byusername/{username}")
	public List<ApiGroup> findByUsername(@PathVariable(value = "username") String username){
		return this.processor.findByUser(username);
	}
}