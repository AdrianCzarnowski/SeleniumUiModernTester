package modernTester.interactions.base;


import modernTester.TestBase;
import modernTester.interactions.pages.DraggablePage;
import modernTester.interactions.pages.DroppablePage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DraggableTest extends TestBase {

    private static final Logger log = LoggerFactory.getLogger(DraggableTest.class);

    public static void draggableTest() {
        DroppablePage.interactionsSectionPrep();
        DraggablePage.draggableSectionPrep();
        DraggablePage.squareMove();
    }
}
