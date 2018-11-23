import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class WeakStudents {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = "";
        Map<String, String> names = new LinkedHashMap<>();
        while (!(input = reader.readLine()).equals("END")) {
            String[] arg = input.split(" ", 3);

            String firstName = arg[0];
            String lastName = arg[1];
            String grades = arg[2];

            names.putIfAbsent(firstName + " " + lastName, grades);
        }

        names.entrySet()
                .stream()
                .filter(x -> {
                    String[] grades = x.getValue().split(" ");
                    int counter = 0;
                    for (String grade : grades) {
                        if(Integer.parseInt(grade) <=3) {
                            counter++;
                        }
                    }
                    if(counter >= 2) {
                        return true;
                    }
                    else {
                        return false;
                    }
                })
                .map(Map.Entry::getKey)
                .forEach(System.out::println);
    }
}
