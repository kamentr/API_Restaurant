package net.kodar.restaurant_api.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import net.kodar.restaurantapi.RestaurantApiApplication;
import net.kodar.restaurantapi.business.processor.apigroup.ApiGroupProcessorImpl;
import net.kodar.restaurantapi.presentation.result.ApiGroupResult;
import net.kodar.restaurantapi.presentation.service.apigroup.ApiGroupService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RestaurantApiApplication.class)
@ActiveProfiles("test")
@Configuration
public class ApiGroupServiceTests {

	@Autowired
	private ApiGroupService service;
	
	@MockBean
	private ApiGroupProcessorImpl processor;
	
	private ApiGroupResult VALID_API_GROUP_RESULT = new ApiGroupResult();
	
	private static final String URL = "http://localhost:8080/apigroup/byusername/user";
	
	@Test
	public void findByUsername_whenCalled_shouldReturnListOfApiGroup(){
        List<ApiGroupResult> apiGroupList =  Arrays.asList(VALID_API_GROUP_RESULT, VALID_API_GROUP_RESULT);

        when(processor.getAll()).thenReturn(apiGroupList);

        assertEquals(service.getAll().size(), 2);
	}
	
}
