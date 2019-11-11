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
import net.kodar.restaurantapi.business.transformer.result.ingredient.IngredientResultTransformer;
import net.kodar.restaurantapi.data.entities.Ingredient;
import net.kodar.restaurantapi.presentation.result.IngredientResult;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RestaurantApiApplication.class)
@ActiveProfiles("test")
@Configuration
public class IngredientResultTransformerTests {
	
	private static final Long VALID_ID = 1L;

	@Autowired
	private IngredientResultTransformer rtr;
	
	private static Ingredient VALID_INGREDIENT = null;
	
	@Before
	public void setUp() {
		VALID_INGREDIENT = new Ingredient();
		VALID_INGREDIENT.setId(VALID_ID);
	}
	
	@Test
	public void apply_whenGivenValidIngredient_ShouldReturnIngredient(){
		IngredientResult result = rtr.apply(VALID_INGREDIENT);
		
		assertEquals(result.getId(), VALID_INGREDIENT.getId());
	}
	
	@Test(expected = NullPointerException.class)
	public void apply_whenGivenNull_ShouldReturnNewIngredient(){
		IngredientResult result = rtr.apply(null);
	}
}
