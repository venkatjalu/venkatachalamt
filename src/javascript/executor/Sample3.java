package javascript.executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample3 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\USER\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://greenstech.in/selenium-course-content.html");
	
	WebElement findElement = driver.findElement(By.xpath
			("//div[@class='card-headerframework d-flex align-items-center justify-content-between']"));

    JavascriptExecutor abc =(JavascriptExecutor)driver;
    abc.executeScript("arguments[0].scrollIntoView('true')", findElement);
    
  
    driver.close();

}
}
