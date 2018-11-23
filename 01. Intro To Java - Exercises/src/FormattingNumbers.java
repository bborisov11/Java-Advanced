import java.text.DecimalFormat;
import java.util.Scanner;

public class FormattingNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] nums = scanner.nextLine().split("\\s+");
        DecimalFormat toSecondNum = new DecimalFormat("#0.00");
        DecimalFormat toThirdNum = new DecimalFormat("###0.000");
        String firstNum = String.format("%-10s", Integer.toHexString(Integer.valueOf(nums[0]))).toUpperCase();
        String firstHexNum = String.format("%10s", Integer.toBinaryString(Integer.valueOf(nums[0]))).replace(' ','0');
        String secondNum = String.format("%10s",toSecondNum.format(Double.valueOf(nums[1])));
        String thirdNum = String.format("%-10s",toThirdNum.format(Double.valueOf(nums[2])));

        System.out.printf("|%s|%s|%s|%s|",firstNum,firstHexNum,secondNum,thirdNum);

    }
}
