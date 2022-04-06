package modernTester.widgets.base;

import modernTester.TestBase;
import modernTester.widgets.pages.ModalDialogPage;
import modernTester.widgets.pages.SliderPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ModalDialogTest extends TestBase {

    private static Logger log = LoggerFactory.getLogger("ModalDialogTest.class");

    public void modalTest() {
        SliderPage.driverPrepWidgetsSection();
        ModalDialogPage.modalSection();
        ModalDialogPage.createNewUser();
        ModalDialogPage.userValidation();
    }
}
