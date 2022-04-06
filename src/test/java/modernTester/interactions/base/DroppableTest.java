package modernTester.interactions.base;

import modernTester.TestBase;
import modernTester.interactions.pages.DroppablePage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class DroppableTest extends TestBase {

    private static Logger log = LoggerFactory.getLogger("DroppableTest.class");

     public void droppableTest() {
        DroppablePage.interactionsSectionPrep();
        DroppablePage.droppableSection();
        DroppablePage.dragAndDropAndValidation();
    }
}
