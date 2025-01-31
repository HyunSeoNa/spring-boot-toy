package com.example.springboottoy.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * fileName     : SwaggerConfig.java
 * author       : hyunseo
 * date         : 2025. 1. 31.
 * description  : Swagger Config
 */
@Configuration
public class SwaggerConfig {
        @Bean
        public OpenAPI openAPI() {
            return new OpenAPI()
                    .components(new Components())
                    .info(apiInfo());}
        private Info apiInfo() {
            return new Info()
                    .title("NB-IoT Manager")
                    .description("NB-IoT Manager")
                    .version("1.0.0");
        }
}
