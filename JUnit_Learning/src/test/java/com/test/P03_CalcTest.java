package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class P03_CalcTest {
	
	@Test
	public void addTest() {
		Calc c = new Calc();
		int actual = c.add(2, 2);
		int expected = 4;
		assertEquals(expected, actual);
	}
}
