package mygroup.myartifact;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverDoubleClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://testautomationpractice.blogspot.com/");
		//mouse hover
		WebElement pointMe=driver.findElement(By.xpath("//*[text()='Point Me']"));
		Actions action =new Actions(driver);
		action.moveToElement(pointMe).perform();
		Thread.sleep(2000);
        //locator- returns 2 values
	  List<WebElement> options = driver.findElements(By.cssSelector(".dropdown-content"));
	for(WebElement o:options) {
		System.out.println(o.getText());
	}
	//moblies
	WebElement mobile=driver.findElement(By.xpath("//a[text()='Mobiles']"));
	action.moveToElement(pointMe)
	.moveToElement(mobile)
	.click()
	.build()
	.perform();
	Thread.sleep(1000);
	

    //Double click
WebElement btn = driver.findElement(By.xpath("//button[text()='Copy Text']"));
   Actions action2 = new Actions(driver);
    action2.doubleClick(btn).perform();	
	System.out.println("Double Click Performed");
	
	//Drag and Drop
	WebElement dragEle=driver.findElement(By.id("draggable"));
	WebElement dropEle=driver.findElement(By.id("droppable"));
	Actions action3 = new Actions(driver);
	action3.dragAndDrop(dragEle , dropEle);
	
}
}