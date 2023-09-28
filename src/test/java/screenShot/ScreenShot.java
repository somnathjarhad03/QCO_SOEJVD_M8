package screenShot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.server.handler.CaptureScreenshot;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShot {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		
		 WebDriverManager.edgedriver().setup();
	      
	      WebDriver driver = new EdgeDriver();
	      
	      driver.manage().window().maximize();
	      
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
	      driver.get("https://www.amazon.com/");
	      
	      
	    TakesScreenshot ts = (TakesScreenshot)driver;
	      
	    File src =  ts.getScreenshotAs(OutputType.FILE);
	    
	    File des = new File ("./Screenshot/Amazon.png");
	    
	    FileUtils.copyFile(src, des);
	    
	    driver.close();
	    
	}

}
