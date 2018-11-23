import java.util.Scanner;

public class MatrixOfPalindromes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] sizes = scanner.nextLine().split(" ");
        int row = Integer.parseInt(sizes[0]);
        int col = Integer.parseInt(sizes[1]);
        String[][] matrix = new String[row][col];
        print(createMatrix(matrix));
    }

    private static String[][] createMatrix(String[][] matrix) {
        Character letterForRow = 'a';
        Character letterForCol = 'a';

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                String result = String.valueOf(letterForRow) + letterForCol + letterForRow;
                matrix[row][col] = result;
                letterForCol++;
            }
            letterForRow++;
            letterForCol = letterForRow;
        }
        return matrix;
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
