package com.springproject.config;

import org.springframework.context.annotation.*;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.springproject.dao")
@ComponentScan(basePackages = "com.springproject")
@Configuration
@PropertySources({
        @PropertySource("classpath:application.properties")
})
public class AppConfig {

}
