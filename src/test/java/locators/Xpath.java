package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.edgedriver().setup();
	      
	      WebDriver driver = new EdgeDriver();
	      
	      driver.manage().window().maximize();
	      
	      driver.get("https://www.facebook.com/");
	      
	      driver.findElement(By.xpath("//input[contains(@id,'email')]")).sendKeys("Somnath");
	      driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("somnath@123");
	      driver.findElement(By.xpath("//a[contains(text(),'Forgotten password?')]")).click();

	}

}
