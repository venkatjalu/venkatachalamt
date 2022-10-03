package getall.org;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetImgCount {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\USER\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	
	List<WebElement> allimg = driver.findElements(By.tagName("img"));
	int size = allimg.size();
	System.out.println(size);
	for (WebElement img : allimg) {
		Dimension size2 = img.getSize();
		System.out.println(size2);
		
		String tagName = img.getTagName();
        System.out.println(tagName);
        
        String attribute = img.getAttribute("alt");
        System.out.println(attribute);
		
	}
		
	driver.close();
}
}
