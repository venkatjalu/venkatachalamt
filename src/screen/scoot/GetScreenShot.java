package screen.scoot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetScreenShot {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\USER\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	
	WebElement findElement = driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']"));
	findElement.click();
	
	
	TakesScreenshot abc = (TakesScreenshot) driver;
	File screenshotAs = abc.getScreenshotAs(OutputType.FILE);
	System.out.println(screenshotAs);
	
	File sav = new File("C:\\Users\\USER\\eclipse-workspace\\Selenium\\ScreenShot\\first.png");
	FileUtils.copyFile(screenshotAs, sav);
	
	driver.close();
}
}
