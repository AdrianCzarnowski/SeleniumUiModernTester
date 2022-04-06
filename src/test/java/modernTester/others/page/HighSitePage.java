package modernTester.others.page;

import modernTester.TestBase;
import modernTester.basic.pages.AlertPage;
import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDate;
import java.util.Random;


public class HighSitePage extends TestBase {

    private static Logger log = LoggerFactory.getLogger("HighSitePage.class");

    private static String buttonCss = "#scroll-button";

    public static void scrollToButton() {
        JavascriptExecutor js =(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2000)", "");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement button = driver.findElement(By.cssSelector(buttonCss));
        wait.until(ExpectedConditions.visibilityOf(button));
        log.info(AlertPage.VALIDATION_PASS);
    }

    public static void takeScrnSht() {
        TakesScreenshot screenshot = ((TakesScreenshot) driver);
        File screenshotFile = screenshot.getScreenshotAs(OutputType.FILE);
        int number = new Random().nextInt(100);
        LocalDate date = LocalDate.now();
        File file = new File("src/main/resources/screenshots/" + number + "Date" + date + ".png");
        try {
            FileUtils.copyFile(screenshotFile, file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        log.info("<<<<<<<<<<<<<<<<<<<<Screenshot taken");
    }

}
