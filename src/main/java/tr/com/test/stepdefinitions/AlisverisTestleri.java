package tr.com.test.stepdefinitions;


import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import tr.com.test.pageObjects.AccountPOM;
import tr.com.test.pageObjects.HomePagePOM;
import tr.com.test.pageObjects.LoginPOM;
import tr.com.test.pageObjects.LoginPOM2;
import tr.com.test.testBase.TestBase;

public class AlisverisTestleri extends TestBase {
//    WebDriver driver = HomePagePOM.driver;


//    HomePagePOM homePagePOM;
    LoginPOM2 loginPOM2;


    @Test
    public void hataliTest(){

        loginPOM2= new LoginPOM2();
        loginPOM2.webSitesiAc();
        HomePagePOM homePagePOM = new HomePagePOM(driver,waitTime);
        homePagePOM.girisYap("agunaydi@oyak");


    }

    @Parameters({"isim","soyisim"})
    @Test
    public void dogruTest(@Optional("metehan") String isim, @Optional("kara") String soyisim) {

        loginPOM2= new LoginPOM2();
        loginPOM2.webSitesiAc();
        HomePagePOM homePagePOM = new HomePagePOM(driver,waitTime);
        homePagePOM.girisYap("agunaydin@oyak.com.tr");
        AccountPOM accountPOM = new AccountPOM(driver,waitTime);
        accountPOM.hesapBilgileriniDoldur(isim, soyisim);


    }



}
