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
import net.kodar.restaurantapi.business.transformer.param.restaurantmenustatus.RestaurantMenuStatusParamTransformer;
import net.kodar.restaurantapi.data.entities.RestaurantMenuStatus;
import net.kodar.restaurantapi.presentation.param.RestaurantMenuStatusParam;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RestaurantApiApplication.class)
@ActiveProfiles("test")
@Configuration
public class RestaurantMenuStatusParamTransformerTests {
	
	@Autowired
	private RestaurantMenuStatusParamTransformer ptr;
	
	private static RestaurantMenuStatus VALID_RESTAURANT_MENU_CATEGORY = null;
	
	private static RestaurantMenuStatusParam PARAM_RESTAURANT_MENU_STATUS = null;
	
	@Before	public void setUp() {
		VALID_RESTAURANT_MENU_CATEGORY = new RestaurantMenuStatus();
		PARAM_RESTAURANT_MENU_STATUS = new RestaurantMenuStatusParam();
	}
	
	@Test
	public void apply_whenGivenValidRestaurantMenuStatus_ShouldReturnRestaurantMenuStatus(){
		RestaurantMenuStatus result = ptr.apply(PARAM_RESTAURANT_MENU_STATUS, VALID_RESTAURANT_MENU_CATEGORY);
		
		assertEquals(result, VALID_RESTAURANT_MENU_CATEGORY);
	}
	
	@Test
	public void apply_whenGivenNull_ShouldReturnNewRestaurantMenuStatus(){
		RestaurantMenuStatus result = ptr.apply(PARAM_RESTAURANT_MENU_STATUS, null);
		
		assertEquals(result, VALID_RESTAURANT_MENU_CATEGORY);
	}
}
