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
import net.kodar.restaurantapi.business.transformer.result.account.AccountResultTransformer;
import net.kodar.restaurantapi.data.entities.Account;
import net.kodar.restaurantapi.presentation.result.AccountResult;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RestaurantApiApplication.class)
@ActiveProfiles("test")
@Configuration
public class AccountResultTransformerTests {

	private static final Long VALID_ID = 1L;

	@Autowired
	private AccountResultTransformer rtr;
	
	private static Account VALID_ACCOUNT = null;
	
	@Before
	public void setUp() {
		VALID_ACCOUNT = new Account();
		VALID_ACCOUNT.setId(VALID_ID);
	}
	
	@Test
	public void apply_whenGivenValidAccount_ShouldReturnAccount(){
		AccountResult result = rtr.apply(VALID_ACCOUNT);
		
		assertEquals(result.getId(), VALID_ACCOUNT.getId());
	}
	
	@Test(expected = NullPointerException.class)
	public void apply_whenGivenNull_ShouldReturnNewAccount(){
		AccountResult result = rtr.apply(null);
	}
}
