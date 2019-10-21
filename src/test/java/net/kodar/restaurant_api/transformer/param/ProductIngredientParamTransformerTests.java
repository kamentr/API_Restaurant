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
import net.kodar.restaurantapi.business.transformer.param.productingredient.ProductIngredientParamTransformer;
import net.kodar.restaurantapi.data.entities.ProductIngredient;
import net.kodar.restaurantapi.presentation.param.ProductIngredientParam;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RestaurantApiApplication.class)
@ActiveProfiles("test")
@Configuration
public class ProductIngredientParamTransformerTests {

	@Autowired
	private ProductIngredientParamTransformer ptr;
	
	private static ProductIngredient VALID_PRODUCT_INGREDIENT = null;
	
	private static ProductIngredientParam PARAM_PRODUCT_INGREDIENT = null;
	
	@Before
	public void setUp() {
		VALID_PRODUCT_INGREDIENT = new ProductIngredient();
		PARAM_PRODUCT_INGREDIENT = new ProductIngredientParam();
	}
	
	@Test
	public void apply_whenGivenValidProductIngredient_ShouldReturnProductIngredient(){
		ProductIngredient result = ptr.apply(PARAM_PRODUCT_INGREDIENT, VALID_PRODUCT_INGREDIENT);
		
		assertEquals(result, VALID_PRODUCT_INGREDIENT);
	}
	
	@Test
	public void apply_whenGivenNull_ShouldReturnNewProductIngredient(){
		ProductIngredient result = ptr.apply(PARAM_PRODUCT_INGREDIENT, null);
		
		assertEquals(result, VALID_PRODUCT_INGREDIENT);
	}
}
