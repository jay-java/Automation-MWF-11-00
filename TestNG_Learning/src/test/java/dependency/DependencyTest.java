package dependency;

import org.testng.annotations.Test;

public class DependencyTest {
	@Test(priority = 1)
	public void CA() {
		System.out.println("create account");
	}

	@Test(priority = 2)
	public void login() {
		int i = 10 / 0;
		System.out.println(i);
		System.out.println("login");
	}

	@Test(priority = 3,dependsOnMethods = "login")
	public void profile() {

		System.out.println("profile");
	}

	@Test(priority = 4,dependsOnMethods = "login")
	public void changePass() {
		System.out.println("change password");
	}

	@Test(priority = 5,dependsOnMethods = "login")
	public void logout() {
		System.out.println("logout");
	}
}
