package br.com.loanman.request.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ConfigurationService {
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
