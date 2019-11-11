package net.kodar.restaurant_api.validator;

import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Rule;

import net.kodar.restaurantapi.RestaurantApiApplication;
import net.kodar.restaurantapi.business.validator.product.ProductValidator;
import net.kodar.restaurantapi.data.entities.Product;
import net.kodar.restaurantapi.presentation.param.ProductParam;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RestaurantApiApplication.class)
@ActiveProfiles("test")
@Configuration
public class ProductValidatorTests {

	@Autowired
	private ProductValidator validator;
	
	private static final Long VALID_ID = 1L;

	private static ProductParam VALID_PRODUCT_PARAM = null;
	
	@Before
	public void setUp() {
		VALID_PRODUCT_PARAM = new ProductParam();
		VALID_PRODUCT_PARAM.setId(VALID_ID);
	}
	
	@Test(expected = Test.None.class /* no exception expected */)
	public void validate_whenInvokedWithValidProduct_shouldNotThrowException(){
		validator.validate(VALID_PRODUCT_PARAM);
	}
}
