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

public class MenuTestPage extends TestBase {
    private static Logger log = LoggerFactory.getLogger("MenuTestSetUp.class");

    private static String menuSectionCss = "#menu-item";
    private static String musicCss = "#ui-id-9";
    private static String jazzCss = "#ui-id-13";
    private static String modernCss = "#ui-id-16";

    public static void menuSection() {
        WebElement menuSection = driver.findElement(By.cssSelector(menuSectionCss));
        menuSection.click();
        log.info(FormPage.SECTION + PURPLE + "Music found");
    }

    public static void pickMusic() {
        WebElement music = driver.findElement(By.cssSelector(musicCss));
        music.click();
        log.info("<<<<<<<<<<<<<<Music picked");
    }

    public static void pickJazzNextModern() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));
        WebElement jazz = driver.findElement(By.cssSelector(jazzCss));
        wait.until(ExpectedConditions.elementToBeClickable(jazz));
        jazz.click();
        log.info("<<<<<<<<<<<<<<Jazz picked");

        WebElement modern = driver.findElement(By.cssSelector(modernCss));
        wait.until(ExpectedConditions.elementToBeClickable(modern));
        modern.click();
        log.info("<<<<<<<<<<<<<<Modern picked");
    }
}
