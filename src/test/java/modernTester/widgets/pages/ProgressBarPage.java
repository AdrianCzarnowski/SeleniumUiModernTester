package modernTester.widgets.pages;

import modernTester.TestBase;
import modernTester.basic.pages.FormPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;

public class ProgressBarPage extends TestBase {
    private static Logger log = LoggerFactory.getLogger("ProgressBarSetUp.class");
    private static String progressbarSectionXpath = "//*[@id=\"progressbar-item\"]";

    public static void progressBarSection() {
        WebElement progressBarSection = driver.findElement(By.xpath(progressbarSectionXpath));
        progressBarSection.click();
        log.info(FormPage.SECTION + PURPLE + "Progressbar found");
    }

    public static void progressBarWaitToComplete() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement progressbar = driver.findElement(By.cssSelector(".ui-progressbar-value"));
        wait.until(ExpectedConditions.attributeContains(progressbar, "class", "ui-progressbar-complete"));
        log.info("<<<<<<<<<<<<<<<<<<<<<<<<Loading complete!!!");
    }
}
