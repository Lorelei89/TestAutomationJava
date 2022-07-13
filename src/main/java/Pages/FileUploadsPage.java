package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadsPage {
    private WebDriver driver;
    private By chooseFileBtn = By.xpath("//input[@id='file-upload']");
    private By uploadBtn = By.xpath("//input[@id='file-submit']");
    private By uploadedFiles = By.xpath("//div[@id='uploaded-files']");

    public FileUploadsPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickOnUploadBtn(){
        driver.findElement(uploadBtn).click();
    }

    public void clickOnChooseFileBtn(String absolutePathOfFile){
        driver.findElement(chooseFileBtn).sendKeys(absolutePathOfFile);
        clickOnUploadBtn();
    }

    public String getUploadedFilesText(){
        return driver.findElement(uploadedFiles).getText();
    }

}
