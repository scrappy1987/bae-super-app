package com.qa.app;

public class Subtractor {

    public String Calculate(int numberOne, int numberTwo) {
        int result = numberOne - numberTwo;
        return String.format("the result is %s",  result);
    }

}
