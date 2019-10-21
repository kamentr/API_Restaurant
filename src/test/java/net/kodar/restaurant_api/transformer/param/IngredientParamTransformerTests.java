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
import net.kodar.restaurantapi.business.transformer.param.ingredient.IngredientParamTransformer;
import net.kodar.restaurantapi.data.entities.Ingredient;
import net.kodar.restaurantapi.presentation.param.IngredientParam;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RestaurantApiApplication.class)
@ActiveProfiles("test")
@Configuration
public class IngredientParamTransformerTests {

	@Autowired
	private IngredientParamTransformer ptr;
	
	private static Ingredient VALID_INGREDIENT = null;
	
	private static IngredientParam PARAM_INGREDIENT = null;
	
	@Before
	public void setUp() {
		VALID_INGREDIENT = new Ingredient();
		PARAM_INGREDIENT = new IngredientParam();
	}
	
	@Test
	public void apply_whenGivenValidIngredient_ShouldReturnIngredient(){
		Ingredient result = ptr.apply(PARAM_INGREDIENT, VALID_INGREDIENT);
		
		assertEquals(result, VALID_INGREDIENT);
	}
	
	@Test
	public void apply_whenGivenNull_ShouldReturnNewIngredient(){
		Ingredient result = ptr.apply(PARAM_INGREDIENT, null);
		
		assertEquals(result, VALID_INGREDIENT);
	}
}
