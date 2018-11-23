import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class MagicExchangeableWords {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split(" ");

        if(input[0].length() >= input[1].length()) {
            System.out.println(exchangeable(input[0],input[1]));
        }
        else {
            System.out.println(exchangeable(input[1],input[0]));
        }
    }

    private static boolean exchangeable(String longerWord, String shorterWord) {
        Map<Character,Character> map = new TreeMap<>();

        for (int i = 0; i < longerWord.length(); i++) {

            if(i < shorterWord.length()) {
                if (!map.containsKey(longerWord.charAt(i))) {
                    map.put(longerWord.charAt(i), shorterWord.charAt(i));
                } else {
                    if (map.get(longerWord.charAt(i)) != shorterWord.charAt(i)) {
                        return false;
                    }
                }
            }
            else {
                if(!map.containsKey(longerWord.charAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }
}
