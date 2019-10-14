package net.kodar.restaurantapi.config;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;
import org.springframework.security.web.context.SecurityContextPersistenceFilter;
import org.springframework.security.web.csrf.CsrfTokenRepository;
import org.springframework.security.web.csrf.HttpSessionCsrfTokenRepository;
import org.springframework.web.filter.OncePerRequestFilter;

import net.kodar.restaurantapi.business.processor.authentication.AuthenticationProcessorImpl;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private CustomAuthTokenAuthenticationProvider authenticationProvider;

	@Autowired
	private CustomBasicAuthenticationProvider basicAuthenticationProvider;
	
	@Autowired
	private CustomAuthenticationEntryPoint entryPoint;

	@Autowired
	private CustomAuthenticationManager authManager;
	
	@Autowired
	private CustomPreAuthenticationFilter preAuthFilter;

	@Autowired
	private AuthenticationProcessorImpl authProcessor;

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;


	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.parentAuthenticationManager(authManager);
		auth.authenticationProvider(authenticationProvider); 	
		auth.authenticationProvider(basicAuthenticationProvider);
	}

//	@Autowired
//	public void configureAuthentication(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
//		authenticationManagerBuilder.userDetailsService(authProcessor).passwordEncoder(passwordEncoder);
//	}

	@Override
    protected void configure(HttpSecurity http) throws Exception {
        http	
        .csrf().disable()
        .exceptionHandling().authenticationEntryPoint(entryPoint)
        .and()
        		.sessionManagement()
        		.sessionCreationPolicy(SessionCreationPolicy.STATELESS)
        .and()
                .addFilterBefore(preAuthFilter, UsernamePasswordAuthenticationFilter.class)
                .authorizeRequests()
                .antMatchers("/login", "/logout").permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin().disable()
                .logout().disable();
    }
	
	@Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers(
                "/resources/**", "/static/**", "/css/**", "/js/**", "/images/**",
                "/resources/static/**", "/css/**", "/js/**", "/img/**", "/fonts/**",
                "/images/**", "/scss/**", "/vendor/**", "/favicon.ico", "/auth/**", "/favicon.png",
                "/v2/api-docs", "/configuration/ui", "/configuration/security", "/swagger-ui.html",
                "/webjars/**", "/swagger-resources/**", "/swagge‌​r-ui.html", "/actuator",
                "/actuator/**");
    }

}
