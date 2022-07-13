package Frames;

import Base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FrameTests extends BaseTests {

    @Test
    public void testWysiwyng(){
        var editorPage = homePage.clickWysiwyngEditorPage();
        editorPage.clearTextArea();

        String text1 = "Bonjour, ";
        String text2 = "mes amis!";

        editorPage.setTextArea(text1);
        editorPage.increaseIndentation();
        editorPage.setTextArea(text2);

        assertEquals(editorPage.getTextFromEditor(), text1+text2, "Text from text editor is incorrect");

    }
}
