package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class P001_BrowserConnection {
	public static void main(String[] args) throws InterruptedException {
		// 1.chrome driver
		String url = "https://www.facebook.com/";
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(2000);

		WebElement emailEle = driver.findElement(By.id("email"));
		emailEle.sendKeys("selenium@gmail.com");
		WebElement passEle = driver.findElement(By.id("pass"));
		passEle.sendKeys("selenium@123");
		// 2.edge driver
//		String url = "https://www.facebook.com/";
//		System.setProperty("webdriver.edge.driver", "C:\\Users\\user\\Downloads\\edgedriver_win64\\msedgedriver.exe");
//		WebDriver driver = new EdgeDriver();
//		driver.get(url);
//		driver.manage().window().maximize();
//		Thread.sleep(2000);
//		driver.close();
	}
}
