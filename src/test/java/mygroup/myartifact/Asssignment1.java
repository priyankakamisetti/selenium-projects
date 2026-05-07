package mygroup.myartifact;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Asssignment1 {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//parent
		driver.findElement
		(By.xpath("//input[@id='name']/parent::div[@class='form-group']//input"))
		.sendKeys("Priyanka");

		//child
		
		driver.findElement(By.xpath("//div[@class='form-group']/child::input[@id='email']"))		
		.sendKeys("priyankapriya523@gmail.com");
		
		//following sibling
		driver.findElement(By.xpath("//input[@id='name']/following-sibling::input[@id='phone']"))
		.sendKeys("9063038150");
		
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}	
	}