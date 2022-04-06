package modernTester.widgets.pages;

import modernTester.basic.pages.FormPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;

import static modernTester.TestBase.PURPLE;
import static modernTester.TestBase.driver;

public class AccordionPage  {

    private static Logger log = LoggerFactory.getLogger("AccordionSetUp.class");
    private static String accordingSectionXpath = "//*[@id=\"accordion-item\"]";
    private static String section1Xpath = "//*[@id=\"ui-id-1\"]";
    private static String section1TextXpath = "//*[@id=\"ui-id-2\"]";
    private static String section2Xpath = "//*[@id=\"ui-id-3\"]";
    private static String section2TextXpath = "//*[@id=\"ui-id-4\"]";
    private static String section3Xpath = "//*[@id=\"ui-id-5\"]";
    private static String section3TextXpath = "//*[@id=\"ui-id-6\"]";
    private static String section4Xpath = "//*[@id=\"ui-id-7\"]";
    private static String section4TextXpath = "//*[@id=\"ui-id-8\"]";

    public static void driverPrepAccordingSection() {
        WebElement AccordingSection = driver.findElement(By.xpath(accordingSectionXpath));
        AccordingSection.click();
        log.info(FormPage.SECTION + PURPLE + "According found");
    }

    public static void section1GetText() {
        WebElement Section1 = driver.findElement(By.xpath(section1Xpath));
        Section1.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));
        WebElement Section1_Text = driver.findElement(By.xpath(section1TextXpath));
        wait.until(ExpectedConditions.textToBePresentInElement(Section1_Text, "Donec"));
        String Section1TextToString = Section1_Text.getText();
        log.info("Text from first section : " + Section1TextToString);
    }

    public static void section2GetText() {
        WebElement Section2 = driver.findElement(By.xpath(section2Xpath));
        Section2.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));
        WebElement Section2_Text = driver.findElement(By.xpath(section2TextXpath));
        wait.until(ExpectedConditions.textToBePresentInElement(Section2_Text, "urna"));
        String Section2TextToString = Section2_Text.getText();
        log.info("Text from second section : " + Section2TextToString);
    }

    public static void section3GetText() {
        WebElement Section3 = driver.findElement(By.xpath(section3Xpath));
        Section3.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));
        WebElement Section3_Text = driver.findElement(By.xpath(section3TextXpath));
        wait.until(ExpectedConditions.textToBePresentInElement(Section3_Text, "three"));
        String Section3TextToString = Section3_Text.getText();
        log.info("Text from third section : " + Section3TextToString);
    }

    public static void section4GetText() {
        WebElement Section4 = driver.findElement(By.xpath(section4Xpath));
        Section4.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement Section4_Text = driver.findElement(By.xpath(section4TextXpath));
        wait.until(ExpectedConditions.textToBePresentInElement(Section4_Text, "himenaeos"));
        String Section4TextToString = Section4_Text.getText();
        log.info("Text from fourth section : " + Section4TextToString);
    }
}



