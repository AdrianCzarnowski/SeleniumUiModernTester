package modernTester.widgets.base;

import modernTester.TestBase;
import modernTester.widgets.pages.DataPickerPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class DataPickerTest extends TestBase {


    private static  Logger log = LoggerFactory.getLogger(DataPickerTest.class);

    public void dataPickerTest () {
        driver.get("https://seleniumui.moderntester.pl/datepicker.php");
        DataPickerPage.pickToday();
        DataPickerPage.pickRandomDayFromPreviousMonth();
        DataPickerPage.pick1stDayFromNextMonth();
        DataPickerPage.pickLastDayJanuaryPreviousYear();
        DataPickerPage.pickRandomDatePreviousYear();
    }

}




