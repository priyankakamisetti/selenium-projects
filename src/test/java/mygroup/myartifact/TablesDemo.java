package mygroup.myartifact;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablesDemo {
	public static void main(String args[]) {
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://testautomationpractice.blogspot.com/");
		
	List<WebElement> tablesValues =driver.findElements(By.xpath("//table"));
		//rows
		List<WebElement> rowValues = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr"));
		int rowsize = rowValues.size();
		
		//column size
		List<WebElement> colValues = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr/th"));
		int colsize = colValues.size();
		//loop
		System.out.println("Static Web Table:");
		for(int r=2;r<=rowsize;r++) {
			for(int c=1;c<=colsize;c++) {
				String data=
						driver.findElement
						(By.xpath("//table[@name='BookTable']/tbody/tr["+r+"]/td["+c+"]"))
						.getText();
				System.out.print(data +" ");
				
			}
			System.out.println();
		}
		
		//isDisplayed()
		String bookName = "Learn Java";
		Boolean book = driver.findElement(By.xpath("//td[text()='"+bookName+"']")).isDisplayed();
		System.out.println("Is Book Present :" +book);
		
		//Get price from Table
		WebElement price = 
				driver.findElement
				(By.xpath("//tr/td[text()='"+bookName+"']//following-sibling::td[3]"));
		System.out.println("Price of Book is:" +price.getText());
		
		//Get all books written by Amit
		List<WebElement> author= driver.findElements(By.xpath("//tr[td[text()='Amit']]/td[1]"));
		for(WebElement a:author) {
		System.out.println("Print Books :" +a.getText());
		}

	}
	}



