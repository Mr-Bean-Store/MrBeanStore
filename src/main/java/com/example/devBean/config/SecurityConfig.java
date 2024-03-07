package com.example.devBean.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    
    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http
            .authorizeHttpRequests( auth -> {
                auth.requestMatchers("/").permitAll(); // anyone has access to the home route
                auth.anyRequest().authenticated(); // 
            })
            .oauth2Login(Customizer.withDefaults()) // instead, oauth2 login is used 
            .formLogin(Customizer.withDefaults()) // for normal username and password
            .build();
    }
}
