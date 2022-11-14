package Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Utility.ReadData;
import io.github.bonigarcia.wdm.WebDriverManager;
//This class will be extended	to	all	page	classes	and	test	classes
public class TestBase {
	//driver is	defined	globally	by	which	it	can	be	used	by	all	page	and	test	classes
	//Static cause	single	copy	of	driver	will	be	used	all	across	the	classes
	public static WebDriver driver;
	//this method open the Browser and enter the Application URL
	public void initialization() throws Exception
	{
		 String browser = ReadData.readPropertyFile("browser");
		 if(browser.equals("chrome"))
		 {
			 WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver(); 
		 }
		 else if(browser.equals("edge"))
		 {
			 WebDriverManager.edgedriver().setup();
			 driver = new EdgeDriver();
		 }
		 else if(browser.equals("firefox"))
		 {
			 WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
		 }
		 
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		 driver.get("https://www.saucedemo.com/");
		 driver.get(ReadData.readPropertyFile("url"));
		
	}
	//Parameterization 
	//1. Credentials- Property File
	//2. test data - Excel file
	

}
