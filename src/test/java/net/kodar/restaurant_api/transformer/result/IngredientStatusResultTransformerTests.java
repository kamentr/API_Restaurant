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
import net.kodar.restaurantapi.business.transformer.result.ingredientstatus.IngredientStatusResultTransformer;
import net.kodar.restaurantapi.data.entities.IngredientStatus;
import net.kodar.restaurantapi.presentation.result.IngredientStatusResult;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RestaurantApiApplication.class)
@ActiveProfiles("test")
@Configuration
public class IngredientStatusResultTransformerTests {
	private static final Long VALID_ID = 1L;

	@Autowired
	private IngredientStatusResultTransformer rtr;
	
	private static IngredientStatus VALID_INGREDIENT_STATUS = null;
	
	@Before
	public void setUp() {
		VALID_INGREDIENT_STATUS = new IngredientStatus();
		VALID_INGREDIENT_STATUS.setId(VALID_ID);
	}
	
	@Test
	public void apply_whenGivenValidIngredientStatus_ShouldReturnIngredientStatus(){
		IngredientStatusResult result = rtr.apply(VALID_INGREDIENT_STATUS);
		
		assertEquals(result.getId(), VALID_INGREDIENT_STATUS.getId());
	}
	
	@Test(expected = NullPointerException.class)
	public void apply_whenGivenNull_ShouldReturnNewIngredientStatus(){
		IngredientStatusResult result = rtr.apply(null);
	}
}
