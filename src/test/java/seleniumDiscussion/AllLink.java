package seleniumDiscussion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AllLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.edgedriver().setup();
	      
	      WebDriver driver = new EdgeDriver();
	      
	      driver.manage().window().maximize();
	      
	      driver.get("https://www.facebook.com/");
	    List<WebElement> allLinks = driver.findElements(By.tagName("a"));
	    
	    for(WebElement b : allLinks) {
	    	
	    	System.out.println(b.getText());
	    }

	}

}
