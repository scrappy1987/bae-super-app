package test;

import static org.junit.Assert.assertEquals;

import com.qa.app.operations.Addition;

public class AdditionTest {

	private final Addition ADD = new Addition();

	private final int NUM1 = 4;

	private final int NUM2 = 2;

	private final int RESULT = 6;

	public void testAdd() {
		assertEquals("Incorrect value returned", "The result is " + RESULT, ADD.calculate(NUM1, NUM2));
	}
}
