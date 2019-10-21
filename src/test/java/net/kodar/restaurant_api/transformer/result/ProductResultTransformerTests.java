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
import net.kodar.restaurantapi.business.transformer.result.product.ProductResultTransformer;
import net.kodar.restaurantapi.data.entities.Product;
import net.kodar.restaurantapi.presentation.result.ProductResult;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RestaurantApiApplication.class)
@ActiveProfiles("test")
@Configuration
public class ProductResultTransformerTests {

	private static final Long VALID_ID = 1L;

	@Autowired
	private ProductResultTransformer rtr;
	
	private static Product VALID_PRODUCT = null;
	
	@Before
	public void setUp() {
		VALID_PRODUCT = new Product();
		VALID_PRODUCT.setId(VALID_ID);
	}
	
	@Test
	public void apply_whenGivenValidProduct_ShouldReturnProduct(){
		ProductResult result = rtr.apply(VALID_PRODUCT);
		
		assertEquals(result.getId(), VALID_PRODUCT.getId());
	}
	
	@Test(expected = NullPointerException.class)
	public void apply_whenGivenNull_ShouldReturnNewProduct(){
		ProductResult result = rtr.apply(null);
	}
}
