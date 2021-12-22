package tr.com.test.pageObjects;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import tr.com.test.testBase.TestBase;

public class LoginPOM extends TestBase {

    String webSiteAdress = "http://automationpractice.com/";

    public void open_website(String browser){
        if(browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "/src/test/resources/drivers/chromedriver.exe");
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--disable-notifications");
            chromeOptions.addArguments("--start-maximized");
            driver = new ChromeDriver(chromeOptions);
        }else{
            System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+ "/src/test/resources/drivers/geckodriver.exe");
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
        }

        PageFactory.initElements(driver,this);
        action = new Actions(driver);
        driver.get(webSiteAdress);
    }

}
