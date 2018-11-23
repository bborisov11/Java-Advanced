import java.util.*;

public class SetsOfElements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        LinkedHashSet<Integer> firstSet = new LinkedHashSet<>();
        LinkedHashSet<Integer> secondSet = new LinkedHashSet<>();

        String[] nums = scanner.nextLine().split("\\s+");

        int countOfFirst = Integer.parseInt(nums[0]);
        int countOfSecond = Integer.parseInt(nums[1]);

        for (int i = 0; i < countOfFirst; i++) {
            Integer num = scanner.nextInt();
            firstSet.add(num);
        }
        for (int i = 0; i < countOfSecond; i++) {
            Integer num = scanner.nextInt();
            secondSet.add(num);
        }

        for (Integer integer : firstSet) {
            for (Integer integer1 : secondSet) {
                if(integer.equals(integer1)) {
                    System.out.print(integer + " ");
                }
            }
        }

    }
}
