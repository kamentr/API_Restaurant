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
import net.kodar.restaurantapi.business.transformer.result.apigroupstatus.ApiGroupStatusResultTransformer;
import net.kodar.restaurantapi.data.entities.ApiGroupStatus;
import net.kodar.restaurantapi.presentation.result.ApiGroupStatusResult;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = RestaurantApiApplication.class)
@ActiveProfiles("test")
@Configuration
public class ApiGroupStatusResultTransformerTests {
	
	private static final Long VALID_ID = 1L;

	@Autowired
	private ApiGroupStatusResultTransformer rtr;
	
	private static ApiGroupStatus VALID_API_GROUP_STATUS = null;
	
	@Before
	public void setUp() {
		VALID_API_GROUP_STATUS = new ApiGroupStatus();
		VALID_API_GROUP_STATUS.setId(VALID_ID);
	}
	
	@Test
	public void apply_whenGivenValidApiGroupStatus_ShouldReturnApiGroupStatus(){
		ApiGroupStatusResult result = rtr.apply(VALID_API_GROUP_STATUS);
		
		assertEquals(result.getId(), VALID_API_GROUP_STATUS.getId());
	}
	
	@Test(expected = NullPointerException.class)
	public void apply_whenGivenNull_ShouldReturnNewApiGroupStatus(){
		ApiGroupStatusResult result = rtr.apply(null);
	}
}
