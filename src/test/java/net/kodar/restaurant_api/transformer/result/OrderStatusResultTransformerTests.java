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
import net.kodar.restaurantapi.business.transformer.result.orderstatus.OrderStatusResultTransformer;
import net.kodar.restaurantapi.data.entities.OrderStatus;
import net.kodar.restaurantapi.presentation.result.OrderStatusResult;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RestaurantApiApplication.class)
@ActiveProfiles("test")
@Configuration
public class OrderStatusResultTransformerTests {

	private static final Long VALID_ID = 1L;

	@Autowired
	private OrderStatusResultTransformer rtr;
	
	private static OrderStatus VALID_ORDER_STATUS = null;
	
	@Before
	public void setUp() {
		VALID_ORDER_STATUS = new OrderStatus();
		VALID_ORDER_STATUS.setId(VALID_ID);
	}
	
	@Test
	public void apply_whenGivenValidOrderStatus_ShouldReturnOrderStatus(){
		OrderStatusResult result = rtr.apply(VALID_ORDER_STATUS);
		
		assertEquals(result.getId(), VALID_ORDER_STATUS.getId());
	}
	
	@Test(expected = NullPointerException.class)
	public void apply_whenGivenNull_ShouldReturnNewOrderStatus(){
		OrderStatusResult result = rtr.apply(null);
	}
}
