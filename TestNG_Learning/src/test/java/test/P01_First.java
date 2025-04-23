package test;

import org.testng.annotations.Test;

public class P01_First {
	@Test
	public void test1() {
		System.out.println("test 1");
	}

	@Test(enabled = false)
	public void test2() {
		System.out.println("test 2");
	}

	@Test
	public void test3() {
		System.out.println("test 3");
	}
}
