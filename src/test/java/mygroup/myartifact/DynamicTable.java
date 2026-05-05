package mygroup.myartifact;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://testautomationpractice.blogspot.com/");
		
	List<WebElement> tablesValues =driver.findElements(By.xpath("//table"));
	//rows
			List<WebElement> rowValues = driver.findElements(By.xpath("//table[@id='taskTable']/tbody/tr"));
			int rowsize = rowValues.size();
			
			//column size
			List<WebElement> colValues = driver.findElements(By.xpath("//table[@id='taskTable']/tbody/tr[1]/td"));
			int colsize = colValues.size();
			//loop
			System.out.println("Dynamic Web Table:");
			for(int r=1;r<=rowsize;r++) {
				for(int c=1;c<=colsize;c++) {
					String data=
							driver.findElement
							(By.xpath("//table[@id='taskTable']/tbody/tr["+r+"]/td["+c+"]"))
							.getText();
					System.out.print(data +" ");
					
				}
				System.out.println();
			}

			//isDisplayed()
			String name = "Chrome";
			Boolean name1 = driver.findElement(By.xpath("//td[text()='"+name+"']")).isDisplayed();
			System.out.println("Is chrome Present :" +name1);
			
			//Get cpu value from chrome
			WebElement CPU = 
					driver.findElement
					(By.xpath("//tr/td[text()='"+name+"']//following-sibling::td[2]"));
			System.out.println("CPU Value of Chrome is:" +CPU.getText());
			
			//Memory Size of Firefox process: 80.3 MB
			WebElement MemorySize=
					driver.findElement(By.xpath("//tr/td[text()='"+name+"']//following-sibling::td[3]"));
			System.out.println("Memory Size of Firefox is:" +MemorySize.getText());
			
			
			
			
			

	}

}
