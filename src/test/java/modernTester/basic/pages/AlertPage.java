package modernTester.basic.pages;

import modernTester.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class AlertPage extends TestBase {
    private static Logger log = LoggerFactory.getLogger("AlertTestSetUp.class");

    private static String alertSectionXpath = "//*[@id=\"alerts-item\"]";
    private static String confirmAlertBoxButtonXpath = "//*[@id=\"confirm-alert\"]";
    private static String confirmAlertMsgXpath = "//*[@id=\"confirm-label\"]";
    private static String simpleAlertXpath = "//*[@id=\"simple-alert\"]";
    private static String promptPopUpButtonXpath = "//*[@id=\"prompt-alert\"]";
    private static String simpleAlertMsgXpath = "//*[@id=\"simple-alert-label\"]";
    private static String promptPopUpMsgXpath = "//*[@id=\"prompt-label\"]";
    private static String delayedAlertButtonXpath = "//*[@id=\"delayed-alert\"]";
    private static String delayedAlertMsgXpath = "//*[@id=\"delayed-alert-label\"]";
    public static final String VALIDATION_PASS = "♛♛♛♛♛♛♛♛♛♛♛♛♛VALIDATION PASS♛♛♛♛♛♛♛♛♛♛♛♛♛";

    public static void delayedAlertButton() {
        WebElement delayedAlertButton = driver.findElement(By.xpath(delayedAlertButtonXpath));
        delayedAlertButton.click();
    }

    public static void waitForPopUpDelayedAlert() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
        log.info("<<<<<<<<<<<<<<<<<<<<<<<<OK button pressed");
        String alertMsg = driver.findElement(By.xpath(delayedAlertMsgXpath)).getText();
        assertThat(alertMsg, equalTo("OK button pressed"));
        log.info(VALIDATION_PASS);
    }

    public static void driverPrepAlertsSection() {
        driver.get(URL);
        log.info("<<<<<<<<<<<<<<<<<<<<<<<<URL downloaded correctly");
        FormPage.basicSection();
        WebElement alertsSection = driver.findElement(By.xpath(alertSectionXpath));
        alertsSection.click();
        log.info("<<<<<<<<<<<<<<<<<<<<<<<<Section " + PURPLE + "Alerts found");
    }

    public static void confirmAlertSetUP() {
        WebElement confirmAlertBoxButton = driver.findElement(By.xpath(confirmAlertBoxButtonXpath));
        confirmAlertBoxButton.click();
    }

    public static String confirmAlertMsg() {
        String confirmAlertMsg = driver.findElement(By.xpath(confirmAlertMsgXpath)).getText();
        return confirmAlertMsg;
    }

    public static void simpleAlertButton() {
        WebElement simpleAlertButton = driver.findElement(By.xpath(simpleAlertXpath));
        simpleAlertButton.click();
    }

    public static void promptPopUpButton() {
        WebElement promptPopUpButton = driver.findElement(By.xpath(promptPopUpButtonXpath));
        promptPopUpButton.click();
    }

    public static void simpleAlertValidation() {
        driver.switchTo().alert().accept();
        log.info("<<<<<<<<<<<<<<<<<<<<<<<<OK button pressed");

        String alertMsg = driver.findElement(By.xpath(simpleAlertMsgXpath)).getText();
        assertThat(alertMsg, equalTo("OK button pressed"));
        log.info(VALIDATION_PASS);
    }

    public static void promptAlertValidation() {
        driver.switchTo().alert().sendKeys("Lord Vader");
        driver.switchTo().alert().accept();
        log.info("<<<<<<<<<<<<<<<<<<<<<<<<Correctly entered text");

        String alertMsg = driver.findElement(By.xpath(promptPopUpMsgXpath)).getText();
        assertThat(alertMsg, equalTo("Hello Lord Vader! How are you today?"));
        log.info(VALIDATION_PASS);
    }

    public static void confirmAlertBoxAccept() {
        driver.switchTo().alert().accept();
        assertThat(AlertPage.confirmAlertMsg(), equalTo("You pressed OK!"));
        log.info(VALIDATION_PASS);
    }

    public static void confirmAlertBoxDismiss() {
        driver.switchTo().alert().dismiss();
        String confirmAlertMsgCancel = driver.findElement(By.xpath(confirmAlertMsgXpath)).getText();
        assertThat(confirmAlertMsgCancel, equalTo("You pressed Cancel!"));
        log.info(VALIDATION_PASS);
    }
}
