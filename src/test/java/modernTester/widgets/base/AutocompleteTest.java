package modernTester.widgets.base;

import modernTester.widgets.pages.AutocompletePage;
import modernTester.widgets.pages.SliderPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AutocompleteTest {

    private static Logger log = LoggerFactory.getLogger("AutocompleteTest.class");

    public void AutocompleteTest() {
        SliderPage.driverPrepWidgetsSection();
        AutocompletePage.AutocompleteSection();
        AutocompletePage.searchAutocomplete();
        AutocompletePage.pickRandomElement();
    }

}
