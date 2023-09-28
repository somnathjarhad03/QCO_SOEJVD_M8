package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		 WebDriverManager.edgedriver().setup();
	      
	      WebDriver driver = new EdgeDriver();
	      
	      driver.manage().window().maximize();
	      
	      driver.get("https://www.facebook.com/");
	      driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Somnath");
	      driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("Somnath123");
	      driver.findElement(By.linkText("Forgotten password?")).click();
	      
	     // driver.findElement(By.cssSelector("button[value='1']")).click();

	}

}
