package com.codegym;

import org.junit.jupiter.api.Test;

import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {
    @Test
    void testUpDate01012018() throws ParseException {
        String date= "01/01/2018";
        String expected= "02/01/2018";
        String result= NextDayCalculator.upDate(date);
        assertEquals(expected,result);
    }
    @Test
    void testUpDate31012018() throws ParseException {
        String date= "31/01/2018";
        String expected= "01/02/2018";
        String result= NextDayCalculator.upDate(date);
        assertEquals(expected,result);
    }
    @Test
    void testUpDate30042018() throws ParseException {
        String date= "30/04/2018";
        String expected= "01/05/2018";
        String result= NextDayCalculator.upDate(date);
        assertEquals(expected,result);
    }
    @Test
    void testUpDate28022018() throws ParseException {
        String date= "28/02/2018";
        String expected= "01/03/2018";
        String result= NextDayCalculator.upDate(date);
        assertEquals(expected,result);
    }
    @Test
    void testUpDate29022020() throws ParseException {
        String date= "29/02/2020";
        String expected= "01/03/2020";
        String result= NextDayCalculator.upDate(date);
        assertEquals(expected,result);
    }
    @Test
    void testUpDate31122018() throws ParseException {
        String date= "31/12/2018";
        String expected= "01/01/2019";
        String result= NextDayCalculator.upDate(date);
        assertEquals(expected,result);
    }
}