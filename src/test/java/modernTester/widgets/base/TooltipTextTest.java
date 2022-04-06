package modernTester.widgets.base;

import modernTester.TestBase;
import modernTester.widgets.pages.TooltipTextPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class TooltipTextTest extends TestBase {

    private static Logger log = LoggerFactory.getLogger("TooltipTextTest.class");

    public static void tooltipTextTest () {
        TooltipTextPage.driverPrepTooltip();
        TooltipTextPage.firstTooltipTest();
        TooltipTextPage.secondTooltipTest();
    }
}
