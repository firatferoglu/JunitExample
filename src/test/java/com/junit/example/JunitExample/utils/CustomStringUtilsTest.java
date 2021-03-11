package com.junit.example.JunitExample.utils;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CustomStringUtilsTest {

    CustomStringUtils customStringUtils = new CustomStringUtils();

    @BeforeAll
    public static void beforeAllMethod() {
        System.out.println("Before All Method");
    }

    @Test
    public void testTruncateFirstTwo() {
        assertEquals("CD", customStringUtils.truncateFirstTwo("AACD"));
    }

    @Test
    public void testControlFirstAndLastTwoCharacter_BasicNegativeScenario() {
        assertFalse(customStringUtils.controlFirstAndLastTwoCharacter("ABCD"));
    }

    @Test
    public void testControlFirstAndLastTwoCharacter_BasicPositiveScenario() {
        assertTrue(customStringUtils.controlFirstAndLastTwoCharacter("ABAB"));
    }

    @Test
    public void testControlFirstAndLastTwoCharacter_NullParameter() {
        assertFalse(customStringUtils.controlFirstAndLastTwoCharacter(null));
    }

    @Test
    public void testControlFirstAndLastTwoCharacter_OneLengthParameter() {
        assertFalse(customStringUtils.controlFirstAndLastTwoCharacter("A"));
    }

    @Test
    public void testControlFirstAndLastTwoCharacter_TwoLengthParameter() {
        assertTrue(customStringUtils.controlFirstAndLastTwoCharacter("AB"));
    }
}
