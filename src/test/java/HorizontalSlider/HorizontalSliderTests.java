package HorizontalSlider;

import Base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class HorizontalSliderTests extends BaseTests {
    @Test
    public void testSliderRangeToWholeNr() {
        String number = "4";
        var sliderPage = homePage.clickHorizontalSlider();
        sliderPage.setRangeValue(number);
        assertEquals("Incorrect slider number", sliderPage.getRangeValue(), number);
    }
}
