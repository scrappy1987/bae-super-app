package com.qa.app.operations;

import com.qa.app.MathOperation;

public class Addition implements MathOperation {

	public String calculate(int num1, int num2) {
		return "The result is "  + (num1 +num2);
	}

}
