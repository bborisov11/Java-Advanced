import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceTag {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line = "";
        String regex = "<a\\s+(href=.*?)>((.|\\s)*?)<\\/a>";
        Pattern pattern = Pattern.compile(regex);
        StringBuilder sb = new StringBuilder();

        while(!(line = reader.readLine()).equals("END")) {
            sb.append(line).append(System.lineSeparator());
        }

        Matcher matcher = pattern.matcher(sb);

        while(matcher.find()) {
            sb.replace(matcher.start(), matcher.end(),
                    "[URL " + matcher.group(1) + "]" + matcher.group(2) + "[/URL]");
            matcher = pattern.matcher(sb);
        }
        System.out.println(sb);
    }
}
