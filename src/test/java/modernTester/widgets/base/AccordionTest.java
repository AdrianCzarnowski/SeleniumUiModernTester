package modernTester.widgets.base;

import modernTester.widgets.pages.AccordionPage;
import modernTester.widgets.pages.SliderPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AccordionTest {

    private static Logger log = LoggerFactory.getLogger("AccordionTest.class");

    public void accordingTest () {
        SliderPage.driverPrepWidgetsSection();
        AccordionPage.driverPrepAccordingSection();
        AccordionPage.section1GetText();
        AccordionPage.section2GetText();
        AccordionPage.section3GetText();
        AccordionPage.section4GetText();

    }
}
