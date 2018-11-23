import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> map = new HashMap<>();
        String input = "";
        int counter = 0;
        String name = "";

        while (!(input = scanner.nextLine()).equals("stop")) {

            if (counter % 2 == 0) {
                name = input;
            } else {
                String email = input;
                if(!(email.endsWith("us") || email.endsWith("US") || email.endsWith("com") || email.endsWith("COM")  || email.endsWith("uk") || email.endsWith("UK"))) {
                    map.putIfAbsent(name, email);
                }
            }
            counter++;
        }

        for (Map.Entry<String, String> stringIntegerEntry : map.entrySet()){
            System.out.println(stringIntegerEntry.getKey() + " -> " + stringIntegerEntry.getValue());
        }
    }
}

