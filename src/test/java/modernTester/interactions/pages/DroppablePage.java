package modernTester.interactions.pages;

import modernTester.TestBase;
import modernTester.basic.pages.AlertPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static modernTester.basic.pages.FormPage.SECTION;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class DroppablePage extends TestBase {

    private static Logger log = LoggerFactory.getLogger("DroppableTestSetUp.class");

    private static String interactionsSectionXpath = "li:nth-child(2) > a";
    private static String droppableSectionCss = "#droppable-item";
    private static String dragSquareId = "#draggable";
    private static String dropSquareId = "#droppable";

    public static void interactionsSectionPrep() {
        driver.get(URL);
        WebElement interActionsSection = driver.findElement(By.cssSelector(interactionsSectionXpath));
        interActionsSection.click();
        log.info(SECTION + PURPLE + "Interactions found");
    }

    public static void droppableSection() {
        WebElement droppableSection = driver.findElement(By.cssSelector(droppableSectionCss));
        droppableSection.click();

    }

    public static void dragAndDropAndValidation() {
        WebElement dragSquare = driver.findElement(By.cssSelector(dragSquareId));
        WebElement dropSquare = driver.findElement(By.cssSelector(dropSquareId));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(dragSquare, dropSquare).perform();
        log.info("<<<<<<<<<<<<<<<<<<<<<<<<dragged and dropped!");
        assertThat(dropSquare.getText(), equalTo("Dropped!"));
        log.info(AlertPage.VALIDATION_PASS);
    }

}
