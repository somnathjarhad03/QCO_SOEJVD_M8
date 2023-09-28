package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IsSelected {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		 WebDriverManager.edgedriver().setup();
	      
	      WebDriver driver = new EdgeDriver();
	      
	      driver.manage().window().maximize();
	      
	      driver.get("https://www.facebook.com/");
	      driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	      Thread.sleep(2000);
	      
	    // WebElement btnRadio = driver.findElement(By.xpath("//input[@value='1']"));
	     
	     WebElement btnRadio = driver.findElement(By.xpath(" (//input[@type='radio'])[1]"));
	     
	   
	     
	     btnRadio.click();
	     
	     if(btnRadio.isSelected()) {
	    	 
	    	 System.out.println("Pass");
	    	 
	    	 }
	     else {
	    	 
	    	 System.out.println("Fail");
	     }
	   driver.close();   
	}

}
