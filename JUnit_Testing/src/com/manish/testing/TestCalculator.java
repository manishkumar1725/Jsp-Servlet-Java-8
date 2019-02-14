package com.manish.testing;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCalculator {
	
	Calculator calculate;
	
	@Before
	public void init()
	{
		calculate = new Calculator();
		
		
		
	}

	@Test
	public void testSum() {
		
		assertEquals(15,calculate.sum(10,5));
	}  
	
	@Test
	public void testSubtract() {
		
		assertEquals(5,calculate.subtract(10,5));
		
	}
	@Test
	public void testMultiply() {
		
		assertEquals(9,calculate.multiply(3,3));
		
	}
	@Test
	public void testDivide() {
		
		assertEquals(3,calculate.divide(9,3));
		
	}
	
	
	
	@After
	public void destroy()
	{
		calculate = null;
		
	}
	

}
