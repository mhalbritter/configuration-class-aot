package com.example.demo;

import java.util.concurrent.atomic.AtomicInteger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Moritz Halbritter
 */
class B {
    private static final Logger LOGGER = LoggerFactory.getLogger(B.class);

    private static final AtomicInteger INSTANCE_COUNTER = new AtomicInteger();

    private final int instance;

    B() {
        this.instance = INSTANCE_COUNTER.incrementAndGet();
        LOGGER.info("B<init>(): {}", this.instance);
    }

    void b() {
        LOGGER.info("b(): {}", this.instance);
    }
}
