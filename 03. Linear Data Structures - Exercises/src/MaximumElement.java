import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;

public class MaximumElement {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int commands = Integer.parseInt(reader.readLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < commands; i++) {

            int[] arg = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            switch (arg[0]) {
                case 1:
                    pushElement(stack,arg[1]);
                    break;
                case 2:
                    deleteElementAtTheTop(stack);
                    break;
                case 3:
                    printMaxElementInTheStack(stack);
            }

        }
    }

    private static void printMaxElementInTheStack(ArrayDeque<Integer> stack) {
        int maxElement = 0;
        for (Integer integer : stack) {
            if(integer > maxElement) {
                maxElement = integer;
            }
        }
        System.out.println(maxElement);
    }

    private static void deleteElementAtTheTop(ArrayDeque<Integer> stack) {
        stack.pollFirst();
    }

    private static void pushElement(ArrayDeque<Integer> stack, int i) {
        stack.push(i);
    }


}
