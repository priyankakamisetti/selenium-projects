package mygroup.myartifact;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DateDemo {

	public static void main(String[] args) {
		
   WebDriver driver = new ChromeDriver();

  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
  driver.get("https://testautomationpractice.blogspot.com/");

//driver.findElement(By.id("datepicker")).sendKeys("10/6/2026");
  
  
  driver.findElement(By.id("datepicker")).click();
   while(true) {
	
	String month=driver.findElement(By.className("ui-datepicker-month")).getText();
	String year=driver.findElement(By.className("ui-datepicker-year")).getText();
	if(month.equals("june") && year.equals("2026")) {
		break;
	}
	
driver.findElement(By.xpath("//*[@title='Next']")).click();

driver.findElement(By.xpath("//a[text()='11']")).click();
}

driver.findElement(By.id("datepicker2")).click();
while(true) {
	String month1=driver.findElement(By.className("ui-datepicker2-month")).getText();
	String year1=driver.findElement(By.className("ui-datepicker2-year")).getText();
	if(month1.equals("may")&& year1.equals("2026")) {
		break;
	}
	driver.findElement(By.xpath("//*[@title='Next']")).click();
	driver.findElement(By.xpath("//a[text()='5']")).click();

}

	}

}


