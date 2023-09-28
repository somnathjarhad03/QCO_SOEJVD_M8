package testNGFail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	
	
	
	@Test
	public void openFacebook() {
		

		 WebDriverManager.edgedriver().setup();
	      
	      WebDriver driver = new EdgeDriver();
	      
	      driver.manage().window().maximize();
	      
	      driver.get("https://www.facebook.com/");
	      
	      driver.findElement(By.cssSelector("input[type='text")).sendKeys("Somnath");
	      driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("Somnath123");
	      
	      driver.close();
		
	}


}
