package br.com.fiap.fiaplus.configuration;

import br.com.fiap.fiaplus.mapper.VideoMapper;
import br.com.fiap.fiaplus.mapper.VideoMapperImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FiaplusConfiguration {

    @Bean
    public VideoMapper getVideoMapper(){
        return new VideoMapperImpl();
    }

}