package net.kodar.restaurantapi.presentation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import net.kodar.restaurantapi.business.processor.authentication.AuthenticationProcessorImpl;

@Controller
public class AuthenticationService {

	@Autowired
	private AuthenticationProcessorImpl authProcessor;

	@GetMapping("/logout")
	@ResponseBody
	String logout() {
		authProcessor.logout();
		
		return "Successful logout!";
	}

	@GetMapping("/login")
	@ResponseBody
	String login() {
		String authToken = authProcessor.login();
		
		return authToken;
	}
}
