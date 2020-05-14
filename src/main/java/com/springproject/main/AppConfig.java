package com.springproject.main;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.*;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@ComponentScan(basePackages = "com.springproject")
@Configuration
@PropertySources({
        @PropertySource("classpath:application.properties")
})
@EnableJpaRepositories(basePackages = "com.springproject.dao")
public class AppConfig {

}
