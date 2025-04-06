package com.shayan.week1Introduction.IntroductionToSpringBoot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//to create our own beans inside the AppConfig class
@Configuration
public class AppConfig {
    @Bean
    Apple getApple(){
        return new Apple();
    }
}
