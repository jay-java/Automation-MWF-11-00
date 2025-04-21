package com.test;

import org.junit.Ignore;
import org.junit.Test;

public class P01_First {
	
	@Test
	public void test1() {
		System.out.println("test1 running");
	}
	@Test
	@Ignore
	public void test2() {
		System.out.println("test2 running");
	}
	@Test
	public void test3() {
		System.out.println("test3 running");
	}
	
	
}
