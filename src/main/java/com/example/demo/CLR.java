package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author Moritz Halbritter
 */
@Component
class CLR implements CommandLineRunner {
    private static final Logger LOGGER = LoggerFactory.getLogger(CLR.class);

    private final ObjectProvider<A> a;

    CLR(ObjectProvider<A> a) {
        this.a = a;
    }

    @Override
    public void run(String... args) throws Exception {
        LOGGER.info("run()");
        this.a.getIfAvailable().a();
        this.a.getIfAvailable().a();
    }
}
