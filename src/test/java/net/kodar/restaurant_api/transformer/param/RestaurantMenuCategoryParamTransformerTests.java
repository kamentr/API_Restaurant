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
import net.kodar.restaurantapi.business.transformer.param.restaurantmenucategory.RestaurantMenuCategoryParamTransformer;
import net.kodar.restaurantapi.data.entities.RestaurantMenuCategory;
import net.kodar.restaurantapi.presentation.param.RestaurantMenuCategoryParam;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RestaurantApiApplication.class)
@ActiveProfiles("test")
@Configuration
public class RestaurantMenuCategoryParamTransformerTests {
	
	@Autowired
	private RestaurantMenuCategoryParamTransformer ptr;
	
	private static RestaurantMenuCategory VALID_RESTAURANT_MENU_CATEGORY = null;
	
	private static RestaurantMenuCategoryParam PARAM_RESTAURANT_MENU_CATEGORY = null;
	
	@Before	public void setUp() {
		VALID_RESTAURANT_MENU_CATEGORY = new RestaurantMenuCategory();
		PARAM_RESTAURANT_MENU_CATEGORY = new RestaurantMenuCategoryParam();
	}
	
	@Test
	public void apply_whenGivenValidRestaurantMenuCategory_ShouldReturnRestaurantMenuCategory(){
		RestaurantMenuCategory result = ptr.apply(PARAM_RESTAURANT_MENU_CATEGORY, VALID_RESTAURANT_MENU_CATEGORY);
		
		assertEquals(result, VALID_RESTAURANT_MENU_CATEGORY);
	}
	
	@Test
	public void apply_whenGivenNull_ShouldReturnNewRestaurantMenuCategory(){
		RestaurantMenuCategory result = ptr.apply(PARAM_RESTAURANT_MENU_CATEGORY, null);
		
		assertEquals(result, VALID_RESTAURANT_MENU_CATEGORY);
	}
}
