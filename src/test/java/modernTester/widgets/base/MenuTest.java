package modernTester.widgets.base;

import modernTester.TestBase;
import modernTester.widgets.pages.MenuTestPage;
import modernTester.widgets.pages.SliderPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class MenuTest extends TestBase {

    private static Logger log = LoggerFactory.getLogger("MenuTest.class");

    public void menuTest() {
        SliderPage.driverPrepWidgetsSection();
        MenuTestPage.menuSection();
        MenuTestPage.pickMusic();
        MenuTestPage.pickJazzNextModern();
    }
}
