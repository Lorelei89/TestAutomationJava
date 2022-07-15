package Waits;

import Base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WaitTests extends BaseTests {

    @Test
    public void testWaitUntilHidden(){
        var loadingPage = homePage.clickDynamicLoadingPage().clickExample1();
        loadingPage.clickStart();
        assertEquals(loadingPage.getLoadedText(), "Hello World!", "Incorrect loaded text");
    }

    @Test
    public void testWaitAfterTheFact(){
        var loadingPage = homePage.clickDynamicLoadingPage().clickExample2();
        loadingPage.clickStartExample2();
        assertEquals(loadingPage.getLoadedText(), "Hello World!", "Incorrect loaded text");
    }
}
