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
import net.kodar.restaurantapi.business.transformer.param.account.AccountParamTransformer;
import net.kodar.restaurantapi.data.entities.Account;
import net.kodar.restaurantapi.presentation.param.AccountParam;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RestaurantApiApplication.class)
@ActiveProfiles("test")
@Configuration
public class AccountParamTransformerTests {
	
	@Autowired
	private AccountParamTransformer ptr;
	
	private static Account VALID_ACCOUNT = null;
	
	private static AccountParam PARAM_ACCOUNT = null;
	
	@Before
	public void setUp() {
		VALID_ACCOUNT = new Account();
		PARAM_ACCOUNT = new AccountParam();
	}
	
	@Test
	public void apply_whenGivenValidAccount_ShouldReturnAccount(){
		Account result = ptr.apply(PARAM_ACCOUNT, VALID_ACCOUNT);
		
		assertEquals(result, VALID_ACCOUNT);
	}
	
	@Test
	public void apply_whenGivenNull_ShouldReturnNewAccount(){
		Account result = ptr.apply(PARAM_ACCOUNT, null);
		
		assertEquals(result, VALID_ACCOUNT);
	}
}
