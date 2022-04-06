package modernTester.basic.base;

import modernTester.TestBase;
import modernTester.basic.pages.AlertPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class AlertTests extends TestBase {

    private static Logger log = LoggerFactory.getLogger("AlertTests.class");

    public void simpleAlertPopUP() {
        AlertPage.driverPrepAlertsSection();
        AlertPage.simpleAlertButton();
        AlertPage.simpleAlertValidation();
    }

    public void promptAlertBox() {
        AlertPage.driverPrepAlertsSection();
        AlertPage.promptPopUpButton();
        AlertPage.promptAlertValidation();
    }

    public void confirmAlertBox() {
        AlertPage.driverPrepAlertsSection();
        AlertPage.confirmAlertSetUP();
        AlertPage.confirmAlertBoxAccept();
        AlertPage.confirmAlertSetUP();
        AlertPage.confirmAlertBoxDismiss();
    }
    public void delayedAlert () {
        AlertPage.driverPrepAlertsSection();
        AlertPage.delayedAlertButton();
        AlertPage.waitForPopUpDelayedAlert();
    }
}
