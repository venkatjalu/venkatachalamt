package javascript.executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\USER\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	driver.get("http://greenstech.in/selenium-course-content.html");
	Thread.sleep(2000);
	
	WebElement findElement = driver.findElement(By.xpath
			("(//div[@class='col-md-3 short-desc-with-logo widget widget_text'])[1]"));
	
	

	
	JavascriptExecutor scr = (JavascriptExecutor)driver;
	scr.executeScript("arguments[0].scrollIntoView(true)", findElement);
	
	// need to print value still i am not getting
	Object value = scr.executeScript("return arguments[0].getAttribute('value')", findElement);
	System.out.println(value);
	
	
	driver.close();
}
}
