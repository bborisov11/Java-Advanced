import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class FilterStudentsByPhone {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = "";
        Map<String, String> names = new LinkedHashMap<>();
        while(!(input = reader.readLine()).equals("END")) {
            String[] arg = input.split(" ");

            String firstName = arg[0];
            String lastName = arg[1];
            String phone = arg[2];

            names.putIfAbsent(firstName + " " + lastName, phone);
        }

        names.entrySet()
                .stream()
                .filter(x -> x.getValue().startsWith("02") || x.getValue().startsWith("+3592"))
                .map(Map.Entry::getKey)
                .forEach(System.out::println);
    }
}
