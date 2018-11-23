import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Palindromes {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split("[.,!? ]+");
        Set<String> palindromes = new TreeSet<>();

        for (String word : input) {
            if(isPalindrome(word)) {
                palindromes.add(word);
            }
        }
        System.out.println(palindromes);
    }

    private static boolean isPalindrome(String word) {
        int index = word.length() - 1;
        for (int i = 0; i < word.length() / 2; i++) {
            if(word.charAt(i) != word.charAt(index)) {
                return false;
            }
            index--;
        }
        return true;
    }
}
