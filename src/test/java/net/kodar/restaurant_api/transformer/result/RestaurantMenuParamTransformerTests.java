package net.kodar.restaurant_api.transformer.result;

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
import net.kodar.restaurantapi.business.transformer.result.restaurantmenu.RestaurantMenuResultTransformer;
import net.kodar.restaurantapi.data.entities.RestaurantMenu;
import net.kodar.restaurantapi.presentation.result.RestaurantMenuResult;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = RestaurantApiApplication.class)
@ActiveProfiles("test")
@Configuration
public class RestaurantMenuParamTransformerTests {

	private static final Long VALID_ID = 1L;
	
	@Autowired
	private RestaurantMenuResultTransformer rtr;
	
	private static RestaurantMenu VALID_RESTAURANT_MENU = null;
	
	@Before
	public void setUp() {
		VALID_RESTAURANT_MENU = new RestaurantMenu();
		VALID_RESTAURANT_MENU.setId(VALID_ID);
	}
	
	@Test
	public void apply_whenGivenValidRestaurantMenu_ShouldReturnRestaurantMenu(){
		RestaurantMenuResult result = rtr.apply(VALID_RESTAURANT_MENU);
		
		assertEquals(result.getId(), VALID_RESTAURANT_MENU.getId());
	}
	
	@Test(expected = NullPointerException.class)
	public void apply_whenGivenNull_ShouldReturnNewRestaurantMenu(){
		RestaurantMenuResult result = rtr.apply(null);
	}
}
