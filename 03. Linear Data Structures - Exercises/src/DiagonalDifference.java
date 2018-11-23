import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(reader.readLine());

        int[][] matrix = new int[size][size];
        int sumOfFirstDiagonal = 0;
        int sumOfSecondDiagonal = 0;

        for (int row = 0; row < matrix.length; row++) {
            String[] input = reader.readLine().split(" ");
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = Integer.parseInt(input[col]);
                for (int i = 0; i < size; i++) {
                    if(row == col && row == i) {
                        sumOfFirstDiagonal+=matrix[row][col];
                    }
                    if(row == i && col == size - 1 - i) {
                        sumOfSecondDiagonal+=matrix[row][col];
                    }
                }
            }
        }


        System.out.println(Math.abs(sumOfFirstDiagonal-sumOfSecondDiagonal));

    }
}
