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
import net.kodar.restaurantapi.business.transformer.result.menuitem.MenuItemResultTransformer;
import net.kodar.restaurantapi.data.entities.MenuItem;
import net.kodar.restaurantapi.presentation.result.MenuItemResult;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RestaurantApiApplication.class)
@ActiveProfiles("test")
@Configuration
public class MenuItemResultTransformerTests {


	private static final Long VALID_ID = 1L;

	@Autowired
	private MenuItemResultTransformer rtr;
	
	private static MenuItem VALID_MENU_ITEM = null;
	
	@Before
	public void setUp() {
		VALID_MENU_ITEM = new MenuItem();
		VALID_MENU_ITEM.setId(VALID_ID);
	}
	
	@Test
	public void apply_whenGivenValidMenuItem_ShouldReturnMenuItem(){
		MenuItemResult result = rtr.apply(VALID_MENU_ITEM);
		
		assertEquals(result.getId(), VALID_MENU_ITEM.getId());
	}
	
	@Test(expected = NullPointerException.class)
	public void apply_whenGivenNull_ShouldReturnNewMenuItem(){
		MenuItemResult result = rtr.apply(null);
	}
}
