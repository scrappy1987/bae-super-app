package com.qa.app;

import com.qa.app.Subtractor;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SubtractorTest {

    @Test
    public void testSubtract(){
        Subtractor subtractor = new Subtractor();
        assertTrue(subtractor.Calculate(4, 2).equals("the result is 2"));
    }

}
