package mygroup.myartifact;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo2 {
	WebDriver driver;
	
 @BeforeSuite
public void startConfiguration() {
	 System.out.println("Before suite - start Configuration");
	 }
 
 @BeforeTest
 public void launchBrowser() {
	  driver =new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 driver.get("https://www.saucedemo.com/");
	System.out.println("Before Test - launch Browser");
 }
 
 @BeforeClass
 public void login() throws InterruptedException {
	 driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
	 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
	 driver.findElement(By.xpath("//input[@class='submit-button btn_action']")).click();
	 System.out.println("Before Class - Login");
	 Thread.sleep(1000);
 }
 
 
 @BeforeMethod
 public void addToCart() throws InterruptedException {
	 driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
	 System.out.println("Before method - addToCart");
	 Thread.sleep(3000);
 }
 
 @Test 
 public void verifyCart() throws InterruptedException {
	 driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
	 System.out.println("Test - product added to the cart");
	 Thread.sleep(3000);
 }
 
 @AfterMethod
 public void clearCart() throws InterruptedException {
	 driver.findElement(By.xpath("//button[@id='remove-sauce-labs-backpack']")).click();
	 System.out.println("After Method - clear cart");
	 Thread.sleep(1000);
 }
 @AfterClass
 public void logout() throws InterruptedException {
	 driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
	 System.out.println("After class - logout");
 }
 @AfterTest
 public void closeBrowser() {
	 driver.close();
	 System.out.println("After Test - close Browser");
 }
	
	
	@AfterSuite
	public void endConfiguration() {
		System.out.println("After suite - end configuration");
	}
	
	
	
	
}
