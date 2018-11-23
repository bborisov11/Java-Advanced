import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class StudentsByGroup {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = "";
        Map<String, Integer> names = new HashMap<>();
        while(!(input = reader.readLine()).equals("END")) {
            String[] arg = input.split(" ");

            String firstName = arg[0];
            String lastName = arg[1];
            int group = Integer.parseInt(arg[2]);

            names.putIfAbsent(firstName + " " + lastName, group);
        }

        names.entrySet()
                .stream()
                .filter(x -> x.getValue().equals(2))
                .sorted(Comparator.comparing(x -> x.getKey().split(" ")[0]))
                .map(Map.Entry::getKey)
                .forEach(System.out::println);
    }
}
