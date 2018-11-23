import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortEvenNumbers {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> list = Arrays.stream(reader.readLine().split("[, ]+")).map(Integer::parseInt).collect(Collectors.toList());

         list.stream().filter(x -> x % 2 == 0).sorted(Integer::compareTo).forEach(x -> System.out.print(x + " "));

    }
}
