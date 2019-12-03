package com.qa.app;

import com.qa.app.Subtractor;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SubtractorTest {

    private int numberOne = 4;
    private int numberTwo = 2;
    private String message = "the result is 2";

    @Test
    public void testSubtract(){
        Subtractor subtractor = new Subtractor();
        assertTrue(subtractor.Calculate(numberOne, numberTwo).equals(message));
    }

}
