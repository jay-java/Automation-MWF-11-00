package listeners;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import conn.DriverConnection;

public class FB {
	
	@Test
	public void login(ITestContext con) {
		String url ="https://www.facebook.com/";
		WebDriver driver = DriverConnection.getDriver(url);
		con.setAttribute("myDriver", driver);
		WebElement emailEle = driver.findElement(By.name("email"));
		WebElement passEle = driver.findElement(By.name("pass"));
		emailEle.sendKeys("selenium@gmail.com");
		passEle.sendKeys("selenium@123");
		assertEquals(driver.getTitle(), "Facebook");
		
	}
}
