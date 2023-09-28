package popUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		 WebDriverManager.edgedriver().setup();
	      
	      WebDriver driver = new EdgeDriver();
	      
	      driver.manage().window().maximize();
	      
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
	      driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training");
	      
	      WebElement plus = driver.findElement(By.xpath("//*[@id='add']"));
	      
	      Thread.sleep(3000);
	      
	      Actions act = new Actions(driver);
	      
	      act.doubleClick(plus).perform();
	      
	      Thread.sleep(3000);
	      
	      driver.findElement(By.xpath("//*[@ondblclick='addtocart()']")).click();
	      
	      Thread.sleep(3000);
	      
	      System.out.println(driver.switchTo().alert().getText());
	      
	      
	      driver.switchTo().alert().accept();
	      
	      driver.close();
		
		
		
	}

}
