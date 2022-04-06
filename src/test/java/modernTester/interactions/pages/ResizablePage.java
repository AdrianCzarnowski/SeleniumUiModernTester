package modernTester.interactions.pages;

import modernTester.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ResizablePage extends TestBase {

    private static Logger log = LoggerFactory.getLogger("ResizablePage.class");
    private static String resizableSectionCss = "#resizable-item";
    private static String resizablePointCss = ".ui-resizable-se";

    public static void resizableWebPrep() {
        WebElement resizableSection = driver.findElement(By.cssSelector(resizableSectionCss));
        resizableSection.click();
        log.info("<<<<<<<<<<<<<<<<<<<<<<<<resizable point founded");
    }

    public static void resizable() {
        WebElement resizable = driver.findElement(By.cssSelector(resizablePointCss));
        Actions actions = new Actions(driver);
        actions.dragAndDropBy(resizable, 10, 0).build().perform();
        actions.dragAndDropBy(resizable, 0, 10).build().perform();
        actions.dragAndDropBy(resizable, 10, 10).build().perform();
        log.info("<<<<<<<<<<<<<<<<<<<<<<<<Resizable confirmed!");
    }
}
