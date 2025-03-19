package com.student.studentportal.SecurityConfig;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
// import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import org.springframework.security.config.http.SessionCreationPolicy;
// import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

@Configuration
public class Config {

    public CorsConfigurationSource corsConfigurationSource() {
        CorsConfiguration configuration = new CorsConfiguration();
        configuration.setAllowedOrigins(List.of("http://localhost:3000")); // React frontend URL
        configuration.setAllowedMethods(List.of("GET", "POST", "PUT", "DELETE", "OPTIONS"));
        configuration.setAllowedHeaders(List.of("Authorization", "Content-Type"));

        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", configuration);
        return source;
    }

    // @Bean
    // public SecurityFilterChain securityFilterChain(HttpSecurity http) throws
    // Exception {
    // http
    // .csrf(csrf -> csrf.disable()) // Disable CSRF for stateless APIs
    // .cors(cors -> cors.configurationSource(corsConfigurationSource())) // Enable
    // CORS
    // .sessionManagement(session ->
    // session.sessionCreationPolicy(SessionCreationPolicy.STATELESS)) // Ensure
    // // stateless
    // // sessions
    // .authorizeHttpRequests(auth -> auth
    // .requestMatchers("/api/**").permitAll() // Public APIs
    // // Admin APIs require ADMIN role
    // .anyRequest().authenticated() // All other requests require authentication
    // )
    // .httpBasic(); // Enable Basic Authentication (remove if using JWT)

    // return http.build();
    // }

}
