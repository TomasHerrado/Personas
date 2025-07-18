package com.example.demo.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringDocConfig {
    @Bean
    public OpenAPI customOpenAPI(
            @Value("${app.name}") String appName,
            @Value("${app.desc}") String appDescription,
            @Value("${app.version}") String appVersion,
            @Value("${app.dev-name}") String devName,
            @Value("${app.dev-email}") String devEmail) {

        return new OpenAPI()
                .info(new Info()
                        .title(appName)
                        .version(appVersion)
                        .description(appDescription)
                        .contact(new Contact()
                                .name(devName)
                                .email(devEmail)));
    }
}
