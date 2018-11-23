import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line = "";

       // String regex = "(^| )[a-z0-9]+[-_.]{0,1}[a-z0-9]+@[a-z]+([-.]*[a-z]+)+\\.[a-z]+([., ]|$)";
        String regex = "(^| )(?<email>[a-zA-Z0-9][\\\\w.-]*@[\\\\w][\\\\w-]*(\\\\.[\\\\w][\\\\w-]*)+)([., ]|$)";
        Pattern pattern = Pattern.compile(regex);

        while(!(line = reader.readLine()).equals("end")) {
            Matcher matcher = pattern.matcher(line);

            while(matcher.find()) {
                //System.out.println(matcher.group().substring(0,matcher.group().length() - 1).trim());
                System.out.println(matcher.group("email"));
            }
        }

    }
}
