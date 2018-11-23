import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] sides = scanner.nextLine().split(" ");

        Double area = Double.parseDouble(sides[0]) * Double.parseDouble(sides[1]);

        System.out.printf("%.2f",area);
    }
}
