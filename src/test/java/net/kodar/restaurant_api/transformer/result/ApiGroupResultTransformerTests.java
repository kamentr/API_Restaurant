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
import net.kodar.restaurantapi.business.transformer.result.apigroup.ApiGroupResultTransformer;
import net.kodar.restaurantapi.data.entities.ApiGroup;
import net.kodar.restaurantapi.presentation.result.ApiGroupResult;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RestaurantApiApplication.class)
@ActiveProfiles("test")
@Configuration
public class ApiGroupResultTransformerTests {

	private static final Long VALID_ID = 1L;

	@Autowired
	private ApiGroupResultTransformer rtr;
	
	private static ApiGroup VALID_API_GROUP = null;
	
	@Before
	public void setUp() {
		VALID_API_GROUP = new ApiGroup();
		VALID_API_GROUP.setId(VALID_ID);
	}
	
	@Test
	public void apply_whenGivenValidApiGroup_ShouldReturnApiGroup(){
		ApiGroupResult result = rtr.apply(VALID_API_GROUP);
		
		assertEquals(result.getId(), VALID_API_GROUP.getId());
	}
	
	@Test(expected = NullPointerException.class)
	public void apply_whenGivenNull_ShouldReturnNewApiGroup(){
		ApiGroupResult result = rtr.apply(null);
	}
}
