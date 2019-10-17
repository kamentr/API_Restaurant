package net.kodar.restaurantapi.config;

import java.io.IOException;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.annotations.Filter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import net.kodar.restaurantapi.data.entities.ApiBasicAuthentication;
import net.kodar.restaurantapi.data.entities.security.CustomUsernamePasswordAuthentication;

@Filter(name = "preAuthFilter")
@Component
public class CustomPreAuthenticationFilter extends OncePerRequestFilter {

	private static final String AUTHENTICATION_TOKEN = "authToken";

	private static final String AUTHENTICATION_BASIC = "Authorization";

	@Autowired
	private ApiCredentials apiCredentials;

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
			throws ServletException, IOException {

		Authentication auth = apiCredentials.getAuthentication();
		//if (null != auth) {
			CustomUsernamePasswordAuthentication authentication = (CustomUsernamePasswordAuthentication) auth;

			final String tokenURLparam = request.getParameter("token");

			final HttpServletRequest httpRequest = (HttpServletRequest) request;

			if (authentication == null) {
				authentication = TokenAuthentication(httpRequest, tokenURLparam);
			}

			if (authentication == null) {
				authentication = BAAuthentication(httpRequest);
			}

			SecurityContextHolder.getContext().setAuthentication(authentication);

			response.addHeader("Access-Control-Allow-Origin", "*");
			response.setHeader("Access-Control-Allow-Origin", "*");
		
		chain.doFilter(request, response);
	}

	@SuppressWarnings("unused")
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

	private CustomUsernamePasswordAuthentication TokenAuthentication(HttpServletRequest httpRequest,
			String tokenURLparam) {

		String token = tokenURLparam;
		if (token == null)
			token = httpRequest.getHeader(AUTHENTICATION_TOKEN);
		if (token != null) {
			CustomUsernamePasswordAuthentication authentication = new CustomUsernamePasswordAuthentication("", "",
					token);

			return authentication;
		}

		return null;
	}
}