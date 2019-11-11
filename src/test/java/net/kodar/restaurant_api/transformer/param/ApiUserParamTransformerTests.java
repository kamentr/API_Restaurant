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
import net.kodar.restaurantapi.business.transformer.param.apiuser.ApiUserParamTransformer;
import net.kodar.restaurantapi.data.entities.ApiUser;
import net.kodar.restaurantapi.presentation.param.ApiUserParam;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RestaurantApiApplication.class)
@ActiveProfiles("test")
@Configuration
public class ApiUserParamTransformerTests {
	
	@Autowired
	private ApiUserParamTransformer ptr;
	
	private static ApiUser VALID_API_USER = null;
	
	private static ApiUserParam PARAM_API_USER = null;
	
	@Before
	public void setUp() {
		VALID_API_USER = new ApiUser();
		PARAM_API_USER = new ApiUserParam();
	}
	
	@Test
	public void apply_whenGivenValidApiUser_ShouldReturnApiUser(){
		ApiUser result = ptr.apply(PARAM_API_USER, VALID_API_USER);
		
		assertEquals(result, VALID_API_USER);
	}
	
	@Test
	public void apply_whenGivenNull_ShouldReturnNewApiUser(){
		ApiUser result = ptr.apply(PARAM_API_USER, null);
		
		assertEquals(result, VALID_API_USER);
	}
}
