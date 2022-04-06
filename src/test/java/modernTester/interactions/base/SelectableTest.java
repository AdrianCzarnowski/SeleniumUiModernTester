package modernTester.interactions.base;


import modernTester.TestBase;
import modernTester.interactions.pages.DroppablePage;
import modernTester.interactions.pages.SelectablePage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SelectableTest extends TestBase {

    private static Logger log = LoggerFactory.getLogger("SelectableTest.class");

    public void selectableTest() {
        DroppablePage.interactionsSectionPrep();
        SelectablePage.selectableSection();
        SelectablePage.pickOptions();
        SelectablePage.validationText();
    }
}
