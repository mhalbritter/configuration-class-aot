package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @author Moritz Halbritter
 */
@Configuration
class ABConfiguration {
    @Bean
    @Scope("prototype")
    A a() {
        return new A(b());
    }

    @Bean
    B b() {
        return new B();
    }
}
