package modernTester.interactions.base;

import modernTester.TestBase;
import modernTester.interactions.pages.DroppablePage;
import modernTester.interactions.pages.SortablePage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class SortableTest extends TestBase {

    private static Logger log = LoggerFactory.getLogger("SortableTest.class");

    public void sortableTest() {
        DroppablePage.interactionsSectionPrep();
        SortablePage.sortablePageSet();
        SortablePage.sortableListAndShuffle();

    }
}













