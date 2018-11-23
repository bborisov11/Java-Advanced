import java.util.Arrays;
import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        double[] firstPoint = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        double[] secondPoint = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        double[] thirdPoint = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();

        long area = (long)(firstPoint[0]*(secondPoint[1] - thirdPoint[1]) + secondPoint[0]*(thirdPoint[1]-firstPoint[1])+thirdPoint[0]*(firstPoint[1]-secondPoint[1]))/2;

        if(area == 0) {
            System.out.println(0);
        }
        else {
            if(area < 0) {
                area*=-1;
            }
            System.out.printf("%d",area);
        }

    }
}
