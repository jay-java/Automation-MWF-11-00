package annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllAnno {
	@BeforeClass
	public static void beforeClass() {
		System.out.println("before class");
	}

	@Test
	public void test() {
		System.out.println("test fun");
	}
	
	@Test
	public void test2() {
		System.out.println("test2 fun");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("before test");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("after test");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("after class");
	}
}
