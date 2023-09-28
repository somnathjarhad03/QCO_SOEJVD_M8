package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Id_Name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 WebDriverManager.edgedriver().setup();
	      
	      WebDriver driver = new EdgeDriver();
	      
	      driver.manage().window().maximize();
	      
	      driver.get("https://www.facebook.com/");
	      
	      driver.findElement(By.id("email")).sendKeys("jarhad.somnath@gmail.com");
	      driver.findElement(By.name("pass")).sendKeys("Somnath@123");
	      driver.findElement(By.name("login")).click();
	}

}
