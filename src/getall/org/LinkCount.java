package getall.org;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkCount {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\USER\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/");
	
	// get the total count of link
	List<WebElement> alllinks = driver.findElements(By.tagName("a"));
	int size2 = alllinks.size();
	System.out.println(size2);
	
	for (WebElement link : alllinks) {
		String tagName = link.getTagName();
		System.out.println(tagName);
		
		String attribute = link.getAttribute("href");
		System.out.println(attribute);
		
		String attribute1 = link.getAttribute("title");
		System.out.println(attribute1);
       
	}

	
	driver.close();
}
}
