//package com.ezpz.ecom.ezstore.gateway.server.config;
//
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.web.server.ServerHttpSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.web.server.SecurityWebFilterChain;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig {
//
//	 @Bean
//	 public SecurityWebFilterChain springSecurityFilterChain(ServerHttpSecurity http) {
//	        http
//	            .csrf().disable()
//	            .authorizeExchange(exchanges -> exchanges
//	                .anyExchange().permitAll()
//	            );
//	        return http.build();
//	    }
//}