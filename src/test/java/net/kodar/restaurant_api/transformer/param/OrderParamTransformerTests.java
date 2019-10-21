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
import net.kodar.restaurantapi.business.transformer.param.order.OrderParamTransformer;
import net.kodar.restaurantapi.data.entities.Order;
import net.kodar.restaurantapi.presentation.param.OrderParam;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RestaurantApiApplication.class)
@ActiveProfiles("test")
@Configuration
public class OrderParamTransformerTests {
	
	@Autowired
	private OrderParamTransformer ptr;
	
	private static Order VALID_ORDER = null;
	
	private static OrderParam PARAM_ORDER = null;
	
	@Before
	public void setUp() {
		VALID_ORDER = new Order();
		PARAM_ORDER = new OrderParam();
	}
	
	@Test
	public void apply_whenGivenValidOrder_ShouldReturnOrder(){
		Order result = ptr.apply(PARAM_ORDER, VALID_ORDER);
		
		assertEquals(result, VALID_ORDER);
	}
	
	@Test
	public void apply_whenGivenNull_ShouldReturnNewOrder(){
		Order result = ptr.apply(PARAM_ORDER, null);
		
		assertEquals(result, VALID_ORDER);
	}
}
