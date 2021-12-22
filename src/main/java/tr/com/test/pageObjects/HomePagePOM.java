package tr.com.test.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class HomePagePOM {

    WebDriver driver;
    WebDriverWait wait;

    @FindBy(id = "email_create")
    WebElement emailTxt;
    @FindBy(id = "SubmitCreate")
    WebElement submit;
    @FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
    WebElement sigIn;


    public HomePagePOM(WebDriver driver, int waitTime) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver,waitTime);
    }



    public void girisYap(String email){

        wait.until(ExpectedConditions.elementToBeClickable(sigIn)).click();
        wait.until(ExpectedConditions.elementToBeClickable(emailTxt)).sendKeys(email);
        wait.until(ExpectedConditions.elementToBeClickable(submit)).click();

    }



}
