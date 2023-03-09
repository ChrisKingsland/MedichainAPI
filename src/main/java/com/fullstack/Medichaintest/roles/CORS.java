package com.fullstack.Medichaintest.roles;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class CORS implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/*")
                .allowedOrigins("https://4f4b-130-15-33-214.ngrok.io/api/v1/document/gettest")
                        .allowedMethods("GET", "POST", "PUT", "DELETE")
                        .allowedHeaders("")
                        .allowCredentials(true)
                        .maxAge(3600);
    }
}