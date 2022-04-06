package modernTester.basic.base;

import modernTester.TestBase;
import modernTester.basic.pages.FormPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;


public class FormTest extends TestBase {

    private static Logger log = LoggerFactory.getLogger("FillFormTest.class");

    public void fillFormWithSuccess() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        FormPage.driverPrepFormSection();
        FormPage.personalData();
        FormPage.listFromForm();
        FormPage.fillProfession();
        FormPage.selectRandomContinent();
        FormPage.seleniumCommandPick();
        FormPage.addFile();
        FormPage.registrationButtonValidation();
    }
}




