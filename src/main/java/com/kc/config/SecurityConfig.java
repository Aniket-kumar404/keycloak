package com.kc.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.oauth2.client.oidc.web.logout.OidcClientInitiatedLogoutSuccessHandler;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	
	
	@Autowired
	private ClientRegistrationRepository clientRegistrationRepository;


	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
	    http
	        .authorizeHttpRequests(auth -> auth
	            .requestMatchers("/", "/index.html").permitAll()
	            .anyRequest().authenticated()
	        )
	        .oauth2Login(Customizer.withDefaults())
	        .logout(logout -> logout
	            .logoutSuccessHandler(oidcLogoutSuccessHandler())
	        );
	    return http.build();
	}

	@Bean
	public LogoutSuccessHandler oidcLogoutSuccessHandler() {
	    OidcClientInitiatedLogoutSuccessHandler successHandler =
	        new OidcClientInitiatedLogoutSuccessHandler(clientRegistrationRepository);

	    successHandler.setPostLogoutRedirectUri("http://localhost:8088/user");
	    return successHandler;
	}

}
