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
import net.kodar.restaurantapi.business.transformer.result.restauranttable.RestaurantTableResultTransformer;
import net.kodar.restaurantapi.data.entities.RestaurantTable;
import net.kodar.restaurantapi.presentation.result.RestaurantTableResult;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RestaurantApiApplication.class)
@ActiveProfiles("test")
@Configuration
public class RestaurantTableResultTransformerTests {

	private static final Long VALID_ID = 1L;

	@Autowired
	private RestaurantTableResultTransformer rtr;
	
	private static RestaurantTable VALID_RESTAURANT_TABLE = null;
	
	@Before
	public void setUp() {
		VALID_RESTAURANT_TABLE = new RestaurantTable();
		VALID_RESTAURANT_TABLE.setId(VALID_ID);
	}
	
	@Test
	public void apply_whenGivenValidRestaurantTable_ShouldReturnRestaurantTable(){
		RestaurantTableResult result = rtr.apply(VALID_RESTAURANT_TABLE);
		
		assertEquals(result.getId(), VALID_RESTAURANT_TABLE.getId());
	}
	
	@Test(expected = NullPointerException.class)
	public void apply_whenGivenNull_ShouldReturnNewRestaurantTable(){
		RestaurantTableResult result = rtr.apply(null);
	}
}
