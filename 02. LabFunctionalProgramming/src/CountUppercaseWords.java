import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class CountUppercaseWords {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] words = reader.readLine().split("\\s+");

        Predicate<String> startsWithUpperCase = letter -> letter.charAt(0) == letter.toUpperCase().charAt(0);
        Consumer<List<String>> printList = list -> System.out.println(String.join("\n",list));
        int counter = 0;
        List<String> list = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {

            if(startsWithUpperCase.test(words[i])) {
                counter++;
                list.add(words[i]);
            }
        }
        System.out.println(counter);
        printList.accept(list);
    }
}
