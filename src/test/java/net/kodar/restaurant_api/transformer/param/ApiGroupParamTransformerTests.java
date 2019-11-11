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
import net.kodar.restaurantapi.business.transformer.param.apigroup.ApiGroupParamTransformer;
import net.kodar.restaurantapi.data.entities.ApiGroup;
import net.kodar.restaurantapi.presentation.param.ApiGroupParam;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RestaurantApiApplication.class)
@ActiveProfiles("test")
@Configuration
public class ApiGroupParamTransformerTests {
	
	@Autowired
	private ApiGroupParamTransformer ptr;
	
	private static ApiGroup VALID_API_GROUP = null;
	
	private static ApiGroupParam PARAM_API_GROUP = null;
	
	@Before	public void setUp() {
		VALID_API_GROUP = new ApiGroup();
		PARAM_API_GROUP = new ApiGroupParam();
	}
	
	@Test
	public void apply_whenGivenValidApiGroup_ShouldReturnApiGroup(){
		ApiGroup result = ptr.apply(PARAM_API_GROUP, VALID_API_GROUP);
		
		assertEquals(result, VALID_API_GROUP);
	}
	
	@Test
	public void apply_whenGivenNull_ShouldReturnNewApiGroup(){
		ApiGroup result = ptr.apply(PARAM_API_GROUP, null);
		
		assertEquals(result, VALID_API_GROUP);
	}

}
