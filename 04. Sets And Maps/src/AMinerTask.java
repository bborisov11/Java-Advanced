import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Long> map = new HashMap<>();
        String input = "";
            int counter = 0;
        String name = "";
        while(!(input = scanner.nextLine()).equals("stop")) {

            if(counter%2 == 0) {
                name = input;
            }
            else {
                Long num = Long.parseLong(input);
                if(map.containsKey(name)){
                    Long currentNum = map.get(name)+num;
                    map.put(name,currentNum);
                }
                else {
                    map.putIfAbsent(name, num);
                }
            }
            counter++;
        }
        for (Map.Entry<String, Long> stringIntegerEntry : map.entrySet()) {
            System.out.println(stringIntegerEntry.getKey()+" -> "+stringIntegerEntry.getValue());
        }
    }
}
