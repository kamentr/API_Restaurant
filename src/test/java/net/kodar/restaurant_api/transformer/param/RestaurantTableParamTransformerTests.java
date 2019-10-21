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
import net.kodar.restaurantapi.business.transformer.param.restauranttable.RestaurantTableParamTransformer;
import net.kodar.restaurantapi.data.entities.RestaurantTable;
import net.kodar.restaurantapi.presentation.param.RestaurantTableParam;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RestaurantApiApplication.class)
@ActiveProfiles("test")
@Configuration
public class RestaurantTableParamTransformerTests {

	@Autowired
	private RestaurantTableParamTransformer ptr;
	
	private static RestaurantTable VALID_RESTAURANT_TABLE = null;
	
	private static RestaurantTableParam PARAM_RESTAURANT_TABLE = null;
	
	@Before
	public void setUp() {
		VALID_RESTAURANT_TABLE = new RestaurantTable();
		PARAM_RESTAURANT_TABLE = new RestaurantTableParam();
	}
	
	@Test
	public void apply_whenGivenValidRestaurantTable_ShouldReturnRestaurantTable(){
		RestaurantTable result = ptr.apply(PARAM_RESTAURANT_TABLE, VALID_RESTAURANT_TABLE);
		
		assertEquals(result, VALID_RESTAURANT_TABLE);
	}
	
	@Test
	public void apply_whenGivenNull_ShouldReturnNewRestaurantTable(){
		RestaurantTable result = ptr.apply(PARAM_RESTAURANT_TABLE, null);
		
		assertEquals(result, VALID_RESTAURANT_TABLE);
	}

}
