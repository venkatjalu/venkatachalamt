package org.xpath.axes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\USER\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/s?k=iphone+13pro+max&crid=LHMMWIGXMU5Q&sprefix=iphone+13pro+max%2Caps%2C224&ref=nb_sb_ss_softlines-tsdoa-joint-contextual-iss_1_16");
	
	//WebElement findElement = driver.findElement(By.xpath
	//("((//span[text()='Apple iPhone 13 Pro Max (128GB) - Sierra Blue'])[3]//parent::a//parent::h2//parent::div//parent::div)[1]"));
	//System.out.println(findElement.getText());
	//System.out.println();

	WebElement findElemen = driver.findElement(By.xpath
	("(((//span[text()='Apple iPhone 13 Pro Max (128GB) - Sierra Blue'])[3]//parent::a//parent::h2//parent::div//following-sibling::div)[2]//child::span)[22]"));
	System.out.println(findElemen.getText()); 
	System.out.println();	
	
	WebElement findElement1 = driver.findElement(By.xpath("((//span[text()='Apple iPhone 13 Pro Max (128GB) - Sierra Blue'])[3]//parent::a//parent::h2//parent::div//parent::div)[1]//parent::span[@class='a-price-whole']"));
	System.out.println(findElement1.getText());
	
	driver.quit();
}
}
