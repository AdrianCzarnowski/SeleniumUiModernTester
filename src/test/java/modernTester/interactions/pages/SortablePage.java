package modernTester.interactions.pages;

import modernTester.TestBase;
import modernTester.basic.pages.AlertPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class SortablePage extends TestBase {
    private static Logger log = LoggerFactory.getLogger("SortablePage.class");
    private static  String sortableSectionCss = "#sortable-item";
    private static  String sortableItemsCss = "#sortable li";

    public static void sortablePageSet(){
        WebElement sortableSection = driver.findElement(By.cssSelector(sortableSectionCss));
        sortableSection.click();
    }
    public static void sortableListAndShuffle() {

        int itemCount = driver.findElements(By.cssSelector(sortableItemsCss)).size();

        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= itemCount; i++) {
            numbers.add(i);
        }
        Collections.shuffle(numbers);
        log.info("<<<<<<<<<<<<<<<<<<<<<<<<Options shuffled");
        log.info(String.valueOf(numbers));

        for (int i = 0; i < itemCount; i++) {
            int searchIndex = numbers.get(i);
            WebElement drag = driver.findElement(By.xpath("//li[contains(text(), 'Item " + searchIndex + "')]"));
            WebElement drop = driver.findElements(By.cssSelector(sortableItemsCss)).get(i);
            Actions actions = new Actions(driver);
            actions.dragAndDrop(drag, drop).perform();

        }

        List<Integer> actualValue = new ArrayList<>();
        for (int i = 0; i < itemCount ; i++) {
            int b = Integer.parseInt(driver.findElements(By.cssSelector(sortableItemsCss)).get(i).getText().replace("Item ", ""));
            actualValue.add(b);
        }
        assertThat(actualValue, equalTo(numbers));
        log.info(AlertPage.VALIDATION_PASS);
    }
}
