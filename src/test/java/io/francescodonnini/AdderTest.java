package io.francescodonnini;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AdderTest {
    @Test
    void testAdder() {
        Adder adder = new Adder(0.0);
        for (int i = 0; i < 100; i++) {
            adder.add(0.2);
        }
        Assertions.assertEquals(20.0, adder.getResult());
    }
}
