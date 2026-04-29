package mygroup.myartifact;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
  
		//Maximize the window
		driver.manage().window().maximize();
		
		//open google
		driver.get("https://www.google.com");
		
		//verify page title
		String title=driver.getTitle();
        if(title.contains("Google")) {
        	System.out.println("Title verication is done");
        }else {
        	System.out.println("Title verification is failed");
        }
		
        //current url is correct
        
        String CurrentURL= driver.getCurrentUrl();
        if(CurrentURL.equals("https://www.google.com")) {
        	System.out.println("CurrentUrl is passed");
        }else {
        	System.out.println("CurrentURL is failed");
        }
        
    	//navigate to 
        
        driver.navigate().to("https://www.amazon.in");
        
    	//navigate back
        driver.navigate().back();
        
        //navigate forward
        driver.navigate().forward();
        
        //navigate refersh 
        driver.navigate().refresh();
        
        //close and quit the window
        
        driver.close();
        
        driver.quit();
  
	}

}
