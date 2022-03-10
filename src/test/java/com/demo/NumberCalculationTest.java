package com.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumberCalculationTest {
	
	NumberCalculation nc=new NumberCalculation();
	
//	@Test
//	public void testCase1() {
//		// first value test number, second value expected result
//		assertEquals(nc.add(1, 2), 100);
//	}
	@Test
	public void testCase2() {
		assertEquals(nc.add(2, 3), 5);
	}
	@Test
	public void testCase3() {
		assertEquals(nc.add(1, 2), 3);
	}
	@Test
	public void testCase4() {
		assertEquals(nc.convertCase("hello"), "HELLO");
	}
	
}
