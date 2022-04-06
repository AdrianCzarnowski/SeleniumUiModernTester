package modernTester.others.base;

import modernTester.TestBase;
import modernTester.others.page.HighSitePage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HighSiteTest extends TestBase {
    private static Logger log = LoggerFactory.getLogger("HighSite.class");
    private HighSitePage highSitePage;

    public void scroll() {
        driver.get("https://seleniumui.moderntester.pl/high-site.php");
        HighSitePage.scrollToButton();
        HighSitePage.takeScrnSht();



    }
}
