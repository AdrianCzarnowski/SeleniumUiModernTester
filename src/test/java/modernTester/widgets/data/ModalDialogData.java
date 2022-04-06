package modernTester.widgets.data;

import java.util.ArrayList;
import java.util.Random;

public class ModalDialogData {

    public static String nameList() {
        ArrayList<String> name = new ArrayList<String>();
        name.add("Michal SDDS");
        name.add("Maciek AAAA");
        name.add("Maciek AAAAA");
        name.add("Maciek AAAAAA");
        name.add("Maciek AAAAAAA");
        name.add("Tomax YY");
        name.add("Tomax YYY");
        name.add("Tomax YYYY");
        name.add("Kasia KK");
        name.add("Kasia KKK");
        name.add("Kasia KKKK");
        name.add("Kasia KKKKK");
        name.add("Kasia KKKKKD");
        return name.get(new Random().nextInt(name.size()));
    }

    public static String emailList() {
        ArrayList<String> email = new ArrayList<String>();
        email.add("Wolska@wp.pl");
        email.add("Lewandowska@wp.pl");
        email.add("Nowak@wp.pl");
        email.add("Wenta@wp.pl");
        return email.get(new Random().nextInt(email.size()));
    }

    public static String passList() {
        ArrayList<String> pass = new ArrayList<String>();
        pass.add("25344334");
        pass.add("3134334");
        pass.add("383443");
        pass.add("453443");
        return pass.get(new Random().nextInt(pass.size()));
    }
}
