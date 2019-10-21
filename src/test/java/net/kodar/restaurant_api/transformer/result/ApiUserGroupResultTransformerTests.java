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
import net.kodar.restaurantapi.business.transformer.result.apiusergroup.ApiUserGroupResultTransformer;
import net.kodar.restaurantapi.data.entities.ApiUserGroup;
import net.kodar.restaurantapi.presentation.result.ApiUserGroupResult;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RestaurantApiApplication.class)
@ActiveProfiles("test")
@Configuration
public class ApiUserGroupResultTransformerTests {

	private static final Long VALID_ID = 1L;

	@Autowired
	private ApiUserGroupResultTransformer rtr;
	
	private static ApiUserGroup VALID_API_USER_GROUP = null;
	
	@Before
	public void setUp() {
		VALID_API_USER_GROUP = new ApiUserGroup();
		VALID_API_USER_GROUP.setId(VALID_ID);
	}
	
	@Test
	public void apply_whenGivenValidApiUserGroup_ShouldReturnApiUserGroup(){
		ApiUserGroupResult result = rtr.apply(VALID_API_USER_GROUP);
		
		assertEquals(result.getId(), VALID_API_USER_GROUP.getId());
	}
	
	@Test(expected = NullPointerException.class)
	public void apply_whenGivenNull_ShouldReturnNewApiUserGroup(){
		ApiUserGroupResult result = rtr.apply(null);
	}
}
