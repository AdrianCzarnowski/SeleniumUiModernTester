package modernTester.widgets.pages;

import modernTester.TestBase;
import modernTester.basic.pages.AlertPage;
import modernTester.widgets.data.ModalDialogData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class ModalDialogPage extends TestBase {

    private static Logger log = LoggerFactory.getLogger("ModalDialogSetUp.class");

    private static String modalSectionCss = "#modal-dialog-item";
    private static String createNewUserButtonCss = "#create-user";
    private static String newUserNameCss = "#name";
    private static String newUserEmailCss = "#email";
    private static String newUserPasswordCss = "#password";
    private static String createAnAccountButtonCss = "div > button:nth-child(1)";
    private static String validationXpath = "//tbody/tr[2]";
    private static String name = ModalDialogData.nameList();
    private static String email = ModalDialogData.emailList();
    private static String pass = ModalDialogData.passList();

    public static void modalSection() {
        WebElement modalSection = driver.findElement(By.cssSelector(modalSectionCss));
        modalSection.click();
        WebElement createNewButton = driver.findElement(By.cssSelector(createNewUserButtonCss));
        createNewButton.click();
    }

    public static void createNewUser() {
        WebElement nameNewUser = driver.findElement(By.cssSelector(newUserNameCss));
        nameNewUser.clear();
        nameNewUser.sendKeys(name);

        WebElement emailNewUser = driver.findElement(By.cssSelector(newUserEmailCss));
        emailNewUser.clear();
        emailNewUser.sendKeys(email);

        WebElement passwordNewUser = driver.findElement(By.cssSelector(newUserPasswordCss));
        passwordNewUser.clear();
        passwordNewUser.sendKeys(pass);

        WebElement createAnAccount = driver.findElement(By.cssSelector(createAnAccountButtonCss));
        createAnAccount.click();
    }

    public static void userValidation() {
        WebElement userValidation = driver.findElement(By.xpath(validationXpath));
        String user = name + " " + email + " " + pass;
        log.info(userValidation.getText());
        log.info(user);
        assertThat(user, equalTo(userValidation.getText()));
        log.info(AlertPage.VALIDATION_PASS);
    }

}
