package basic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import connection.DriverConnection;

public class P007_WindowHandle {
	public static void main(String[] args) throws InterruptedException {
		String url = "https://demo.guru99.com/popup.php";
		WebDriver driver = DriverConnection.getDriver(url);
		WebElement link = driver.findElement(By.linkText("Click Here"));
		link.click();
		String mainWin = driver.getWindowHandle();
		Set<String> allWin = driver.getWindowHandles();
		for (String w : allWin) {
			System.out.println(w);
			if (!mainWin.equals(w)) {
				driver.switchTo().window(w);
				Thread.sleep(2000);
				driver.findElement(By.name("emailid")).sendKeys("selenium@gmail.com");
				driver.findElement(By.name("btnLogin")).click();
			}
		}
		driver.quit();
	}
}
