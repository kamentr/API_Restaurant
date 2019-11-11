package net.kodar.restaurantapi.config;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

@Component
public class ApiCredentials {

	public Authentication getAuthentication() {
		SecurityContext scont = SecurityContextHolder.getContext();
		if( scont == null ) return null;
		else return scont.getAuthentication();
	}
}