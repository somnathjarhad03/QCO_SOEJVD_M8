package dataRead;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadingData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Properties p =new Properties();
		FileInputStream fis =new FileInputStream(".\\src\\test\\resources\\Data.properties");
		
		p.load(fis);
		
         String baseUrl = p.getProperty("url");
         String userName = p.getProperty("username");
        String passWord = p.getProperty("password");
		
		 WebDriverManager.edgedriver().setup();
	      
	      WebDriver driver = new EdgeDriver();
	      
	      driver.manage().window().maximize();
	      
	      driver.get(baseUrl);
	      driver.findElement(By.cssSelector("input[type='text']")).sendKeys(userName);
	      driver.findElement(By.cssSelector("input[name='pass']")).sendKeys(passWord);
		
		
		

	}

}
