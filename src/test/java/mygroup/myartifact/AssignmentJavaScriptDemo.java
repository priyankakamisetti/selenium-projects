package mygroup.myartifact;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

public class AssignmentJavaScriptDemo {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement buttonclick = driver.findElement(By.xpath("//button[@ame='start']"));
		//buttonclick.click();
		
		AssignmentJavaScriptDemo js = (AssignmentJavaScriptDemo) driver;
		
		js.executeScript("arguments[0].click();",buttonclick);
		//scrolling
		 js.executeScript("window.scrollBy(0,500)");
		System.out.println("Scrolling Performed");
		
		//sendkeys
		WebElement name= driver.findElement(By.id("name"));
		
	     js.executeScript("arguments[0].value='Selenium;",name);
		
		

	}

	
		
	}

	
