package seleniumDiscussion;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autosuggestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.edgedriver().setup();
	      
	      WebDriver driver = new EdgeDriver();
	      
	      driver.manage().window().maximize();
	      
	      driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	      
	      driver.get("https://www.google.com/");
	      
	      driver.findElement(By.xpath("//*[@type='search']")).sendKeys("India"); 
	      Thread.sleep(2000);
	      
	      List<WebElement> search = driver.findElements(By.xpath("//li[@data-view-type='1']"));
	      System.out.println(search.size());
	      
	      for(WebElement ele:search) {
	    	  
	    	  System.out.println(ele.getText());
	      }
	      
	      driver.close();
	}

}
