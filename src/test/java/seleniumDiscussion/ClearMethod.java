package seleniumDiscussion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClearMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.edgedriver().setup();
	      
	      WebDriver driver = new EdgeDriver();
	      
	      driver.manage().window().maximize();
	      
	      driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	      
	      driver.get("https://www.facebook.com/");
	      
	      WebElement email = driver.findElement(By.id("email"));
	      
	      email.sendKeys("somnath");
	      Thread.sleep(2000);
	      
	      email.clear();
	      
	      driver.findElement(By.xpath("//*[text()='Create new account']")).click();
	      
	      driver.close();
		
	}

}
