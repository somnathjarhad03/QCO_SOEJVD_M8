package scroll;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.edgedriver().setup();
	      
	      WebDriver driver = new EdgeDriver();
	      
	      driver.manage().window().maximize();
	      
	      driver.get("https://www.amazon.in/");
	      
	   WebElement career =   driver.findElement(By.xpath("//*[text()='Careers']"));
	   
	   JavascriptExecutor js = (JavascriptExecutor)driver;
	   
	   js.executeScript("arguments[0].scrollIntoView();", career);
	   
	   Thread.sleep(3000);
	   
	   js.executeScript("arguments[0].click();", career);
	      
	   driver.close();
		
		
	}

}
