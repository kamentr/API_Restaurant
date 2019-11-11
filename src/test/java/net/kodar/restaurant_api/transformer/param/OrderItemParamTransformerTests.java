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
import net.kodar.restaurantapi.business.transformer.param.orderitem.OrderItemParamTransformer;
import net.kodar.restaurantapi.data.entities.OrderItem;
import net.kodar.restaurantapi.presentation.param.OrderItemParam;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RestaurantApiApplication.class)
@ActiveProfiles("test")
@Configuration
public class OrderItemParamTransformerTests {

	@Autowired
	private OrderItemParamTransformer ptr;
	
	private static OrderItem VALID_ORDER_ITEM = null;
	
	private static OrderItemParam PARAM_ORDER_ITEM = null;
	
	@Before
	public void setUp() {
		VALID_ORDER_ITEM = new OrderItem();
		PARAM_ORDER_ITEM = new OrderItemParam();
	}
	
	@Test
	public void apply_whenGivenValidOrderItem_ShouldReturnOrderItem(){
		OrderItem result = ptr.apply(PARAM_ORDER_ITEM, VALID_ORDER_ITEM);
		
		assertEquals(result, VALID_ORDER_ITEM);
	}
	
	@Test
	public void apply_whenGivenNull_ShouldReturnNewOrderItem(){
		OrderItem result = ptr.apply(PARAM_ORDER_ITEM, null);
		
		assertEquals(result, VALID_ORDER_ITEM);
	}
}
