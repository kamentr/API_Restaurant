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
import net.kodar.restaurantapi.business.transformer.result.order.OrderResultTransformer;
import net.kodar.restaurantapi.data.entities.Order;
import net.kodar.restaurantapi.presentation.result.OrderResult;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RestaurantApiApplication.class)
@ActiveProfiles("test")
@Configuration
public class OrderResultTransformerTests {

	private static final Long VALID_ID = 1L;

	@Autowired
	private OrderResultTransformer rtr;
	
	private static Order VALID_ORDER = null;
	
	@Before
	public void setUp() {
		VALID_ORDER = new Order();
		VALID_ORDER.setId(VALID_ID);
	}
	
	@Test
	public void apply_whenGivenValidOrder_ShouldReturnOrder(){
		OrderResult result = rtr.apply(VALID_ORDER);
		
		assertEquals(result.getId(), VALID_ORDER.getId());
	}
	
	@Test(expected = NullPointerException.class)
	public void apply_whenGivenNull_ShouldReturnNewOrder(){
		OrderResult result = rtr.apply(null);
	}
}
