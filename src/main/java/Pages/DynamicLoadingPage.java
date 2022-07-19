package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {
    private WebDriver driver;
    private By link_Example1 = By.xpath("//a[contains(text(),'Example 1')]");
    private By link_Example2 = By.xpath("//a[contains(text(),'Example 2')]");

    public DynamicLoadingPage(WebDriver driver){
        this.driver = driver;
    }

    public DynamicLoadingExample1Page clickExample1(){
        driver.findElement(link_Example1).click();
        return new DynamicLoadingExample1Page(driver);
    }

    public DynamicLoadingExample2Page clickExample2(){
        driver.findElement(link_Example2).click();
        return new DynamicLoadingExample2Page(driver);
    }

    public DynamicLoadingExample2Page rightClickOnExample2Link(){
        String selectLinkOpeningNewTab = Keys.chord(Keys.CONTROL, Keys.RETURN);
        driver.findElement(link_Example2).sendKeys(selectLinkOpeningNewTab);
        return new DynamicLoadingExample2Page(driver);
    }
}
