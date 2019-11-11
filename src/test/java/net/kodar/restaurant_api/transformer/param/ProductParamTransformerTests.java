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
import net.kodar.restaurantapi.business.transformer.param.product.ProductParamTransformer;
import net.kodar.restaurantapi.data.entities.Product;
import net.kodar.restaurantapi.presentation.param.ProductParam;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RestaurantApiApplication.class)
@ActiveProfiles("test")
@Configuration
public class ProductParamTransformerTests {

	@Autowired
	private ProductParamTransformer ptr;
	
	private static Product VALID_PRODUCT = null;
	
	private static ProductParam PARAM_PRODUCT = null;
	
	@Before
	public void setUp() {
		VALID_PRODUCT = new Product();
		PARAM_PRODUCT = new ProductParam();
	}
	
	@Test
	public void apply_whenGivenValidProduct_ShouldReturnProduct(){
		Product result = ptr.apply(PARAM_PRODUCT, VALID_PRODUCT);
		
		assertEquals(result, VALID_PRODUCT);
	}
	
	@Test
	public void apply_whenGivenNull_ShouldReturnNewProduct(){
		Product result = ptr.apply(PARAM_PRODUCT, null);
		
		assertEquals(result, VALID_PRODUCT);
	}
}
