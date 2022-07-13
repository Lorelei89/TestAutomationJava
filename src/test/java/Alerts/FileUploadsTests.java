package Alerts;

import Base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class FileUploadsTests extends BaseTests {
    @Test
    public void testFileUploadsSuccessfully(){
        var fileUploads = homePage.clickFileUploadsPage();
        fileUploads.clickOnChooseFileBtn("C:/Users/Maria/IdeaProjects/TestAutomationJava/resources/cat.jpg");
        assertEquals("Incorrect file uploaded text", fileUploads.getUploadedFilesText(), "cat.jpg");
    }

}
