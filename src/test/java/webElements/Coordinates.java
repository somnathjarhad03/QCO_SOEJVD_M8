package webElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Coordinates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.edgedriver().setup();
	      
	      WebDriver driver = new EdgeDriver();
	      
	      driver.manage().window().maximize();
	      
	      driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	      
	      driver.get("https://www.facebook.com/");
	      
	      WebElement email = driver.findElement(By.id("email"));
	      
	      Point coordinates = email.getLocation();
	      
	      int x = coordinates.getX();
	      int y = coordinates.getY();
	      
	      System.out.println("X coordinate is "+x);
	      System.out.println("Y coordinate is "+y);
		
	}

}
