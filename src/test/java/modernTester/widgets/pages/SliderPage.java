package modernTester.widgets.pages;

import modernTester.TestBase;
import modernTester.basic.pages.FormPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class SliderPage extends TestBase {

    private static Logger log = LoggerFactory.getLogger("SliderSetUp.class");

    private static Actions actions = new Actions(driver);
    private static String widgetsSectionXpath = "//li[3]/a";
    private static String sliderXpath = "//*[@id=\"custom-handle\"]";
    private static String sliderSectionXpath = "//*[@id=\"slider-item\"]";
    private static String sliderAttribute = "style";
    public static final String CONFIRM_VALIDATION = "<<<<<<<<<<<<<<<<<<<<<<<<Value are the same as expected";
    private static final String SLIDER_MOVE = "<<<<<<<<<<<<<<<<<<<<<<<<Slider move to value :";

    public static void driverPrepWidgetsSection() {
        driver.get(URL);
        log.info(FormPage.URL_DOWNLOADED_CORRECTLY);
        WebElement widgetsSection = driver.findElement(By.xpath(widgetsSectionXpath));
        widgetsSection.click();
    }

    public static void driverPrepSliderSection() {
        driverPrepWidgetsSection();
        WebElement sliderSection = driver.findElement(By.xpath(sliderSectionXpath));
        sliderSection.click();
        log.info(FormPage.SECTION + PURPLE + "Slider found");
    }

    public static void sliderIsDisplayed() {
        boolean Display = driver.findElement(By.xpath(sliderXpath)).isDisplayed();
        log.info("<<<<<<<<<<<<<<<<<<<<<<<<Slider is displayed");
    }

    public static void slider50Percent() {
        WebElement slider = driver.findElement(By.xpath(sliderXpath));
        actions.moveToElement(slider)
                .click().dragAndDropBy(slider, 544, 500).build().perform();
        log.info(SLIDER_MOVE + 50);
        String sliderPercent = slider.getAttribute(sliderAttribute);
        assertThat(sliderPercent, equalTo("left: 50%;"));
        log.info(CONFIRM_VALIDATION);
    }

    public static void slider80Percent() {
        WebElement slider = driver.findElement(By.xpath(sliderXpath));
        actions.moveToElement(slider)
                .click().dragAndDropBy(slider, 320, 500).release().build().perform();
        log.info(SLIDER_MOVE + "80");

        String sliderPercent = slider.getAttribute(sliderAttribute);
        assertThat(sliderPercent, equalTo("left: 80%;"));
        log.info(CONFIRM_VALIDATION);

        actions.moveToElement(slider)
                .click().dragAndDropBy(slider, -10, 500).release().build().perform();
        log.info(SLIDER_MOVE + 80);
        assertThat(sliderPercent, equalTo("left: 80%;"));
        log.info(CONFIRM_VALIDATION);
    }

    public static void slider0Percent() {
        WebElement slider = driver.findElement(By.xpath(sliderXpath));
        actions.moveToElement(slider)
                .click().dragAndDropBy(slider, -904, 500).release().build().perform();
        log.info(SLIDER_MOVE + 0);
        String sliderPercent = slider.getAttribute(sliderAttribute);
        assertThat(sliderPercent, equalTo("left: 0%;"));
        log.info(CONFIRM_VALIDATION);
    }

}
