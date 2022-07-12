package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {
    private WebDriver driver;
    private By emailField = By.xpath("//input[@id='email']");
    private By retrievePasswordBtn = By.xpath("//button[@id='form_submit']");

    public ForgotPasswordPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public InternalServerErrorPage clickRetrievePassword() {
        driver.findElement(retrievePasswordBtn).click();
        return new InternalServerErrorPage(driver);
    }

}