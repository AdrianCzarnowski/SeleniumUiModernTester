package modernTester.basic.pages;

import modernTester.TestBase;
import modernTester.basic.data.FormData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.List;
import java.util.Random;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class FormPage extends TestBase {

    private static Logger log = LoggerFactory.getLogger("FormMethods.class");

    private static Random random = new Random();
    private static final int NUMBER_OF_CONTINENTS = 7;
    private static final int NUMBER_OF_PROFESSION = 2;
    public static int randomContinent = new Random().nextInt(NUMBER_OF_CONTINENTS);

    public static String firstNameCssSelector = "#inputFirstName3";
    private static String formSectionXpath = "//*[@id=\"form-item\"]";
    private static String basicSectionXpath = "//li[1]/a";
    private static String lastNameCssSelector = "#inputLastName3";
    private static String emailCssSelector = "#inputEmail3";
    private static String ageCssSelector = "#inputAge3";
    private static String genderSelector = "gridRadiosSex";
    private static String experienceSelector = "gridRadiosExperience";
    private static String professionCheckBoxSelector = "gridCheckboxProfession";
    private static String continentsSelector = "selectContinents";
    private static String switchCommandsCssSelector = "#selectSeleniumCommands > option:nth-child(3)";
    private static String webElementCommandsCssSelector = "#selectSeleniumCommands > option:nth-child(5)";
    private static String fileIdSelector = "chooseFile";
    private static String singInButtonSelector = "button.btn";
    private static String validationMsgSelector = "validator-message";
    public static final String URL_DOWNLOADED_CORRECTLY = "<<<<<<<<<<<<<<<<<<<<<<<<URL downloaded correctly";
    public static final String SECTION = "<<<<<<<<<<<<<<<<<<<<<<<<Section ";

    public static void driverPrepFormSection() {
        driver.get(URL);
        log.info(URL_DOWNLOADED_CORRECTLY);

        basicSection();
        WebElement formSection = driver.findElement(By.xpath(formSectionXpath));
        formSection.click();
        log.info(SECTION + PURPLE + "Form found");
    }

    public static void basicSection() {
        WebElement basicSection = driver.findElement(By.xpath(basicSectionXpath));
        basicSection.click();
        log.info("<<<<<<<<<<<<<<<<<<<<<<<<basic section was clicked");
    }

    public static WebElement getRandomElement(List<WebElement> elements) {
        return elements.get(new Random().nextInt(elements.size()));
    }

    public static void personalData() {
        WebElement firstName = driver.findElement(By.cssSelector(firstNameCssSelector));
        firstName.sendKeys(FormData.firstNameList());
        log.info("<<<<<<<<<<<<<<<<<<<<<<<<selected random firstname from the list");

        WebElement lastName = driver.findElement(By.cssSelector(lastNameCssSelector));
        lastName.sendKeys(FormData.lastNameList());
        log.info("<<<<<<<<<<<<<<<<<<<<<<<<selected random lastname from the list");

        WebElement email = driver.findElement(By.cssSelector(emailCssSelector));
        email.sendKeys("t" + random.nextInt() + "@sds.pl");
        log.info("<<<<<<<<<<<<<<<<<<<<<<<<random e-mail created correctly");

        WebElement age = driver.findElement(By.cssSelector(ageCssSelector));
        age.clear();
        age.sendKeys(FormData.ageList());
        log.info("<<<<<<<<<<<<<<<<<<<<<<<<selected random age from the list");
    }

    public static void listFromForm() {
        List<WebElement> pickGender = driver.findElements(By.name(genderSelector));
        getRandomElement(pickGender).click();
        log.info("<<<<<<<<<<<<<<<<<<<<<<<<selected random gender");

        List<WebElement> gridRadiosExperience = driver.findElements(By.name(experienceSelector));
        getRandomElement(gridRadiosExperience).click();
        log.info("<<<<<<<<<<<<<<<<<<<<<<<<selected random experience");
    }

    public static void fillProfession() {
        List<WebElement> pickProfession = driver.findElements(By.name(professionCheckBoxSelector));
        for (int i = 0; i <= NUMBER_OF_PROFESSION; i++) {
            pickProfession.get(i).click();
        }
        log.info("<<<<<<<<<<<<<<<<<<<<<<<<All available in the profession section are selected");
    }

    public static void selectRandomContinent() {
        Select continents = new Select(driver.findElement(By.id(continentsSelector)));
        if (randomContinent > 0) {
            continents.selectByIndex(randomContinent);
        }
        log.info("<<<<<<<<<<<<<<<<<<<<<<<<selected random continents");
    }

    public static void seleniumCommandPick() {
        WebElement seleniumCommandsSwitchCommands = driver.findElement(By.cssSelector(switchCommandsCssSelector));
        seleniumCommandsSwitchCommands.click();
        log.info("<<<<<<<<<<<<<<<<<<<<<<<<Switch Commands options have been marked");

        WebElement seleniumCommandsWebElementCommands = driver.findElement(By.cssSelector(webElementCommandsCssSelector));
        seleniumCommandsWebElementCommands.click();
        log.info("<<<<<<<<<<<<<<<<<<<<<<<<WebElement Commands options have been marked");
    }

    public static void addFile() {
        File file = new File("src/main/resources/file.txt");
        driver.findElement(By.id(fileIdSelector)).sendKeys(file.getAbsolutePath());
        log.info("<<<<<<<<<<<<<<<<<<<<<<<<File added properly");
    }

    public static void registrationButtonValidation() {
        WebElement singInButton = driver.findElement(By.cssSelector(singInButtonSelector));
        singInButton.click();
        log.info("<<<<<<<<<<<<<<<<<<<<<<<<Registration successful");

        String msg = driver.findElement(By.id(validationMsgSelector)).getText();
        assertThat(msg, equalTo("Form send with success"));
        log.info(AlertPage.VALIDATION_PASS);
    }
}
