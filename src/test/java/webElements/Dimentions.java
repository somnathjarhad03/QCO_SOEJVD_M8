package webElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dimentions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  WebDriverManager.edgedriver().setup();
	      
	      WebDriver driver = new EdgeDriver();
	      
	      driver.manage().window().maximize();
	      
	      driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	      
	      driver.get("https://www.facebook.com/");
	      
	      WebElement email = driver.findElement(By.id("email"));
	      
	      Dimension dimentions = email.getSize();
	      
	     int h = dimentions.getHeight();
	     int w = dimentions.getWidth();
	     
	     System.out.println("Height is "+h);
	     System.out.println("Width is "+w);
		
	}

}
