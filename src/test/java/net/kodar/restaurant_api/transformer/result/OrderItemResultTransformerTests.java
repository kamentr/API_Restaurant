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
import net.kodar.restaurantapi.business.transformer.result.orderitem.OrderItemResultTransformer;
import net.kodar.restaurantapi.data.entities.OrderItem;
import net.kodar.restaurantapi.presentation.result.OrderItemResult;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RestaurantApiApplication.class)
@ActiveProfiles("test")
@Configuration
public class OrderItemResultTransformerTests {

	private static final Long VALID_ID = 1L;

	@Autowired
	private OrderItemResultTransformer rtr;
	
	private static OrderItem VALID_ORDER_ITEM = null;
	
	@Before
	public void setUp() {
		VALID_ORDER_ITEM = new OrderItem();
		VALID_ORDER_ITEM.setId(VALID_ID);
	}
	
	@Test
	public void apply_whenGivenValidOrderItem_ShouldReturnOrderItem(){
		OrderItemResult result = rtr.apply(VALID_ORDER_ITEM);
		
		assertEquals(result.getId(), VALID_ORDER_ITEM.getId());
	}
	
	@Test(expected = NullPointerException.class)
	public void apply_whenGivenNull_ShouldReturnNewOrderItem(){
		OrderItemResult result = rtr.apply(null);
	}
}
