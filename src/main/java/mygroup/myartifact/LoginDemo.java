package mygroup.myartifact;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginDemo {

	public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	
	// maximize window
	driver.manage().window().maximize();
	
       //apply implicit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://opensource-demo.orangehrmlive.com");
       //username
	 WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
    username.sendKeys("Admin");

     //password
         WebElement password =  driver.findElement(By.name("password"));
    password.sendKeys("admin123");
    
    //click login
   driver.findElement(By.xpath("//button[@type='submit']")).click();
    
    //explicit wait
    WebDriverWait wait =  new WebDriverWait(driver, Duration.ofSeconds(10));
    
 
	//product page is visible
	  wait.until(
              ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='Time at Work']")));
	  
	  //verify successfully login
	  String currentURL = driver.getCurrentUrl();
      if (currentURL.contains("dashboard")) {
          System.out.println("Login successful (URL verified)");
      } else {
          System.out.println("Login failed");
      }
      
     
      // first product name
       List<WebElement> products = driver.findElements(By.xpath("//ul[@class='oxd-main-menu']/li"));
      
      for(WebElement product: products) {
    	  System.out.println(product.getText());
      }
       
      driver.close();
      driver.quit();

	}

}
