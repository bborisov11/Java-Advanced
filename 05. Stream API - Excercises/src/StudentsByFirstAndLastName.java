import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class StudentsByFirstAndLastName {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = "";
        List<String> names = new ArrayList<>();
        while(!(input = reader.readLine()).equals("END")) {
            String[] arg = input.split(" ");

            String firstName = arg[0];
            String lastName = arg[1];

            names.add(firstName + " " + lastName);
        }
                names
                .stream()
                .filter(x -> x.split(" ")[0].compareTo(x.split(" ")[1]) < 0)
                .forEach(System.out::println);

    }
}
