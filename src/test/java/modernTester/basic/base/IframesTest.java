package modernTester.basic.base;

import modernTester.TestBase;
import modernTester.basic.pages.FormPage;
import modernTester.basic.pages.IframesPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IframesTest extends TestBase {
    private static Logger log = LoggerFactory.getLogger("IframesTest.class");

    public void iframes() {
        IframesPage.driverPrepIframesSection();
        IframesPage.switchToFirstIframe();
        IframesPage.firstIframes();
        IframesPage.defaultIframe();
        IframesPage.switchToSecondIframe();
        IframesPage.fillSecondIframes();
        IframesPage.defaultIframe();
        FormPage.basicSection();
    }
}
