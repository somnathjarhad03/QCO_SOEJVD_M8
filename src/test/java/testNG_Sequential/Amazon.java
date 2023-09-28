package testNG_Sequential;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {
	
	@Test
	public void openAmazon() {
	
	 WebDriverManager.edgedriver().setup();
     
     WebDriver driver = new EdgeDriver();
     
     driver.manage().window().maximize();
     
     driver.get("https://www.amazon.com/");
     
     driver.close();

}
}
