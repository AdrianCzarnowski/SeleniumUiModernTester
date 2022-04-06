package modernTester.widgets.base;

import modernTester.TestBase;
import modernTester.widgets.pages.ProgressBarPage;
import modernTester.widgets.pages.SliderPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class ProgressBarTest extends TestBase {
    private static Logger log = LoggerFactory.getLogger("ProgressBarTest.class");

    public void progressBarTest () {
        SliderPage.driverPrepWidgetsSection();
        ProgressBarPage.progressBarSection();
        ProgressBarPage.progressBarWaitToComplete();
    }
}
