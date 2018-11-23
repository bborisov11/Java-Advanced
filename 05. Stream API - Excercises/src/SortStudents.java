import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class SortStudents {
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

         names.sort(Comparator.comparing((String x) -> x.split(" ")[1]).thenComparing(y -> y.split(" ")[0],Comparator.reverseOrder()));

        for (String name : names) {
            System.out.println(name);
        }

    }
}
