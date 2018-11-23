import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] sizeAndPattern = scanner.nextLine().split(", ");
        int size = Integer.parseInt(sizeAndPattern[0]);
        int[][] matrix = new int[size][size];

        switch (sizeAndPattern[1]) {
            case "A":
               print(makePatternA(matrix, size));
                break;
            case "B":
                print(makePatternB(matrix,size));
                break;
                default:
                    System.out.println("Invalid input!");
        }
    }

    private static int[][] makePatternB(int[][] matrix, int size) {
        int currentValue = 1;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[col][row] = currentValue;
                if(row%2==0) {
                    currentValue++;
                }
                else {
                    currentValue--;
                }
            }
            if(row%2==0) {
                currentValue += size - 1;
            }
            else {
                currentValue += size + 1;
            }
        }
        return matrix;
    }

    private static void print(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] makePatternA(int[][] matrix, int size) {
        int currentValue = 1;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = currentValue;
                currentValue += size;
            }
            currentValue -= size * (size - 1) - 1 + size;
        }
        return matrix;
    }
}
