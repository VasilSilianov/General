import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class TestForMitko {

    public static void main(String[] args) {
        /**
         * Logic part
         */
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        Map<String,String> nameDate = new HashMap<>();
        nameDate.put("Vasil", formatter.format(date));
        nameDate.put("Mitko", formatter.format(date));
        nameDate.put("Velizar", formatter.format(date));
        nameDate.put("Angel", formatter.format(date));

        /**
         * Testing part
         */
        System.out.println(nameDate.get("Mitko"));
        System.out.println(nameDate.get("Velizar"));
        System.out.println(nameDate.get("Angel"));
        System.out.println(nameDate.get("Vasil"));
    }
}
