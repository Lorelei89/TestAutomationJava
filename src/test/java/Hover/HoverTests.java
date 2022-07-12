package Hover;

import Base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;

public class HoverTests extends BaseTests {

    @Test
    public void testHoverUser1(){
        var hoversPage = homePage.clickHovers();
        var caption = hoversPage.hoverOverFigure(1);
        assertTrue("Caption not displayed", caption.isCaptionDisplayed());
        assertEquals("Caption title incorrect",caption.getTitle(),"name: user1");
        assertEquals("Caption link incorrect",caption.getLinkText(),"View profile");
        assertTrue("Link incorrect", caption.getLink().endsWith("/users/1"));
    }
}
