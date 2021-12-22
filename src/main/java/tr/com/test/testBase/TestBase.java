package tr.com.test.testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;


public class TestBase {

	public  static WebDriver driver;
	public  static int waitTime = 30;
	public  static Actions action = null;
	//you can write common methods or hooks like selectBrowsers, killDriver

//	@AfterSuite
//	public void killDriver(){
//		System.out.println("Hello");
//		TestBase.driver.quit();
//	}
}
