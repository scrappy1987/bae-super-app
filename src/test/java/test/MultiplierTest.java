package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.qa.app.operations.Multiplier;

public class MultiplierTest {

	private final Multiplier MULTIPLY = new Multiplier();

	private final int NUM1 = 4;

	private final int NUM2 = 2;

	private final int RESULT = 8;

	@Test
	public void testMultiply() {
		assertEquals("Incorrect value returned", "The result is " + RESULT, MULTIPLY.calculate(NUM1, NUM2));
	}
}
