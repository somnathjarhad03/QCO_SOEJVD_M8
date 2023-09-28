package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiSelect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		 WebDriverManager.edgedriver().setup();
	      
	      WebDriver driver = new EdgeDriver();
	      
	      driver.manage().window().maximize();
	      driver.get("https://demoapp.skillrary.com/");
		
	      WebElement dd = driver.findElement(By.id("cars"));
	      
	      Select sel = new Select(dd);
	      
	      sel.selectByIndex(0);
	      
	      Thread.sleep(3000);
	      
	      sel.selectByValue("199");
	      
	      Thread.sleep(3000);
	      
	      sel.deselectByIndex(0);
	      
	      Thread.sleep(3000);
	      
	      sel.deselectByValue("199");
	      
	      Thread.sleep(3000);
	      
	      System.out.println(sel.isMultiple());
	      
	    List<WebElement> allOptions = sel.getAllSelectedOptions();
	    
	    for(WebElement b:allOptions) {
	    	
	    	System.out.println(b.getText());
	    }
		
	    driver.close();
	}

}
