package mygroup.myartifact;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		//launch the driver
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
Thread.sleep(2000);
    
    //enter the username
driver.findElement(By.name("username")).sendKeys("Admin");
    //password
driver.findElement(By.cssSelector("input[type='password']")).sendKeys("admin123");
		//click on login
driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
        //dashboard
Thread.sleep(2000);
System.out.println("Home Page Title" +driver.getTitle());
driver.quit();
	}

}
