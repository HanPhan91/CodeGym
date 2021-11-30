package com.codegym;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class NextDayCalculator {
    public static String upDate(String dateString) throws ParseException {
        SimpleDateFormat df= new SimpleDateFormat("dd/MM/yyy");
        Calendar mCalendar= Calendar.getInstance();
        Date date = df.parse(dateString);
        mCalendar.setTime(date);
        mCalendar.add(Calendar.DATE, 1);
        return df.format(mCalendar.getTime());
    }
}
