package net.kodar.restaurant_api.validator;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import net.kodar.restaurantapi.RestaurantApiApplication;
import net.kodar.restaurantapi.business.validator.ingredient.IngredientValidator;
import net.kodar.restaurantapi.presentation.param.IngredientParam;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = RestaurantApiApplication.class)
@ActiveProfiles("test")
@Configuration
public class IngredientValidatorTests {

	@Autowired
	private IngredientValidator validator;
	
	private static final Long VALID_ID = 1L;

	private static IngredientParam VALID_INGREDIENT_PARAM = null;
	
	@Before
	public void setUp() {
		VALID_INGREDIENT_PARAM = new IngredientParam();
		VALID_INGREDIENT_PARAM.setId(VALID_ID);
	}
	
	@Test(expected = Test.None.class /* no exception expected */)
	public void validate_whenInvokedWithValidIngredient_shouldNotThrowException(){
		validator.validate(VALID_INGREDIENT_PARAM);
	}
}
