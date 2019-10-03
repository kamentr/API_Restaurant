//package net.kodar.restaurantapi.config;
//
//import java.io.IOException;
//import java.util.UUID;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.core.annotation.Order;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
//import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
//import org.springframework.stereotype.Component;
//
//import net.kodar.restaurantapi.data.entities.security.ApiSession;
//import net.kodar.restaurantapi.data.entities.security.CustomUsernamePasswordAuthentication;
//import net.kodar.restaurantapi.dataaccess.repository.ApiSessionRepository;
//
//public class CustomAuthenticationSuccessHandler extends SimpleUrlAuthenticationSuccessHandler {
//
//	@Autowired
//	private ApiSessionRepository sessionRepository;
//
//	@Override
//	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
//			Authentication authentication) throws IOException, ServletException {
//
//		String authUser = SecurityContextHolder.getContext().getAuthentication().getName();
//		String authToken = UUID.randomUUID().toString();
//
//		CustomUsernamePasswordAuthentication auth = (CustomUsernamePasswordAuthentication) authentication;
//		auth.setAuthToken(authToken);	
//
//		ApiSession newSession = new ApiSession(authUser, authToken);
//		sessionRepository.save(newSession);
//
//		response.setStatus(HttpServletResponse.SC_OK);
//	}
//}
