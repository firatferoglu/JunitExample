package com.junit.example.JunitExample.utils;

import org.springframework.util.ObjectUtils;

public class CustomStringUtils {

    public String truncateFirstTwo(String value) {
        if (ObjectUtils.isEmpty(value)) {
            return value;
        }
        if (value.length() < 2) {
            return value.replaceAll("A", "");
        }
        return value.substring(0,2).replaceAll("A", "") + value.substring(2);
    }

    public boolean controlFirstAndLastTwoCharacter(String value) {
        if(ObjectUtils.isEmpty(value) || value.length() == 1) {
            return false;
        }
        String firstTwo = value.substring(0, 2);
        String lastTwo = value.substring(value.length()-2);
        return firstTwo.equals(lastTwo);
    }
}
