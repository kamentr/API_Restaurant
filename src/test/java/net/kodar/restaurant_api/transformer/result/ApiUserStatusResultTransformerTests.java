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
import net.kodar.restaurantapi.business.transformer.result.apiuserstatus.ApiUserStatusResultTransformer;
import net.kodar.restaurantapi.data.entities.ApiUserStatus;
import net.kodar.restaurantapi.presentation.result.ApiUserStatusResult;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RestaurantApiApplication.class)
@ActiveProfiles("test")
@Configuration
public class ApiUserStatusResultTransformerTests {

	private static final Long VALID_ID = 1L;

	@Autowired
	private ApiUserStatusResultTransformer rtr;
	
	private static ApiUserStatus VALID_API_USER_STATUS = null;
	
	@Before
	public void setUp() {
		VALID_API_USER_STATUS = new ApiUserStatus();
		VALID_API_USER_STATUS.setId(VALID_ID);
	}
	
	@Test
	public void apply_whenGivenValidApiUserStatus_ShouldReturnApiUserStatus(){
		ApiUserStatusResult result = rtr.apply(VALID_API_USER_STATUS);
		
		assertEquals(result.getId(), VALID_API_USER_STATUS.getId());
	}
	
	@Test(expected = NullPointerException.class)
	public void apply_whenGivenNull_ShouldReturnNewApiUserStatus(){
		ApiUserStatusResult result = rtr.apply(null);
	}
}
