import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class StudentsByAge {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = "";
        Map<String, Integer> names = new LinkedHashMap<>();
        while(!(input = reader.readLine()).equals("END")) {
            String[] arg = input.split(" ");

            String firstName = arg[0];
            String lastName = arg[1];
            int age = Integer.parseInt(arg[2]);

            names.putIfAbsent(firstName + " " + lastName, age);
        }

        names.entrySet()
                .stream()
                .filter(x -> x.getValue() >= 18 && x.getValue() <= 24)
                .forEach(x -> System.out.println(x.getKey()+ " " + x.getValue()));
    }
}
