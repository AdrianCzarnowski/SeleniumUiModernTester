package modernTester.basic.data;

import modernTester.TestBase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Random;

public class FormData extends TestBase {

    private static Logger log = LoggerFactory.getLogger("FormData.class");

    public static String firstNameList() {
        ArrayList<String> firstName = new ArrayList<String>();
        firstName.add("Katarzyna");
        firstName.add("Wiktoria");
        firstName.add("Agnieszka");
        firstName.add("Patrycja");
        log.info("<<<<<<<<<<<<Created a list of firstnames");
        return firstName.get(new Random().nextInt(firstName.size()));
    }

    public static String lastNameList() {
        ArrayList<String> lastName = new ArrayList<String>();
        lastName.add("Wolska");
        lastName.add("Lewandowska");
        lastName.add("Nowak");
        lastName.add("Wenta");
        log.info("<<<<<<<<<<<<Created a list of lastnames");
        return lastName.get(new Random().nextInt(lastName.size()));
    }

    public static String ageList() {
        ArrayList<String> age = new ArrayList<String>();
        age.add("25");
        age.add("31");
        age.add("38");
        age.add("45");
        log.info("<<<<<<<<<<<<Age list created");
        return age.get(new Random().nextInt(age.size()));
    }
}

