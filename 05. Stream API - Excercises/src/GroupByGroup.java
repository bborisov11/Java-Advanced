import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByGroup {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = "";
        Map<String, String> names = new LinkedHashMap<>();
        while (!(input = reader.readLine()).equals("END")) {
            String[] arg = input.split(" ");

            String firstName = arg[0];
            String lastName = arg[1];
            String grades = arg[2];

            names.putIfAbsent(firstName + " " + lastName, grades);
        }

    }
}
