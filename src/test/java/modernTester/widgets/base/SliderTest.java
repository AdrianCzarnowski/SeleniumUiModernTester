package modernTester.widgets.base;

import modernTester.TestBase;
import modernTester.widgets.pages.SliderPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SliderTest extends TestBase {

    private static Logger log = LoggerFactory.getLogger("SliderTest.class");

    public void sliderTest() {
        SliderPage.driverPrepSliderSection();
        SliderPage.sliderIsDisplayed();
        SliderPage.slider50Percent();
        SliderPage.sliderIsDisplayed();
        SliderPage.slider80Percent();
        SliderPage.sliderIsDisplayed();
        SliderPage.slider0Percent();
        SliderPage.sliderIsDisplayed();
    }
}
