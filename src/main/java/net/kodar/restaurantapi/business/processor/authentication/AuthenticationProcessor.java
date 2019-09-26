package net.kodar.restaurantapi.business.processor.authentication;

import org.springframework.security.core.userdetails.UserDetailsService;


interface AuthenticationProcessor {
	public void logout();
	public String login();
}
