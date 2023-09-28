package seleniumDiscussion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 WebDriverManager.edgedriver().setup();
	      
	      WebDriver driver = new EdgeDriver();
	      
	      driver.manage().window().maximize();
	      
	      driver.get("https://www.facebook.com/");
	      Thread.sleep(2000);
	      driver.navigate().to("https://www.amazon.in/");
	      Thread.sleep(2000);
	      driver.navigate().back();
	      Thread.sleep(2000);
	      driver.navigate().forward();
	      Thread.sleep(2000);
	      driver.navigate().refresh();
	      driver.close();

	}

}
