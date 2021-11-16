package com.codegym;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws ParseException {
	// write your code here
        NextDayCalculator c1= new NextDayCalculator();
        System.out.println(c1.upDate("01/01/2018"));
    }
}
