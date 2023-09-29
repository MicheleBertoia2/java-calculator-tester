package org.java.lessons.calculator;

public class Calculator {
	
	public Calculator()
	{
		
	}
	
	public float add(float n1, float n2) throws Exception
	{
		if(Float.isNaN(n1) || Float.isNaN(n2))
			throw new Exception("Si prega di inserire numeri validi");
		return n1 + n2;
	}
	
	public float substract(float n1, float n2) throws Exception
	{
		if(Float.isNaN(n1) || Float.isNaN(n2))
			throw new Exception("Si prega di inserire numeri validi");
		return n1 - n2;
	}
	
	public float multiply(float n1, float n2) throws Exception
	{
		if(Float.isNaN(n1) || Float.isNaN(n2))
			throw new Exception("Si prega di inserire numeri validi");
		return n1 * n2;
	}
	
	public float divide(float n1, float n2) throws Exception
	{
		if(Float.isNaN(n1) || Float.isNaN(n2))
			throw new Exception("Si prega di inserire numeri validi");
		
		if( n2 == 0)
			throw new Exception("Non puoi dividere per 0");
		return n1 / n2;
	}
}
