package tr.com.test.stepdefinitions;

import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import tr.com.test.listener.Listener;
import tr.com.test.pageObjects.LoginPOM;
import tr.com.test.testBase.TestBase;


public class OrderDressStepDefinitions extends TestBase {

    LoginPOM loginPOM;

    @Parameters({"browser"})
    @Test
    public void open_website(@Optional("chrome") String browser) {
        loginPOM = new LoginPOM();
        loginPOM.open_website(browser);
    }

}
