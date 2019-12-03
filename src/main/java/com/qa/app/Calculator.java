package com.qa.app;

public class Calculator {
	
	private MathOperation mathOperation;
	
	public Calculator(MathOperation mathOperation) {
		this.mathOperation = mathOperation;
	}
	
	public String execute(int num1, int num2) 
	{
		return mathOperation.calculate(num1, num2);
	}

	public MathOperation getMathOperation() {
		return mathOperation;
	}

	public void setMathOperation(MathOperation mathOperation) {
		this.mathOperation = mathOperation;
	}
	
	
}
