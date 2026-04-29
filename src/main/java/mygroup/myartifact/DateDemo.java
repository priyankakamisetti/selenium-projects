package mygroup.myartifact;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DateDemo {

	public static void main(String[] args) throws InterruptedException {
		
   WebDriver driver = new ChromeDriver();

  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
  driver.get("https://testautomationpractice.blogspot.com/");

//driver.findElement(By.id("datepicker")).sendKeys("10/6/2026");
  
  
  driver.findElement(By.id("datepicker")).click();
   while(true) {
	
	String month=driver.findElement(By.className("ui-datepicker-month")).getText();
	String year=driver.findElement(By.className("ui-datepicker-year")).getText();
	if(month.equals("June") && year.equals("2026")) {
		driver.findElement(By.xpath("//a[text()='11']")).click();
		break;
	}
	
driver.findElement(By.xpath("//*[@title='Next']")).click();


}
Thread.sleep(2000);
driver.findElement(By.id("txtDate")).click();
	Select monthDD =new Select(driver.findElement(By.className("ui-datepicker-month")));
	monthDD.selectByVisibleText("Apr");
	Select yearDD =new Select(driver.findElement(By.className("ui-datepicker-year")));
	yearDD.selectByVisibleText("2025");
	
	if(driver.findElement(By.xpath("//a[@data-date="+15+"]")).isDisplayed()) {
		driver.findElement(By.xpath("//a[@data-date="+15+"]")).click();
		
	}

	
	
	Thread.sleep(2000);
	driver.findElement(By.id("start-date")).sendKeys("20/9/2026");
	driver.findElement(By.id("end-date")).sendKeys("26/9/2026");
	Thread.sleep(1000);
	driver.findElement(By.className("submit-btn")).click();
	driver.close();
	
	driver.quit();
	
	
	
	
	
	
	
	
	
	
	

	}


}


