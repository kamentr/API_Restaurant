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
import net.kodar.restaurantapi.business.transformer.param.menuitem.MenuItemParamTransformer;
import net.kodar.restaurantapi.data.entities.MenuItem;
import net.kodar.restaurantapi.presentation.param.MenuItemParam;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RestaurantApiApplication.class)
@ActiveProfiles("test")
@Configuration
public class MenuItemParamTransformerTests {
	
	@Autowired
	private MenuItemParamTransformer ptr;
	
	private static MenuItem VALID_MENU_ITEM = null;
	
	private static MenuItemParam PARAM_MENU_ITEM = null;
	
	@Before
	public void setUp() {
		VALID_MENU_ITEM = new MenuItem();
		PARAM_MENU_ITEM = new MenuItemParam();
	}
	
	@Test
	public void apply_whenGivenValidMenuItem_ShouldReturnMenuItem(){
		MenuItem result = ptr.apply(PARAM_MENU_ITEM, VALID_MENU_ITEM);
		
		assertEquals(result, VALID_MENU_ITEM);
	}
	
	@Test
	public void apply_whenGivenNull_ShouldReturnNewMenuItem(){
		MenuItem result = ptr.apply(PARAM_MENU_ITEM, null);
		
		assertEquals(result, VALID_MENU_ITEM);
	}
}
