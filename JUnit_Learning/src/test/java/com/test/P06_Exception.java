package com.test;

import org.junit.Test;

public class P06_Exception {
	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void test() {
//		System.out.println("test");
//		int i = 10/0;
//		System.out.println(i);
		
		int a[] = {1,2,3,4,5};
		System.out.println(a[6]);
	}
}
