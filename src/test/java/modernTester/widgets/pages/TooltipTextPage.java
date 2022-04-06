package modernTester.widgets.pages;

import modernTester.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TooltipTextPage extends TestBase {

    private static Logger log = LoggerFactory.getLogger("TooltipTextSetUp.class");

    private static String tooltipSectionXpath = "//*[@id=\"tooltip-item\"]";
    private static String tooltip = "//div";
    private static String firstTooltipsTextBox = "//p[1]/a";
    private static String secondTooltipsTextBox = "//p[2]/a";
    private static String tooltipMsg = "<<<<<<<<<<<<<<tooltip text : ";
    private static String title = "title";

    public static void driverPrepTooltip() {
        driver.get(URL);
        SliderPage.driverPrepWidgetsSection();
        WebElement tooltipSection = driver.findElement(By.xpath(tooltipSectionXpath));
        tooltipSection.click();
    }

    public static void firstTooltipTest() {
        WebElement tooltipsTextBox = driver.findElement(By.xpath(firstTooltipsTextBox));
        String firstToolTipText = tooltipsTextBox.getAttribute(title);
        log.info(tooltipMsg + firstToolTipText);
    }

    public static void secondTooltipTest() {
        WebElement tooltipsTextBox = driver.findElement(By.xpath(secondTooltipsTextBox));
        String secondToolTipText = tooltipsTextBox.getAttribute(title);
        log.info(tooltipMsg + secondToolTipText);
    }
}
