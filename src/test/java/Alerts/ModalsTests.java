package Alerts;

import Base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ModalsTests extends BaseTests {

    @Test
    public void testModalWindow() {
        var modalPage = homePage.clickEnterAdPage();
        String modalTitle = modalPage.getWindowTitleText();
        modalPage.clickCloseModal();
        assertEquals("Title not found", modalTitle, "THIS IS A MODAL WINDOW");
    }


}
