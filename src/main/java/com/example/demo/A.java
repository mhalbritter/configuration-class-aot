package com.example.demo;

import java.util.concurrent.atomic.AtomicInteger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Moritz Halbritter
 */
class A {
    private static final Logger LOGGER = LoggerFactory.getLogger(A.class);

    private static final AtomicInteger INSTANCE_COUNTER = new AtomicInteger();

    private final int instance;

    private final B b;

    A(B b) {
        this.b = b;
        this.instance = INSTANCE_COUNTER.incrementAndGet();
        LOGGER.info("A<init>(): {}", this.instance);
    }

    void a() {
        LOGGER.info("a(): {}", this.instance);
        this.b.b();
    }
}
