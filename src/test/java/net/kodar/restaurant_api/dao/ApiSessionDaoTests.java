package net.kodar.restaurant_api.dao;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import net.kodar.restaurantapi.RestaurantApiApplication;
import net.kodar.restaurantapi.data.entities.security.ApiSession;
import net.kodar.restaurantapi.dataaccess.dao.apisession.ApiSessionDaoImpl;
import net.kodar.restaurantapi.dataaccess.repository.ApiSessionRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RestaurantApiApplication.class)
@ActiveProfiles("test")
@Configuration
public class ApiSessionDaoTests {

	
	private static final String VALID_USERNAME = "user";

	private static final ApiSession VALID_API_SESSION = null;

	@Autowired
	private ApiSessionDaoImpl dao;
	
	@MockBean
	private ApiSessionRepository repository;
	
	@Test
	public void findByUsername_givenUsername_shouldInvokeRepository(){
        when(repository.findByUsername(VALID_USERNAME)).thenReturn(VALID_API_SESSION);

        dao.findByUsername(VALID_USERNAME);
        
        verify(repository, times(1)).findByUsername(VALID_USERNAME);
	}
}
