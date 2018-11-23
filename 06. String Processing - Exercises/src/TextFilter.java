import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TextFilter {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] bannedWords = reader.readLine().split("[, ]");
        String text = reader.readLine();
        int index = 0;
        for (int i = 0; i < text.length(); i++) {
            StringBuilder builder = new StringBuilder();
            for (int j = 0; j < bannedWords[index].length(); j++) {
                builder.append("*");
            }
            text = text.replace(bannedWords[index],builder);

            index++;
            if(index == bannedWords.length) {
                break;
            }
        }
        System.out.println(text);
    }
}
