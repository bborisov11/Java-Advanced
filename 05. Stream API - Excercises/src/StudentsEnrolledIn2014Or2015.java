import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class StudentsEnrolledIn2014Or2015 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = "";
        Map<String, String> names = new LinkedHashMap<>();
        while (!(input = reader.readLine()).equals("END")) {
            String[] arg = input.split(" ", 2);

            String year = arg[0];
            String grades = arg[1];

            names.putIfAbsent(year, grades);
        }

        names.entrySet()
                .stream()
                .filter(x -> x.getKey().endsWith("14") || x.getKey().endsWith("15"))
                .map(Map.Entry::getValue)
                .forEach(System.out::println);
    }
}
