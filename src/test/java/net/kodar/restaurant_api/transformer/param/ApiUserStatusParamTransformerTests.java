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
import net.kodar.restaurantapi.business.transformer.param.apiuserstatus.ApiUserStatusParamTransformer;
import net.kodar.restaurantapi.data.entities.ApiUserStatus;
import net.kodar.restaurantapi.presentation.param.ApiUserStatusParam;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RestaurantApiApplication.class)
@ActiveProfiles("test")
@Configuration
public class ApiUserStatusParamTransformerTests {

	@Autowired
	private ApiUserStatusParamTransformer ptr;
	
	private static ApiUserStatus VALID_API_USER_STATUS = null;
	
	private static ApiUserStatusParam PARAM_API_USER_STATUS = null;
	
	@Before	public void setUp() {
		VALID_API_USER_STATUS = new ApiUserStatus();
		PARAM_API_USER_STATUS = new ApiUserStatusParam();
	}
	
	@Test
	public void apply_whenGivenValidApiUserStatus_ShouldReturnApiUserStatus(){
		ApiUserStatus result = ptr.apply(PARAM_API_USER_STATUS, VALID_API_USER_STATUS);
		
		assertEquals(result, VALID_API_USER_STATUS);
	}
	
	@Test
	public void apply_whenGivenNull_ShouldReturnNewApiUserStatus(){
		ApiUserStatus result = ptr.apply(PARAM_API_USER_STATUS, null);
		
		assertEquals(result, VALID_API_USER_STATUS);
	}
}
