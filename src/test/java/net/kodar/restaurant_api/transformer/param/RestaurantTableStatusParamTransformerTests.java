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
import net.kodar.restaurantapi.business.transformer.param.restauranttablestatus.RestaurantTableStatusParamTransformer;
import net.kodar.restaurantapi.data.entities.RestaurantTableStatus;
import net.kodar.restaurantapi.presentation.param.RestaurantTableStatusParam;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RestaurantApiApplication.class)
@ActiveProfiles("test")
@Configuration
public class RestaurantTableStatusParamTransformerTests {

	@Autowired
	private RestaurantTableStatusParamTransformer ptr;
	
	private static RestaurantTableStatus VALID_RESTAURANT_TABLE_STATUS = null;
	
	private static RestaurantTableStatusParam PARAM_RESTAURANT_TABLE_STATUS = null;
	
	@Before	public void setUp() {
		VALID_RESTAURANT_TABLE_STATUS = new RestaurantTableStatus();
		PARAM_RESTAURANT_TABLE_STATUS = new RestaurantTableStatusParam();
	}
	
	@Test
	public void apply_whenGivenValidRestaurantTableStatus_ShouldReturnRestaurantTableStatus(){
		RestaurantTableStatus result = ptr.apply(PARAM_RESTAURANT_TABLE_STATUS, VALID_RESTAURANT_TABLE_STATUS);
		
		assertEquals(result, VALID_RESTAURANT_TABLE_STATUS);
	}
	
	@Test
	public void apply_whenGivenNull_ShouldReturnNewRestaurantTableStatus(){
		RestaurantTableStatus result = ptr.apply(PARAM_RESTAURANT_TABLE_STATUS, null);
		
		assertEquals(result, VALID_RESTAURANT_TABLE_STATUS);
	}
}
