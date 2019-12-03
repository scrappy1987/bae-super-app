package com.qa.app;

import com.qa.app.operations.Addition;
import com.qa.app.operations.Multiplier;
import com.qa.app.operations.Subtractor;

public class App {

	public static void main(String[] args) {
		Calculator calc = new Calculator(new Addition());
		System.out.println(calc.execute(2, 2));
		calc.setMathOperation(new Subtractor());
		System.out.println(calc.execute(4, 2));
		calc.setMathOperation(new Multiplier());
		System.out.println(calc.execute(4, 2));
	}

}
