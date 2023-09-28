package testNG_Sequential;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowser {
	
	

	@Parameters({"browsername"})
	@Test
	public void facebok(String browser) {
		WebDriver driver;
		
		if(browser.equalsIgnoreCase("edge")) {
			
			WebDriverManager.edgedriver().setup();
		    driver = new EdgeDriver();
		}
		else {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Somnath\\eclipse-workspace\\QCO_SOEJVD_M8\\src\\main\\resources\\chromedriver.exe" );
			
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
	     
	     driver.get("https://www.amazon.com/");
	     
	     driver.close();
		
		}

}
