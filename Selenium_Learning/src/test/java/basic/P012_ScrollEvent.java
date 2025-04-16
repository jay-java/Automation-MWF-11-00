package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import connection.DriverConnection;

public class P012_ScrollEvent {
	public static void main(String[] args) {
		String url = "https://demoqa.com/automation-practice-form";
		WebDriver driver = DriverConnection.getDriver(url);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//1.scroll by pixel
//		js.executeScript("window.scrollBy(0,350)", "");
		
		
		
		//2.scroll by element
//		WebElement address = driver.findElement(By.id("currentAddress"));
//		js.executeScript("arguments[0].scrollIntoView();", address);
//		address.sendKeys("ahmedabad");
		
		
		//3.scroll by height
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}
}
