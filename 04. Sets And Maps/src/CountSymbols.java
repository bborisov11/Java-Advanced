import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeMap<String,Integer> map = new TreeMap<>();
        String[] str = scanner.nextLine().split("");

        if(str[0].equals("")) {
            return;
        }

        for (int i = 0; i < str.length; i++) {
            int counter = 1;
            for (int j = i+1; j < str.length; j++) {
                if(str[i].equals(str[j])) {
                    counter++;
                }
            }
            map.putIfAbsent(str[i],counter);
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey()+ ": "+ entry.getValue()+" time/s");
        }
    }
}
