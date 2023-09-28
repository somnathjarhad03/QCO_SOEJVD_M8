package popUps;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Robot {

	public static void main(String[] args) {


		 WebDriverManager.edgedriver().setup();
	      
	      WebDriver driver = new EdgeDriver();
	      
	      driver.manage().window().maximize();
	      
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
	      driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
	      
	      driver.findElement(By.xpath("//*[text()='Upload Resume']")).click();
		
	      Robot r = new Robot();
	      
	      StringSelection src = new StringSelection("C:\\Users\\Somnath\\Downloads\\Somnath Jarhad - Sr. QA.pdf");
	      
	      Toolkit.getDefaultToolkit().getSystemClipboard().setContents(src, null);
	      
	      
	      
	}

}
