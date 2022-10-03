package alerrt.org;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\USER\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demo.automationtesting.in/Alerts.html");
	
	Thread.sleep(2000);
	WebElement findElement = driver.findElement(By.xpath("(//a[@class='analystic'])[1]"));
	findElement.click();
	
	WebElement findElement2 = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
	findElement2.click();
	Thread.sleep(2000);
	
	
	//simple alert
	Alert alert = driver.switchTo().alert();
	alert.accept();
	Thread.sleep(2000);
	
	
	
	
	//confirm alert
	WebElement findElement3 = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
	findElement3.click();
	Thread.sleep(2000);
	
	WebElement findElement4 = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
	findElement4.click();
	Thread.sleep(2000);
	
	Alert alert2 = driver.switchTo().alert();
	alert2.dismiss();
	Thread.sleep(2000);
	
	
	
	//prompt alert
	WebElement findElement5 = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
	findElement5.click();
	Thread.sleep(2000);
	
	WebElement findElement6 = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
	findElement6.click();
	Thread.sleep(2000);
	
	Alert alert3 = driver.switchTo().alert();
	alert3.sendKeys("Jaluvel");
	alert3.accept();
	Thread.sleep(4000);
	
	driver.close();
}
}
