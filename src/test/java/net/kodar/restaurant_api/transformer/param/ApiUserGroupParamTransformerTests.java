package net.kodar.restaurant_api.transformer.param;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import net.kodar.restaurantapi.RestaurantApiApplication;
import net.kodar.restaurantapi.business.transformer.param.apiusergroup.ApiUserGroupParamTransformer;
import net.kodar.restaurantapi.data.entities.ApiUserGroup;
import net.kodar.restaurantapi.presentation.param.ApiUserGroupParam;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RestaurantApiApplication.class)
@ActiveProfiles("test")
@Configuration
public class ApiUserGroupParamTransformerTests {

	@Autowired
	private ApiUserGroupParamTransformer ptr;
	
	private static ApiUserGroup VALID_API_USER_GROUP = null;
	
	private static ApiUserGroupParam PARAM_API_USER_GROUP = null;
	
	@Before
	public void setUp() {
		VALID_API_USER_GROUP = new ApiUserGroup();
		PARAM_API_USER_GROUP = new ApiUserGroupParam();
	}
	
	@Test
	public void apply_whenGivenValidApiUserGroup_ShouldReturnApiUserGroup(){
		ApiUserGroup result = ptr.apply(PARAM_API_USER_GROUP, VALID_API_USER_GROUP);
		
		assertEquals(result, VALID_API_USER_GROUP);
	}
	
	@Test
	public void apply_whenGivenNull_ShouldReturnNewApiUserGroup(){
		ApiUserGroup result = ptr.apply(PARAM_API_USER_GROUP, null);
		
		assertEquals(result, VALID_API_USER_GROUP);
	}

}
