package modernTester.interactions.base;

import modernTester.TestBase;
import modernTester.interactions.pages.DroppablePage;
import modernTester.interactions.pages.ResizablePage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ResizableTest extends TestBase {

    private static Logger log = LoggerFactory.getLogger("ResizableTest.class");

    public void resizableTest () {
        DroppablePage.interactionsSectionPrep();
        ResizablePage.resizableWebPrep();
        ResizablePage.resizable();
    }
}
