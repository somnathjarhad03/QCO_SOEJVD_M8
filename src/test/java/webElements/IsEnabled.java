package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IsEnabled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 WebDriverManager.edgedriver().setup();
	      
	      WebDriver driver = new EdgeDriver();
	      
	      driver.manage().window().maximize();
	      
	      driver.get("https://www.facebook.com/");
	      
	      driver.findElement(By.id("email")).sendKeys("jarhad.somnath@gmail.com");
	      driver.findElement(By.name("pass")).sendKeys("Somnath@123");
	    WebElement  btnLogin = driver.findElement(By.name("login"));
	    
	    if(btnLogin.isEnabled()) {
	    	
	    	btnLogin.click();
	    	System.out.println("Hi if block");
	    }
	    else {
	    	
	    	System.out.println("Hi else block");
	    }
	driver.close();
	}

}
