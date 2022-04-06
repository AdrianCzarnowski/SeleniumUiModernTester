package modernTester.widgets.pages;

import modernTester.TestBase;
import modernTester.basic.pages.FormPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Random;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;


public class AutocompletePage extends TestBase {
    private static Logger log = LoggerFactory.getLogger("AutocompleteSetUp.class");
    private static String autocompleteSectionXpath = "//*[@id=\"autocomplete-item\"]";
    private static String searchAutocompleteCss = "#search";
    private static String searchResultsXpath = "//*[@id=\"ui-id-1\"]";
    private static String listOfItems = ".ui-menu-item";

    public static void AutocompleteSection() {
        WebElement autocompleteSection = driver.findElement(By.xpath(autocompleteSectionXpath));
        autocompleteSection.click();
        log.info(FormPage.SECTION + PURPLE + "Autocomplete found");
    }

    public static void searchAutocomplete() {

        WebElement searchAutocomplete = driver.findElement(By.cssSelector(searchAutocompleteCss));
        searchAutocomplete.sendKeys("a");
        WebElement getTextOfResults = driver.findElement(By.xpath(searchResultsXpath));
        log.info(getTextOfResults.getText());
        log.info("<<<<<<<<<<<<<<<<<<<<<<<<List of all available options is visible");
    }

    public static void pickRandomElement() {

        WebElement searchAutocomplete = driver.findElement(By.cssSelector(searchAutocompleteCss));
        List<WebElement> results = driver.findElements(By.cssSelector(listOfItems));
        int random = new Random().nextInt(results.size());
        WebElement randomElement = results.get(random);
        String valueRandomElement = randomElement.getText();
        randomElement.click();
        log.info("<<<<<<<<<<<<<<<<<<<<<<<<Picked random option");

        String searchText = searchAutocomplete.getAttribute("value");

        assertThat(valueRandomElement, equalTo(searchText));
        log.info(SliderPage.CONFIRM_VALIDATION);

    }
}



