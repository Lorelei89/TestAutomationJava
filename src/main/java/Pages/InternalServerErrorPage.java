package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InternalServerErrorPage {
    private WebDriver driver;
    private By error = By.cssSelector("h1");

    public InternalServerErrorPage(WebDriver driver){
        this.driver = driver;
    }

    public String getInternalError(){
        return driver.findElement(error).getText();
    }
}
