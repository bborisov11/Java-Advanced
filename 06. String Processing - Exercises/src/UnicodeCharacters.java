import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Formatter;

public class UnicodeCharacters {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String symbols = reader.readLine();

        System.out.println(escapeUnicode(symbols));

    }
    public static String escapeUnicode(String input) {
        StringBuilder b = new StringBuilder(input.length());
        Formatter f = new Formatter(b);
        for (char c : input.toCharArray()) {
                f.format("\\u%04x", (int) c);
        }
        return b.toString();
    }
}
