import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;

public class BasicQueueOperation {
    public static void main(String[] args) throws IOException {

                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

                int[] nums = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
                ArrayDeque<Integer> quque = new ArrayDeque<>();

                int numberOfElements = nums[0];
                int numberToPop = nums[1];
                int wantedElement = nums[2];
                int smallestNum = 10000000;

                int[] numsForStack = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
                for (int i = numsForStack.length - 1; i >= 0; i--) {
                    quque.push(numsForStack[i]);
                }

                for (int i = 0; i < numberToPop; i++) {
                    quque.pop();
                }
                if(quque.isEmpty()) {
                    System.out.println("0");
                    return;
                }
                if(quque.contains(wantedElement)) {
                    System.out.println("true");
                    return;
                }

                for (Integer integer : quque) {
                    if(smallestNum > integer) {
                        smallestNum = integer;
                    }
                }
                System.out.println(smallestNum);
            }
        }

