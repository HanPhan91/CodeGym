package com.codegym;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbsoluteNumberCalculatorTest {
    @Test
    void findAbsolute0(){
        int number=0;
        int expected=0;
        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected, result);
    }
    @Test
    void findAbsolute1(){
        int number= -1;
        int expected= 1;
        int result= AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected, result);
    }

}