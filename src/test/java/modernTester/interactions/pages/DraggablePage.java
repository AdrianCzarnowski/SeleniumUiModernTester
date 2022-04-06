package modernTester.interactions.pages;

import modernTester.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DraggablePage extends TestBase {

    private static Logger log = LoggerFactory.getLogger(DraggablePage.class);
    private static String draggableSectionCss = "#draggable-item";
    private static String draggableSquareCss = "#draggable";

    public static void draggableSectionPrep() {

        WebElement draggableSection = driver.findElement(By.cssSelector(draggableSectionCss));
        draggableSection.click();
        log.info("<<<<<<<<<<<<<<<<<<<<<<<<Square founded");

    }

    public static void squareMove() {

        WebElement draggableSquare = driver.findElement(By.cssSelector(draggableSquareCss));
        Actions action = new Actions(driver);
        action.dragAndDropBy(draggableSquare, 500, 0).build().perform();
        action.dragAndDropBy(draggableSquare, 0, 400).build().perform();
        action.dragAndDropBy(draggableSquare, -500, 0).build().perform();
        action.dragAndDropBy(draggableSquare, 250, -250).build().perform();
        log.info("<<<<<<<<<<<<<<<<<<<<<<<<Square moved");
    }
}
