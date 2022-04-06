package modernTester.widgets.pages;

import modernTester.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;
import java.time.LocalDate;
import java.util.List;
import java.util.Random;

public class DataPickerPage extends TestBase {

    private static Logger log = LoggerFactory.getLogger("DataPickerPage.class");

    private static String dataPickerCss = "#datepicker";
    private static String nextMonthButton  = "a.ui-datepicker-next";
    private static String previousMonthButton  = "a.ui-datepicker-prev";

    static LocalDate localDate = LocalDate.now();
    static Random random = new Random();


    private DataPickerPage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement picker = driver.findElement(By.cssSelector(dataPickerCss));
        wait.until(ExpectedConditions.elementToBeClickable(picker));
        picker.click();
    }

    public static void pickToday() {
        new DataPickerPage();
        String today = String.valueOf(localDate.getDayOfMonth());
        chooseDay(today);
        log.info("<<<<<<<<<<<<<<<<<Picked today");
    }
    public static void pickRandomDayFromPreviousMonth() {
        new DataPickerPage();
        int randomDay = random.nextInt(31);
        WebElement previousButton = driver.findElement(By.cssSelector(previousMonthButton));
        previousButton.click();
        chooseDay(String.valueOf(randomDay));
        log.info("<<<<<<<<<<<<<<<<<Picked random day of previous month");

    }

    public static void pick1stDayFromNextMonth() {
        new DataPickerPage();
        WebElement nextButton = driver.findElement(By.cssSelector(nextMonthButton));
        nextButton.click();
        chooseDay(String.valueOf(1));
        log.info("<<<<<<<<<<<<<<<<<Picked first day of next month");
    }

    public static void pickLastDayJanuaryPreviousYear() {
        new DataPickerPage();
        for (int i = 0; i < 9; i++) {
            WebElement nextButton = driver.findElement(By.cssSelector(nextMonthButton));
            nextButton.click();
        }
        chooseDay(String.valueOf(31));
        log.info("<<<<<<<<<<<<<<<<<Picked 31.01.2023");
    }
    public static void pickRandomDatePreviousYear() {
        new DataPickerPage();
        int randomMonth = random.nextInt(11);
        int randomDay = random.nextInt(31);
        for (int i = 0; i < randomMonth; i++) {
            WebElement nextButton = driver.findElement(By.cssSelector(nextMonthButton));
            nextButton.click();
        }
        chooseDay( String.valueOf(randomDay));
        log.info("<<<<<<<<<<<<<<<<<Picked random date of next year");
    }

    public static void chooseDay(String day) {
        List<WebElement> choice = driver.findElements(By.cssSelector(dataPickerCss));
        for (WebElement e : choice){
            if (e.getText().equals(day)){
                e.click();
                break;
            }
        }
    }
}
