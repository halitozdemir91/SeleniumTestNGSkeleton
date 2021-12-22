package tr.com.test.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountPOM {

    WebDriver driver;
    WebDriverWait wait;

    @FindBy(id = "customer_firstname")
    WebElement fName;
    @FindBy(id = "customer_lastname")
    WebElement lName;
    @FindBy(id = "id_state")
    WebElement state;

    public AccountPOM(WebDriver driver, int waitTime) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
        wait = new WebDriverWait(driver, waitTime);
    }

    public void hesapBilgileriniDoldur(String isim, String soyisim){
        wait.until(ExpectedConditions.elementToBeClickable(fName)).sendKeys(isim);
        wait.until(ExpectedConditions.elementToBeClickable(lName)).sendKeys(soyisim);
//        new Select(state).selectByVisibleText("Alaska");
    }
}
