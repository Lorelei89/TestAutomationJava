package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.*;

public class EnterAdPage {
    private WebDriver driver;
    private By closeModal = By.xpath("//p[contains(text(),'Close')]");
//    private By windowModalText = By.xpath("//div[@class='modal-title']//parent::h3");

    public EnterAdPage(WebDriver driver){
        this.driver = driver;
    }

//    public String getWindowTitleText(){
//        WebDriverWait wait = new WebDriverWait(driver, 10000);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(windowModalText));
//        return driver.findElement(windowModalText).getText();
//    }

    public void clickCloseModal(){
        driver.findElement(closeModal).click();
    }
}
