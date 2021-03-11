package com.junit.example.JunitExample.utils;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomStringUtilsParameterizedTest {

    private CustomStringUtils customStringUtils;

    @BeforeEach
    public void generateCustomStringUtils() {
        this.customStringUtils = new CustomStringUtils();
    }

    @ParameterizedTest
    @CsvSource({"AACD,CD", "ACD,CD", "BCD,BCD"})
    public void testTruncateFirstTwo(String input, String expected) {
        assertEquals(expected, customStringUtils.truncateFirstTwo(input));
    }


}
