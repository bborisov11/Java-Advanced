import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;

public class BasicStackOperations {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] nums = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        int numberOfElements = nums[0];
        int numberToPop = nums[1];
        int wantedElement = nums[2];
        int smallestNum = 10000000;

        int[] numsForStack = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < numsForStack.length; i++) {
            stack.push(numsForStack[i]);
        }

        for (int i = 0; i < numberToPop; i++) {
             stack.pop();
        }
        if(stack.isEmpty()) {
            System.out.println("0");
            return;
        }
        if(stack.contains(wantedElement)) {
            System.out.println("true");
            return;
        }

        for (Integer integer : stack) {
            if(smallestNum > integer) {
                smallestNum = integer;
            }
        }
        System.out.println(smallestNum);
    }
}
