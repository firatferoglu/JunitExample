package com.junit.example.JunitExample.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.Arrays;

public class ArraysCompareTest {

    @Test
    public void testArraySort_RandomArray() {
        int[] numbers = {12, 3, 4, 1};
        int[] expected = {1, 3, 4, 12};
        Arrays.sort(numbers);
        Assertions.assertArrayEquals(expected, numbers);
    }

    @Test
    public void testArraySort_NullArray() {
        Assertions.assertThrows(NullPointerException.class, () -> {
            int[] numbers = null;
            Arrays.sort(numbers);
        });
    }

    @Test
    public void testArraySort_Performance() {
        Assertions.assertTimeout(Duration.ofMillis(10), () -> {
            int[] array = {12, 23, 4};
            for (int i = 0; i < 1000000; i++) {
                array[0] = i;
                Arrays.sort(array);
            }
        });
    }
}
