import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class BalancedParentheses {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();
        ArrayDeque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            stack.push(ch);
        }

        for (int i = 0; i < stack.size(); i++) {
            char currentFirst = stack.pollFirst();
            char currentLast = stack.pollLast();

            if((int)currentFirst != (int)currentLast + 2) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
