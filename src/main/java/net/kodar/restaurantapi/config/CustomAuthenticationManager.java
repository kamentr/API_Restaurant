package net.kodar.restaurantapi.config;

import java.util.List;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.ProviderManager;
import org.springframework.stereotype.Component;

@Component
public class CustomAuthenticationManager extends ProviderManager  {

	public CustomAuthenticationManager(List<AuthenticationProvider> providers) {
		super(providers);
	}
}
