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
import net.kodar.restaurantapi.business.transformer.result.productstatus.ProductStatusResultTransformer;
import net.kodar.restaurantapi.data.entities.ProductStatus;
import net.kodar.restaurantapi.presentation.result.ProductStatusResult;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RestaurantApiApplication.class)
@ActiveProfiles("test")
@Configuration
public class ProductStatusResultTransformerTests {

	private static final Long VALID_ID = 1L;

	@Autowired
	private ProductStatusResultTransformer rtr;
	
	private static ProductStatus VALID_PRODUCT_STATUS = null;
	
	@Before
	public void setUp() {
		VALID_PRODUCT_STATUS = new ProductStatus();
		VALID_PRODUCT_STATUS.setId(VALID_ID);
	}
	
	@Test
	public void apply_whenGivenValidProductStatus_ShouldReturnProductStatus(){
		ProductStatusResult result = rtr.apply(VALID_PRODUCT_STATUS);
		
		assertEquals(result.getId(), VALID_PRODUCT_STATUS.getId());
	}
	
	@Test(expected = NullPointerException.class)
	public void apply_whenGivenNull_ShouldReturnNewProductStatus(){
		ProductStatusResult result = rtr.apply(null);
	}
}
