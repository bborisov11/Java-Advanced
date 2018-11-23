import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountSubstringOccurrences {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String text = reader.readLine().toLowerCase();
        String keyWord = reader.readLine().toLowerCase();
        int counter = 0;
        int index = text.indexOf(keyWord);

            while(index != -1) {
                counter++;
                //index = text.indexOf(keyWord,index + 1);
                //text = text.substring(index+1);
                }
        System.out.println(counter);

        }
    }
