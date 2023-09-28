package dataRead;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PropertyBrowser {

	public static void main(String[] args) throws IOException {
		
		Properties p =new Properties();
		
		FileInputStream fis =new FileInputStream (".\\src\\test\\resources\\Data.properties");
		
		p.load(fis);
		
		String baseUrl = p.getProperty("url");
		
		String username = p.getProperty("username");
		
	  String password = p.getProperty("password");
	  String browser = p.getProperty("browser");
	  WebDriver driver;
	  if(browser.equals("edge")) {
		  
		  WebDriverManager.edgedriver().setup();
		  
	 driver = new EdgeDriver();
		  
		  
	  }
	  else {
		  
		  WebDriverManager.firefoxdriver().setup();
		   driver = new FirefoxDriver();
		  
	  }
		
	
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		 driver.get(baseUrl);
	      driver.findElement(By.cssSelector("input[type='text']")).sendKeys(username);
	      driver.findElement(By.cssSelector("input[name='pass']")).sendKeys(password);
		
		

	}

}
