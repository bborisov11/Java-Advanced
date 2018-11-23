import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MatrixShuffling {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] sizes = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rowSize = sizes[0];
        int colSize = sizes[1];

        String[][] matrix = new String[rowSize][colSize];

        for (int row = 0; row < rowSize; row++) {
            String[] rowNums = reader.readLine().split(" ");
            for (int col = 0; col < colSize; col++) {
                matrix[row][col] = rowNums[col];
            }
        }
        String commands = "";
        while(!(commands = reader.readLine()).equals("END")) {
            String[] commandArgs = commands.split(" ");

            if (!commandArgs[0].equals("swap") || commandArgs.length != 5) {
                System.out.println("Invalid input!");
                continue;
            }
            try {
                String temp = matrix[Integer.parseInt(commandArgs[1])][Integer.parseInt(commandArgs[2])];
                matrix[Integer.parseInt(commandArgs[1])][Integer.parseInt(commandArgs[2])] = matrix[Integer.parseInt(commandArgs[3])][Integer.parseInt(commandArgs[4])];
                matrix[Integer.parseInt(commandArgs[3])][Integer.parseInt(commandArgs[4])] = temp;
            } catch (Exception ex) {
                System.out.println("Invalid input!");
                continue;
            }
            print(matrix);
        }
    }
    private static void print(String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
