package com.qa.app.operations;

import com.qa.app.MathOperation;

public class Subtractor implements MathOperation {

	public String calculate(int num1, int num2) {
		int result = num1 - num2;
		return String.format("the result is %s", result);
	}

}
