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
import net.kodar.restaurantapi.business.transformer.param.lifecyclestatus.LifecycleStatusParamTransformer;
import net.kodar.restaurantapi.data.entities.LifecycleStatus;
import net.kodar.restaurantapi.presentation.param.LifecycleStatusParam;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RestaurantApiApplication.class)
@ActiveProfiles("test")
@Configuration
public class LifecycleStatusParamTransformerTests {

	@Autowired
	private LifecycleStatusParamTransformer ptr;
	
	private static LifecycleStatus VALID_LIFECYCLE_STATUS = null;
	
	private static LifecycleStatusParam PARAM_LIFECYCLE_STATUS = null;
	
	@Before
	public void setUp() {
		VALID_LIFECYCLE_STATUS = new LifecycleStatus();
		PARAM_LIFECYCLE_STATUS = new LifecycleStatusParam();
	}
	
	@Test
	public void apply_whenGivenValidLifecycleStatus_ShouldReturnLifecycleStatus(){
		LifecycleStatus result = ptr.apply(PARAM_LIFECYCLE_STATUS, VALID_LIFECYCLE_STATUS);
		
		assertEquals(result, VALID_LIFECYCLE_STATUS);
	}
	
	@Test
	public void apply_whenGivenNull_ShouldReturnNewLifecycleStatus(){
		LifecycleStatus result = ptr.apply(PARAM_LIFECYCLE_STATUS, null);
		
		assertEquals(result, VALID_LIFECYCLE_STATUS);
	}
}
