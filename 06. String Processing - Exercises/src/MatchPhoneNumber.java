import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class MatchPhoneNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = "";
        String regex = "^\\+359([- ])2[- ]\\d{3}\\1\\d{4}$";

        while(!(name = reader.readLine()).equals("end")) {
            if(Pattern.matches(regex,name)) {
                System.out.println(name);
            }
        }
    }
}
