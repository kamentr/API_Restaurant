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
import net.kodar.restaurantapi.business.transformer.param.ingredientstatus.IngredientStatusParamTransformer;
import net.kodar.restaurantapi.data.entities.IngredientStatus;
import net.kodar.restaurantapi.presentation.param.IngredientStatusParam;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RestaurantApiApplication.class)
@ActiveProfiles("test")
@Configuration
public class IngredientStatusParamTransformerTests {

	@Autowired
	private IngredientStatusParamTransformer ptr;
	
	private static IngredientStatus VALID_INGREDIENT_STATUS = null;
	
	private static IngredientStatusParam PARAM_INGREDIENT_STATUS = null;
	
	@Before	public void setUp() {
		VALID_INGREDIENT_STATUS = new IngredientStatus();
		PARAM_INGREDIENT_STATUS = new IngredientStatusParam();
	}
	
	@Test
	public void apply_whenGivenValidIngredientStatus_ShouldReturnIngredientStatus(){
		IngredientStatus result = ptr.apply(PARAM_INGREDIENT_STATUS, VALID_INGREDIENT_STATUS);
		
		assertEquals(result, VALID_INGREDIENT_STATUS);
	}
	
	@Test
	public void apply_whenGivenNull_ShouldReturnNewIngredientStatus(){
		IngredientStatus result = ptr.apply(PARAM_INGREDIENT_STATUS, null);
		
		assertEquals(result, VALID_INGREDIENT_STATUS);
	}
}
