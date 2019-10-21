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
import net.kodar.restaurantapi.business.transformer.result.productingredient.ProductIngredientResultTransformer;
import net.kodar.restaurantapi.data.entities.ProductIngredient;
import net.kodar.restaurantapi.presentation.result.ProductIngredientResult;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RestaurantApiApplication.class)
@ActiveProfiles("test")
@Configuration
public class ProductIngredientResultTransformerTests {

	private static final Long VALID_ID = 1L;

	@Autowired
	private ProductIngredientResultTransformer rtr;
	
	private static ProductIngredient VALID_PRODUCT_INGREDIENT = null;
	
	@Before
	public void setUp() {
		VALID_PRODUCT_INGREDIENT = new ProductIngredient();
		VALID_PRODUCT_INGREDIENT.setId(VALID_ID);
	}
	
	@Test
	public void apply_whenGivenValidProductIngredient_ShouldReturnProductIngredient(){
		ProductIngredientResult result = rtr.apply(VALID_PRODUCT_INGREDIENT);
		
		assertEquals(result.getId(), VALID_PRODUCT_INGREDIENT.getId());
	}
	
	@Test(expected = NullPointerException.class)
	public void apply_whenGivenNull_ShouldReturnNewProductIngredient(){
		ProductIngredientResult result = rtr.apply(null);
	}
}
