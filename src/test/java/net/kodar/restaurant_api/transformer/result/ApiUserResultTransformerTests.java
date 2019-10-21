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
import net.kodar.restaurantapi.business.transformer.result.apiuser.ApiUserResultTransformer;
import net.kodar.restaurantapi.data.entities.ApiUser;
import net.kodar.restaurantapi.presentation.result.ApiUserResult;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RestaurantApiApplication.class)
@ActiveProfiles("test")
@Configuration
public class ApiUserResultTransformerTests {

	private static final Long VALID_ID = 1L;

	@Autowired
	private ApiUserResultTransformer rtr;
	
	private static ApiUser VALID_API_USER = null;
	
	@Before
	public void setUp() {
		VALID_API_USER = new ApiUser();
		VALID_API_USER.setId(VALID_ID);
	}
	
	@Test
	public void apply_whenGivenValidApiUser_ShouldReturnApiUser(){
		ApiUserResult result = rtr.apply(VALID_API_USER);
		
		assertEquals(result.getId(), VALID_API_USER.getId());
	}
	
	@Test(expected = NullPointerException.class)
	public void apply_whenGivenNull_ShouldReturnNewApiUser(){
		ApiUserResult result = rtr.apply(null);
	}
}
