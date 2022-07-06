package com.sadra.show.config;


import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * model mapper configuration
 */
@Configuration
public class ModelMapperConfig {

    /**
     * create been for mapping class
     *
     * @return {@link ModelMapper}
     */
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();

    }
}
