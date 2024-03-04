package org.example._2024_02_14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MathTest {
    private static final Math MATH = new Math();
    private static int NUM1 = 5;
    private static int NUM2 = 3;


    @Test
    void sumTest() {
        Assertions.assertEquals(25, MATH.sum(NUM1, NUM2));
    }

    @Test
    void power() {
        Assertions.assertEquals(1000, MATH.power(NUM1,NUM2));
    }

    @Test
    void factorial() {
        Assertions.assertEquals(120, MATH.factorial(NUM1,NUM2));
    }

    @Test
    void absolute() {
        Assertions.assertEquals(5, MATH.absolute(NUM1));
    }
}