package com.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class P04_Annotations {
	@Test
	public void test1() {
		System.out.println("test 1");
	}

	@Test
	public void test2() {
		System.out.println("test 2");
	}

	@Before
	public void before() {
		System.out.println("before method");
	}

	@After
	public void after() {
		System.out.println("after method");
	}

	@BeforeClass
	public static void beforeClass() {
		System.out.println("before class");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("after class");
	}
}
