package net.kodar.restaurant_api.security;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import net.kodar.restaurantapi.RestaurantApiApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RestaurantApiApplication.class)
@ActiveProfiles("test")
@AutoConfigureMockMvc
public class LoginFormTests {

	@Autowired
	private MockMvc mvc;
	
	private static final String AUTHORIZATION_HEADER = "AUTHORIZATION";
	
	private static final String BASIC_AUTH = "Basic dXNlcjp1c2Vy";
	
	@Test
	public void login_withAuthorizedUsername_statusShouldBe200() throws Exception {

	    mvc
	    .perform(get("/login").header(AUTHORIZATION_HEADER, BASIC_AUTH))
	    .andExpect(status().isOk());
	}
	
	@Test
	public void login_withUnauthorizedUsername_statusShouldBe401() throws Exception {

	    mvc
	    .perform(get("/login").header(AUTHORIZATION_HEADER, BASIC_AUTH + "randomString"))
	    .andExpect(status().isUnauthorized());
	}
	
}
