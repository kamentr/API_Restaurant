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
import net.kodar.restaurantapi.business.transformer.param.productstatus.ProductStatusParamTransformer;
import net.kodar.restaurantapi.data.entities.ProductStatus;
import net.kodar.restaurantapi.presentation.param.ProductStatusParam;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RestaurantApiApplication.class)
@ActiveProfiles("test")
@Configuration
public class ProductStatusParamTransformerTests {

	@Autowired
	private ProductStatusParamTransformer ptr;
	
	private static ProductStatus VALID_ORDER_STATUS = null;
	
	private static ProductStatusParam PARAM_ORDER_STATUS = null;
	
	@Before	public void setUp() {
		VALID_ORDER_STATUS = new ProductStatus();
		PARAM_ORDER_STATUS = new ProductStatusParam();
	}
	
	@Test
	public void apply_whenGivenValidProductStatus_ShouldReturnProductStatus(){
		ProductStatus result = ptr.apply(PARAM_ORDER_STATUS, VALID_ORDER_STATUS);
		
		assertEquals(result, VALID_ORDER_STATUS);
	}
	
	@Test
	public void apply_whenGivenNull_ShouldReturnNewProductStatus(){
		ProductStatus result = ptr.apply(PARAM_ORDER_STATUS, null);
		
		assertEquals(result, VALID_ORDER_STATUS);
	}
}
