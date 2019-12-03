package com.qa.app;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SubtractorTest {

    private int number_one = 4;
    private int number_two = 2;
    private String message = "the result is 2";

    @Test
    public void testSubtract(){
        Subtractor subtractor = new Subtractor();
        assertTrue(subtractor.Calculate(number_one, number_two).equals(message));
    }

}
