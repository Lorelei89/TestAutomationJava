package Navigation;

import Base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class NavigationTests extends BaseTests {
    @Test
    public void testNavigator(){
        homePage.clickDynamicLoadingPage().clickExample1();
        getWindowManager().goBack();
        getWindowManager().refreshPage();
        getWindowManager().goForward();
        getWindowManager().goTo("https://google.com");
    }

    @Test
    public void testSwitchTab(){
        homePage.clickMultipleWindowsPage().clickHere();
        getWindowManager().switchToTab("New Window");
    }

    @Test
    public void testSwitchToNewTab(){
        var buttonOnPage = homePage.clickDynamicLoadingPage().rightClickOnExample2Link();
        getWindowManager().switchToNewTab();
        assertTrue(buttonOnPage.isStartButtonDisplayed(), "Start button is not displayed");
    }

}
