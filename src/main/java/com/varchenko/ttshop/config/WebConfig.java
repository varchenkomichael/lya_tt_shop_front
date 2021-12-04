package com.varchenko.ttshop.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.web.client.RestTemplate;

@Configuration
public class WebConfig {

    @Bean
    @Scope(value = "singleton")
    public RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder) {
       return restTemplateBuilder.build();
    }
}
