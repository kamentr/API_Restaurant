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
import net.kodar.restaurantapi.business.transformer.param.orderstatus.OrderStatusParamTransformer;
import net.kodar.restaurantapi.data.entities.OrderStatus;
import net.kodar.restaurantapi.presentation.param.OrderStatusParam;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RestaurantApiApplication.class)
@ActiveProfiles("test")
@Configuration
public class OrderStatusParamTransformerTests {

	@Autowired
	private OrderStatusParamTransformer ptr;
	
	private static OrderStatus VALID_ORDER_STATUS = null;
	
	private static OrderStatusParam PARAM_ORDER_STATUS = null;
	
	@Before	public void setUp() {
		VALID_ORDER_STATUS = new OrderStatus();
		PARAM_ORDER_STATUS = new OrderStatusParam();
	}
	
	@Test
	public void apply_whenGivenValidOrderStatus_ShouldReturnOrderStatus(){
		OrderStatus result = ptr.apply(PARAM_ORDER_STATUS, VALID_ORDER_STATUS);
		
		assertEquals(result, VALID_ORDER_STATUS);
	}
	
	@Test
	public void apply_whenGivenNull_ShouldReturnNewOrderStatus(){
		OrderStatus result = ptr.apply(PARAM_ORDER_STATUS, null);
		
		assertEquals(result, VALID_ORDER_STATUS);
	}
}
