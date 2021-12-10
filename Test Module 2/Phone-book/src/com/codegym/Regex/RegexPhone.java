package com.codegym.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPhone {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String PHONE_REGEX = "^[0][\\d]{9}$";

    public RegexPhone() {
        pattern = Pattern.compile(PHONE_REGEX);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
