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
import net.kodar.restaurantapi.business.transformer.param.restaurantmenu.RestaurantMenuParamTransformer;
import net.kodar.restaurantapi.data.entities.RestaurantMenu;
import net.kodar.restaurantapi.presentation.param.RestaurantMenuParam;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RestaurantApiApplication.class)
@ActiveProfiles("test")
@Configuration
public class RestaurantMenuParamTransformerTests {

	@Autowired
	private RestaurantMenuParamTransformer ptr;
	
	private static RestaurantMenu VALID_RESTAURANT_MENU = null;
	
	private static RestaurantMenuParam PARAM_RESTAURANT_MENU = null;
	
	@Before
	public void setUp() {
		VALID_RESTAURANT_MENU = new RestaurantMenu();
		PARAM_RESTAURANT_MENU = new RestaurantMenuParam();
	}
	
	@Test
	public void apply_whenGivenValidRestaurantMenu_ShouldReturnRestaurantMenu(){
		RestaurantMenu result = ptr.apply(PARAM_RESTAURANT_MENU, VALID_RESTAURANT_MENU);
		
		assertEquals(result, VALID_RESTAURANT_MENU);
	}
	
	@Test
	public void apply_whenGivenNull_ShouldReturnNewRestaurantMenu(){
		RestaurantMenu result = ptr.apply(PARAM_RESTAURANT_MENU, null);
		
		assertEquals(result, VALID_RESTAURANT_MENU);
	}

}
