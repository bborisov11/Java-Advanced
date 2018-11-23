import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] sizes = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rowSize = sizes[0];
        int colSize = sizes[1];

        int[][] inputMatrix = new int[rowSize][colSize];
        int[][] biggestSumMatrix = new int[3][3];

        for (int row = 0; row < rowSize; row++) {
            int[] rowNums = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for (int col = 0; col < colSize; col++) {
                inputMatrix[row][col] = rowNums[col];
            }
        }
        int sum = 0;
        int currentSum = 0;

        for (int row = 0; row < rowSize - 2; row++) {
            for (int col = 0; col < colSize - 2; col++) {
                currentSum = inputMatrix[row][col] + inputMatrix[row][col + 1] + inputMatrix[row][col + 2] +
                        inputMatrix[row + 1][col] + inputMatrix[row + 1][col + 1] + inputMatrix[row + 1][col + 2] +
                        inputMatrix[row + 2][col] + inputMatrix[row + 2][col + 1] + inputMatrix[row + 2][col + 2];

                if (currentSum > sum) {
                    sum = currentSum;
                    biggestSumMatrix  = new int[][]{
                            {inputMatrix[row][col], inputMatrix[row][col + 1], inputMatrix[row][col + 2]},
                            {inputMatrix[row + 1][col], inputMatrix[row + 1][col + 1], inputMatrix[row + 1][col + 2]},
                            {inputMatrix[row + 2][col], inputMatrix[row + 2][col + 1], inputMatrix[row + 2][col + 2]}
                    };
                }
            }
        }

        System.out.println("Sum = " + sum);

        for (int row = 0; row < biggestSumMatrix.length; row++) {
            for (int col = 0; col < biggestSumMatrix[row].length; col++) {
                System.out.print(biggestSumMatrix[row][col]+" ");
            }
            System.out.println();
        }

    }

}

