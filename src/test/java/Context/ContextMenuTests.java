package Context;

import Base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContextMenuTests extends BaseTests {
    @Test
    public void testRightClickInContextMenu(){
        var contextPage = homePage.clickContextMenuPage();
        contextPage.rightClickInBox();
        String message = contextPage.getPopUpText();
        contextPage.acceptPopUp();
        assertEquals(message, "You selected a context menu", "Popup incorrect message");
    }
}
