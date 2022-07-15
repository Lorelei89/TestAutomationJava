package Frames;

import Base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class NestedFramesTests extends BaseTests {
    @Test
    public void testNestedFramesText(){
        var nestedFramesPage = homePage.clickFramesPage().clickOnNestedFramesLink();
        assertEquals(nestedFramesPage.getLeftFrameText(), "LEFT", "Incorrect match of words");
        assertEquals(nestedFramesPage.getBottomFrameText(),"BOTTOM", "Incorrect match of words");
    }
}
