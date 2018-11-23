import java.util.*;

public class UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashSet<String> names = new LinkedHashSet<>();

        int count = scanner.nextInt();

        for (int i = 0; i <= count; i++) {
            String name = scanner.nextLine();
            names.add(name);
        }
        for (String name : names) {
            System.out.println(name);
        }
    }
}
