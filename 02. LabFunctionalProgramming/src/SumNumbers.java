import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> list = Arrays.stream(reader.readLine().split("[, ]+")).map(Integer::parseInt).collect(Collectors.toList());

        int sum = list.stream().mapToInt(x -> x).sum();

        System.out.println("Sum = "+ sum+"\n"+"");
    }
}
