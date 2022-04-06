package modernTester.interactions.pages;

import modernTester.TestBase;
import modernTester.basic.pages.AlertPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class SelectablePage extends TestBase {

    private static Logger log = LoggerFactory.getLogger("SelectablePage.class");
    private static String selectableSectionCss = "#selectable-item";
    private static String firstItemCss = ".ui-selectable :first-child";
    private static String thirdItemCss = ".ui-selectable :nth-child(3)";
    private static String fourthItemCss = ".ui-selectable :nth-child(4)";
    private static String feedbackCss = "#feedback";
    static Actions actions = new Actions(driver);


    public static void selectableSection() {
        WebElement droppableSection = driver.findElement(By.cssSelector(selectableSectionCss));
        droppableSection.click();
    }

    public static void pickOptions() {
        WebElement firstItem = driver.findElement(By.cssSelector(firstItemCss));
        WebElement thirdItem = driver.findElement(By.cssSelector(thirdItemCss));
        WebElement fourthItem = driver.findElement(By.cssSelector(fourthItemCss));

        actions.keyDown(Keys.CONTROL).perform();
        firstItem.click();
        thirdItem.click();
        fourthItem.click();
        actions.keyUp(Keys.CONTROL).perform();
        log.info("<<<<<<<<<<<<<<<<<<<<<<<<Options 1,3 and 4 picked");
    }

    public static void validationText() {
        WebElement feedback = driver.findElement(By.cssSelector(feedbackCss));
        assertThat(feedback.getText(), equalTo("You've selected: #1 #3 #4."));
        log.info(AlertPage.VALIDATION_PASS);

    }
}
