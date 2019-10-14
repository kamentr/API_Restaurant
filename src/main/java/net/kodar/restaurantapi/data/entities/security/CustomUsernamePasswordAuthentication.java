package net.kodar.restaurantapi.data.entities.security;

import java.util.Collection;
import java.util.List;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;


public class CustomUsernamePasswordAuthentication extends UsernamePasswordAuthenticationToken{

	private String authToken;
	
	public CustomUsernamePasswordAuthentication(Object principal, Object credentials) {
		super(principal, credentials);
	}
	
	public CustomUsernamePasswordAuthentication(Object principal, Object credentials, String authToken) {
		super(principal, credentials);
		this.authToken = authToken;
	}

	public CustomUsernamePasswordAuthentication(String username, String password, String authToken,
			Collection<? extends GrantedAuthority> userAuthorities) {
		super(username, password, userAuthorities);
		this.authToken = authToken;
	}
	
	public CustomUsernamePasswordAuthentication(String username, String password,
			Collection<? extends GrantedAuthority> userAuthorities) {
		super(username, password, userAuthorities);
	}

	public String getAuthToken() {
		return authToken;
	}

	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}
	
}
