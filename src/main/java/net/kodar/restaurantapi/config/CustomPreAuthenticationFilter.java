package net.kodar.restaurantapi.config;

import java.io.IOException;
import java.security.Principal;
import java.util.Base64;
import java.util.Enumeration;
import java.util.List;
import java.util.UUID;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.annotations.Filter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;
import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.GenericFilterBean;
import org.springframework.web.filter.OncePerRequestFilter;

import net.kodar.restaurantapi.data.entities.ApiBasicAuthentication;
import net.kodar.restaurantapi.data.entities.ApiUser;
import net.kodar.restaurantapi.data.entities.security.ApiSession;
import net.kodar.restaurantapi.data.entities.security.CustomUsernamePasswordAuthentication;
import net.kodar.restaurantapi.dataaccess.dao.apiuser.ApiUserDaoImpl;
import net.kodar.restaurantapi.dataaccess.repository.ApiSessionRepository;

@Filter(name = "preAuthFilter")
@Component
public class CustomPreAuthenticationFilter extends OncePerRequestFilter {

	private static final String AUTHENTICATION_TOKEN = "authToken";

	private static final String AUTHENTICATION_BASIC = "Authorization";

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
			throws ServletException, IOException {

		CustomUsernamePasswordAuthentication authentication = (CustomUsernamePasswordAuthentication) SecurityContextHolder
				.getContext().getAuthentication();

		final HttpServletRequest httpRequest = (HttpServletRequest) request;

		if (authentication == null) {
			authentication = TokenAuthentication(httpRequest);
		}

		if (authentication == null) {
			authentication = BAAuthentication(httpRequest);
		}

		SecurityContextHolder.getContext().setAuthentication(authentication);
		chain.doFilter(request, response);
	}

	private CustomUsernamePasswordAuthentication BAAuthentication(HttpServletRequest httpRequest) {

		ApiBasicAuthentication basicAuthHeader = new ApiBasicAuthentication(
				httpRequest.getHeader(AUTHENTICATION_BASIC));

		if (basicAuthHeader != null) {

			String username = basicAuthHeader.getUsername();
			String password = basicAuthHeader.getPassword();

			CustomUsernamePasswordAuthentication authentication = new CustomUsernamePasswordAuthentication(username,
					password);
			return authentication;
		}

		return null;
	}

	private CustomUsernamePasswordAuthentication TokenAuthentication(HttpServletRequest httpRequest) {

		String accessAuthToken = httpRequest.getHeader(AUTHENTICATION_TOKEN);

		if (accessAuthToken != null) {

			CustomUsernamePasswordAuthentication authentication = new CustomUsernamePasswordAuthentication("", "",
					accessAuthToken);

			return authentication;
		}

		return null;
	}
}