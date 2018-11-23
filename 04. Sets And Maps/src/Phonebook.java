import java.util.Scanner;
import java.util.TreeMap;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeMap<String,String> dict = new TreeMap<>();

        String input = "";
        while(!(input = scanner.nextLine()).equals("search")) {
            String[] nameAndNums = input.split("-");
            dict.putIfAbsent(nameAndNums[0],nameAndNums[1]);
        }
        String in = "";
        while(!(in = scanner.nextLine()).equals("stop")) {
            if(dict.containsKey(in)) {
                System.out.print(in+" -> "+dict.get(in));
            }
            else {
                System.out.printf("Contact %s does not exist.",in);
            }
            System.out.println();
        }
    }
}
