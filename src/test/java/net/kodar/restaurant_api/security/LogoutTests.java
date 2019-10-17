package net.kodar.restaurant_api.security;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import net.kodar.restaurantapi.RestaurantApiApplication;
import net.kodar.restaurantapi.data.entities.security.ApiSession;
import net.kodar.restaurantapi.dataaccess.dao.apisession.ApiSessionDaoImpl;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RestaurantApiApplication.class)
@ActiveProfiles("test")
@AutoConfigureMockMvc
public class LogoutTests {
	@Autowired
	private MockMvc mvc;
	
	@MockBean
	private ApiSessionDaoImpl apiSessionDao;

	private static final String AUTHORIZATION_HEADER = "AUTHORIZATION";
	
	private static final String BASIC_AUTH = "Basic dXNlcjp1c2Vy";
	

	@Test
	public void logout_withAuthorizedUsernameAndPassword_statusShouldBe200() throws Exception {

	    mvc
	    .perform(get("/logout").header(AUTHORIZATION_HEADER, BASIC_AUTH))
	    .andExpect(status().isOk());
	}
	
	
	@Test
	public void login_withUnauthorizedUsername_statusShouldBe401() throws Exception {
		when(apiSessionDao.findByUsername("user")).thenReturn(new ApiSession());
		doNothing().when(apiSessionDao).delete(1);
		
	    mvc
	    .perform(get("/logout").header(AUTHORIZATION_HEADER, BASIC_AUTH))
	    .andExpect(status().isOk());
	    
		verify(apiSessionDao, times(1)).findByUsername("user");
		verify(apiSessionDao, times(1)).delete(0);

	}
}
