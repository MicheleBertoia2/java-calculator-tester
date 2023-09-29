package org.jva.lessons.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.java.lessons.calculator.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	private Calculator clc;
	
	@BeforeEach
	public void beforeEach()
	{
		clc = new Calculator();
	}
	
	@Test
	@DisplayName("test somma due numeri validi")
	public void testSumValidNum()
	{
		float value = 0;
		try {
			value = clc.add(2.2f, 2.3f);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
		
		assertEquals(4.5f, value);
	}
	
	
	@Test
	@DisplayName("test sottrazione due numeri validi")
	public void testSubstractValidNum()
	{
		float value = 0;
		try {
			value = clc.substract(4.2f, 2.1f);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
		
		assertEquals(2.1f, value);
	}
	
	
	@Test
	@DisplayName("test moltiplicazione due numeri validi")
	public void testMultiplyValidNum()
	{
		float value = 0;
		try {
			value = clc.multiply(1.0f, 2.5f);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
		
		assertEquals(2.5f, value);
	}
	
	
	@Test
	@DisplayName("test divisione due numeri validi")
	public void testDivideValidNum()
	{
		float value = 0;
		try {
			value = clc.divide(7.5f, 1.5f);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
		
		assertEquals(5.0f, value);
	}
	
	
	@Test
	@DisplayName("test divisione per 0")
	public void testDivideByZero()
	{
		assertThrows(Exception.class,
					() -> clc.divide(1.3f, 0),
					"dividing by 0 must throws exception");
	}
}
