package com.qa.app.operations;

import com.qa.app.MathOperation;

public class Multiplier implements MathOperation {
	
	public String calculate(int num1, int num2) {
		int output = num1 * num2;
		return ("The result is " + output);
	}
}
