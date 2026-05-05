package mygroup.myartifact;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertsDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://testautomationpractice.blogspot.com/");
		//Alerts
		
		driver.findElement(By.xpath("//button[text()='Simple Alert']")).click();
		Alert alert=driver.switchTo().alert();
		alert.accept();//ok
		Thread.sleep(2000);
		//confirmation alert
		driver.findElement(By.xpath("//button[text()='Confirmation Alert']")).click();
		Alert alert1=driver.switchTo().alert();
		alert1.dismiss();//cancel
		Thread.sleep(2000);
		//prompt alert
		driver.findElement(By.xpath("//button[text()='Prompt Alert']")).click();
		alert.sendKeys("Priyanka");
		alert.accept();
        Thread.sleep(2000);
        
        
        
        //demoqua alerts
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoqa.com/alerts");
		//clck
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		Alert alert2=driver.switchTo().alert();
		alert2.accept();//ok
		Thread.sleep(3000);  
		
		//confirm alert
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		Alert alert4=driver.switchTo().alert();
		alert4.dismiss();//cancel
		Thread.sleep(3000);
		//prompt alert
		driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		alert.sendKeys("Priyanka");
		alert.accept();
        Thread.sleep(3000);
		
	}
}






















