package mygroup.myartifact;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGDemo {
	
//Steps
/*
*open chrome browser	
*launch URL
*enter username
*enter password
*click login
*Dashboard page
*logout
**/
	WebDriver driver;
@Test
public void launchBrowser() {
	driver =new ChromeDriver();
	System.out.println("open chrome");
	
}
@Test
public void launchSite() throws InterruptedException {
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	System.out.println("Launch URL");
	Thread.sleep(2000);
}
@Test
public void login() throws InterruptedException {
	driver.findElement(By.name("username")).sendKeys("Admin");
	System.out.println("Enter username");
	driver.findElement(By.cssSelector("input[type='password']")).sendKeys("admin123");
    System.out.println("Enter password");
    driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	System.out.println("Enter Login");
	Thread.sleep(3000);
}
	
@Test
	public void logout() throws InterruptedException {
	driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
	driver.findElement(By.xpath("//a[@class='oxd-userdropdown-link']")).click();
	Thread.sleep(1000);
	
		System.out.println("Logout");
	}
	
	
	
}
