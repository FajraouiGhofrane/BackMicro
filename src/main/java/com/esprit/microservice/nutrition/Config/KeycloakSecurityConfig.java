//package com.esprit.microservice.nutrition.Config;
//
//import lombok.RequiredArgsConstructor;
//import org.keycloak.adapters.springsecurity.KeycloakConfiguration;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.core.session.SessionRegistryImpl;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.web.authentication.session.RegisterSessionAuthenticationStrategy;
//import org.springframework.security.web.authentication.session.SessionAuthenticationStrategy;
//
//
//
//@KeycloakConfiguration
//@RequiredArgsConstructor
//@EnableWebSecurity
//@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled = true, jsr250Enabled = true)
//@Configuration
//
//public class KeycloakSecurityConfig {
//    @Bean
//    public SessionAuthenticationStrategy sessionAuthenticationStrategy() {
//        return new RegisterSessionAuthenticationStrategy(new SessionRegistryImpl());
//    }
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        http
//                .csrf(csrf -> csrf.disable()) // Explicitly disabling CSRF
//                .authorizeHttpRequests(authorize -> authorize
//                       .requestMatchers("/api/*").hasAuthority("user")
//                        .requestMatchers("/nutritions/user/*").hasAuthority("user")
//                       // .requestMatchers("/nutritions/admin/**").hasAuthority("admin")
//                        .anyRequest().authenticated()
//                );
//        return http.build();
//    }
//}
