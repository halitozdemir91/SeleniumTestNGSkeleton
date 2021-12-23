package tr.com.test.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.lang.ref.WeakReference;

public class AccountPOM {

    WebDriver driver;
    WebDriverWait wait;
    Actions action;

    @FindBy(id = "customer_firstname")
    WebElement fName;
    @FindBy(id = "customer_lastname")
    WebElement lName;
    @FindBy(id = "id_state")
    WebElement state;
    @FindBy(id = "passwd")
    WebElement pass;
    @FindBy(id = "address1")
    WebElement address;
    @FindBy(id = "city")
    WebElement city;
    @FindBy(id = "postcode")
    WebElement postcode;
    @FindBy(id = "phone_mobile")
    WebElement mobile;
    @FindBy(id = "submitAccount")
    WebElement register;
    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/a")
    WebElement lblDress;
    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[3]/a")
    WebElement lblSummerDresses;
    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[1]")
    WebElement lblFirstRow;
//    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]")
    @FindBy(xpath = "//a[@data-id-product=\"5\"]")
    WebElement addtoChart5;
    @FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")
    WebElement checkout;
    @FindBy(id = "total_product")
    WebElement price;
    @FindBy(xpath = "//*[@id=\"center_column\"]/p[2]/a[1]")
    WebElement proceed;
    @FindBy(name = "processAddress")
    WebElement proceesAdres;
    @FindBy(name = "processCarrier")
    WebElement processCarrier;
    @FindBy(id = "uniform-cgv")
    WebElement chkbox;
    @FindBy(className = "bankwire")
    WebElement banWire;



    public AccountPOM(WebDriver driver, int waitTime) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
        wait = new WebDriverWait(driver, waitTime);
        action = new Actions(driver);
    }

    public void hesapBilgileriniDoldur(String isim, String soyisim){
        wait.until(ExpectedConditions.elementToBeClickable(fName)).sendKeys(isim);
        wait.until(ExpectedConditions.elementToBeClickable(lName)).sendKeys(soyisim);
        wait.until(ExpectedConditions.elementToBeClickable(pass)).sendKeys("12345");
        wait.until(ExpectedConditions.elementToBeClickable(address)).sendKeys("adres alani");
        wait.until(ExpectedConditions.elementToBeClickable(city)).sendKeys("Miami");
        new Select(state).selectByVisibleText("Alaska");
        wait.until(ExpectedConditions.elementToBeClickable(postcode)).sendKeys("06790");
        wait.until(ExpectedConditions.elementToBeClickable(mobile)).sendKeys("1234");
        wait.until(ExpectedConditions.elementToBeClickable(register)).click();
        Assert.assertEquals("My account - My Store",driver.getTitle());
    }

    public void goSummerDress(){
        action.moveToElement(lblDress).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(lblSummerDresses)).click();
    }

    public void sepeteEkle(){
        action.moveToElement(lblFirstRow).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(addtoChart5)).click();
        wait.until(ExpectedConditions.elementToBeClickable(checkout)).click();
        String actualPrice = wait.until(ExpectedConditions.elementToBeClickable(price)).getText();
        Assert.assertEquals(actualPrice, "$28.98");
    }

    public void odeme(){
        wait.until(ExpectedConditions.elementToBeClickable(proceed)).click();
        wait.until(ExpectedConditions.elementToBeClickable(proceesAdres)).click();
        wait.until(ExpectedConditions.elementToBeClickable(chkbox)).click();
        wait.until(ExpectedConditions.elementToBeClickable(processCarrier)).click();
        Assert.assertEquals(wait.until(ExpectedConditions.elementToBeClickable(price)).getText(), "$28.98");
    }

}
