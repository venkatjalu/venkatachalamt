package javascript.executor;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\USER\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.google.com/search?q=URL+%3A+http%3A%2F%2Ftoolsqa.com%2F&rlz=1C1RXQR_enIN1019IN1019&oq=URL+%3A+http%3A%2F%2Ftoolsqa.com%2F&aqs=chrome.0.69i59j0i512j0i22i30j0i390l2.1787j0j7&sourceid=chrome&ie=UTF-8");
	
	
	WebElement findElement = driver.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[12]"));
	JavascriptExecutor scr=(JavascriptExecutor)driver;
	scr.executeScript("arguments[0].scrollIntoView(true)", findElement);
	Thread.sleep(2000);	
	
	scr.executeScript("arguments[0].click()", findElement);
	
	---
/*  WebElement findElement2 = driver.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[1]"));
	scr.executeScript("arguments[0].scrollIntoView(false)", findElement2);
	Thread.sleep(2000);
	
	driver.close();     */
	
}
}


