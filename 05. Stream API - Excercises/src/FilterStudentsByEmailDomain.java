import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FilterStudentsByEmailDomain {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = "";
        Map<String, String> names = new LinkedHashMap<>();
        while(!(input = reader.readLine()).equals("END")) {
            String[] arg = input.split(" ");

            String firstName = arg[0];
            String lastName = arg[1];
            String email = arg[2];

            names.putIfAbsent(firstName + " " + lastName, email);
        }

        names.entrySet()
                .stream()
                .filter(x -> x.getValue().endsWith("@gmail.com"))
                .map(Map.Entry::getKey)
                .forEach(System.out::println);
    }
}
