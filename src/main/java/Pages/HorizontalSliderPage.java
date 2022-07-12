package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSliderPage {
    private WebDriver driver;
    private By range = By.xpath("//input[@type='range']");
    private By rangeValue = By.xpath("//span[@id='range']");

    public HorizontalSliderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setRangeValue(String number) {
        while(!getRangeValue().equals(number)){
           driver.findElement(range).sendKeys(Keys.ARROW_RIGHT);
       }
    }

    public String getRangeValue() {
        return driver.findElement(rangeValue).getText();
    }
}
