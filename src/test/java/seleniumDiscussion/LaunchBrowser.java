package seleniumDiscussion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

      WebDriverManager.edgedriver().setup();
      
      WebDriver driver = new EdgeDriver();
      
      driver.manage().window().maximize();
      
      driver.get("https://www.facebook.com/");
      System.out.println(driver.getTitle());
      System.out.println(driver.getCurrentUrl());
      
      //driver.close();
      driver.quit();
	
	
	
	}

}
