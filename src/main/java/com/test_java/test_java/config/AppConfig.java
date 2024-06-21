package com.test_java.test_java.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    /**
     * Bean configuration for ModelMapper.
     * 
     * @return An instance of ModelMapper to be used for mapping objects.
     */
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
