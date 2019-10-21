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
import net.kodar.restaurantapi.business.transformer.param.apigroupstatus.ApiGroupStatusParamTransformer;
import net.kodar.restaurantapi.data.entities.ApiGroupStatus;
import net.kodar.restaurantapi.presentation.param.ApiGroupStatusParam;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RestaurantApiApplication.class)
@ActiveProfiles("test")
@Configuration
public class ApiGroupStatusParamTransformerTests {

	@Autowired
	private ApiGroupStatusParamTransformer ptr;
	
	private static ApiGroupStatus VALID_API_GROUP_STATUS = null;
	
	private static ApiGroupStatusParam PARAM_API_GROUP_STATUS = null;
	
	@Before
	public void setUp() {
		VALID_API_GROUP_STATUS = new ApiGroupStatus();
		PARAM_API_GROUP_STATUS = new ApiGroupStatusParam();
	}
	
	@Test
	public void apply_whenGivenValidApiGroupStatus_ShouldReturnApiGroupStatus(){
		ApiGroupStatus result = ptr.apply(PARAM_API_GROUP_STATUS, VALID_API_GROUP_STATUS);
		
		assertEquals(result, VALID_API_GROUP_STATUS);
	}
	
	@Test
	public void apply_whenGivenNull_ShouldReturnNewApiGroupStatus(){
		ApiGroupStatus result = ptr.apply(PARAM_API_GROUP_STATUS, null);
		
		assertEquals(result, VALID_API_GROUP_STATUS);
	}
}