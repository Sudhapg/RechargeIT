package com.JUnitCalculatorApplication.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.JUnitCalculatorApplication.services.CalculatorServices;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testAdd() {
		/*
		 * int n = 2; int m = 1; int expected = 3; CalculatorServices calc = new
		 * CalculatorServices(); int actual = (int)calc.Add(n, m);
		 * assertEquals(expected,actual);
		 */
		
	
		assertEquals(3,new CalculatorServices().Add(1, 2));
		//fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testSubtract() {
		assertEquals(2,new CalculatorServices().Subtract(4, 2));
		//fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testMultiply() {
		assertEquals(8,new CalculatorServices().Multiply(2, 4));
		//fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testDivide() {
		
		//first argument is the expected and the second argument is the actual
		assertEquals(1.5,new CalculatorServices().Divide(3,2),0);
		
		//fail("Not yet implemented"); // TODO
	}

}
