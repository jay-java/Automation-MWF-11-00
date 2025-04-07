package basic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import connection.DriverConnection;

public class P006_Alerts {
	public static void main(String[] args) throws InterruptedException {
		String url = "https://demoqa.com/alerts";
		WebDriver driver = DriverConnection.getDriver(url);
		
		//1.alert
//		WebElement btn1 = driver.findElement(By.id("alertButton"));
//		btn1.click();
//		Alert alert = driver.switchTo().alert();
//		Thread.sleep(2000);
//		alert.accept();
//		
		//2.alert
//		WebElement btn2 = driver.findElement(By.id("timerAlertButton"));
//		btn2.click();
//		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.alertIsPresent());
//		Alert alert = driver.switchTo().alert();
//		alert.accept();
		
		
		//3.alert
//		WebElement btn3 = driver.findElement(By.id("confirmButton"));
//		btn3.click();
//		Alert alert = driver.switchTo().alert();
//		Thread.sleep(2000);
//		alert.dismiss();
		
		//4.alert
		WebElement btn4 = driver.findElement(By.id("promtButton"));
		btn4.click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		alert.sendKeys("hello testers");
		alert.accept();
	}
}
