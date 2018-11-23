import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeSet<String> set = new TreeSet<>();
        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            String[] chem = scanner.nextLine().split(" ");
            set.addAll(Arrays.asList(chem));
        }
        for (String s : set) {
            System.out.print(s+" ");
        }
    }
}
