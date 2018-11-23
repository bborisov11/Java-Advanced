import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LettersChangeNumbers {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split("\\s+");

        String regex = "([A-Za-z])([0-9]+)([A-Za-z])";
        Pattern pattern = Pattern.compile(regex);
        double sum = 0;

        for (int i = 0; i < input.length; i++) {
            Matcher matcher = pattern.matcher(input[i]);
            while (matcher.find()) {
                if (matcher.group(1).equals(matcher.group(1).toUpperCase())) {
                  sum += Double.parseDouble(matcher.group(2))/ upperCasePositionInAlphabet(matcher.group(1));
                }
                else {
                    double num = Double.parseDouble(matcher.group(2));
                    int position = lowerCasePositionInAlphabet(matcher.group(1));
                    sum += num*position;
                }
                if(matcher.group(3).equals(matcher.group(3).toUpperCase())) {
                    int position = upperCasePositionInAlphabet(matcher.group(3));
                    sum -= position;
                }
                else {
                    int position = lowerCasePositionInAlphabet(matcher.group(3));
                    sum += position;
                }
            }
        }
        System.out.printf("%.2f",sum);
    }

    private static int lowerCasePositionInAlphabet(String str) {
        int temp = (int)str.charAt(0);
        int temp_integer = 96; //for lower case
        return temp-temp_integer;
    }

    private static int upperCasePositionInAlphabet(String str) {
            int temp = (int)str.charAt(0);
            int temp_integer = 64; //for upper case
            return temp-temp_integer;
    }
}
