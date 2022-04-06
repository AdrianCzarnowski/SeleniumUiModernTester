package modernTester.basic.pages;

import modernTester.TestBase;
import modernTester.basic.data.FormData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class IframesPage extends TestBase {
    private static Logger log = LoggerFactory.getLogger("FormSetUp.class");

    private static String iframesSectionXpath = "//*[@id=\"iframes-item\"]";
    private static String iframesNo1Name = "iframe1";
    private static String iframesNo2Name = "iframe2";
    private static String lastNameCssSelector = "#inputSurname3";
    private static String loginCssSelector = "#inputLogin";
    private static String passwordCssSelector = "#inputPassword";
    private static String continentsCssSelector = "#inlineFormCustomSelectPref";
    private static String experienceCssSelector = "gridRadios";

    public static void driverPrepIframesSection() {
        driver.get(URL);
        log.info(FormPage.URL_DOWNLOADED_CORRECTLY);

        FormPage.basicSection();
        WebElement iframesSection = driver.findElement(By.xpath(iframesSectionXpath));
        iframesSection.click();
        log.info(FormPage.SECTION + PURPLE + "Iframes found");
    }

    public static void switchToFirstIframe() {
        driver.switchTo().frame(iframesNo1Name);
        log.info("<<<<<<<<<<<<<<<<<<<<<<<<switch to first Iframe");
    }

    public static void switchToSecondIframe() {
        driver.switchTo().frame(iframesNo2Name);
        log.info("<<<<<<<<<<<<<<<<<<<<<<<<switch to second Iframe");
    }

    public static void firstIframes() {
        WebElement firstName = driver.findElement(By.cssSelector(FormPage.firstNameCssSelector));
        firstName.sendKeys(FormData.firstNameList());
        log.info("<<<<<<<<<<<<<<<<<<<<<<<<selected random firstname from the list");

        WebElement lastName = driver.findElement(By.cssSelector(lastNameCssSelector));
        lastName.sendKeys(FormData.lastNameList());
        log.info("<<<<<<<<<<<<<<<<<<<<<<<<selected random lastname from the list");
    }

    public static void fillSecondIframes() {
        WebElement login = driver.findElement(By.cssSelector(loginCssSelector));
        login.sendKeys(FormData.firstNameList());
        log.info("<<<<<<<<<<<<<<<<<<<<<<<<selected random login from the list");

        WebElement password = driver.findElement(By.cssSelector(passwordCssSelector));
        password.sendKeys(FormData.lastNameList());
        log.info("<<<<<<<<<<<<<<<<<<<<<<<<selected random password from the list");

        Select continents = new Select(driver.findElement(By.cssSelector(continentsCssSelector)));
        if (FormPage.randomContinent > 0) {
            continents.selectByIndex(FormPage.randomContinent);
        }
        log.info("<<<<<<<<<<<<<<<<<<<<<<<<selected random continents");

        List<WebElement> gridRadiosExperience = driver.findElements(By.name(experienceCssSelector));
        FormPage.getRandomElement(gridRadiosExperience).click();
        log.info("<<<<<<<<<<<<<<<<<<<<<<<<selected random experience");
    }

    public static void defaultIframe() {
        driver.switchTo().defaultContent();
        log.info("<<<<<<<<<<<<<<<<<<<<<<<<switch to default Iframe");
    }

}

