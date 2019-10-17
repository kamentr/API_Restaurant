package net.kodar.restaurantapi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class ApiBeanConfiguration {
    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    @Primary
    public CustomPreAuthenticationFilter authFilter() {
    	return new CustomPreAuthenticationFilter();
    }

    @Bean
    public SecurityContext securityContext() {
        new SecurityContextHolder();
		return SecurityContextHolder.getContext();
    }

}
