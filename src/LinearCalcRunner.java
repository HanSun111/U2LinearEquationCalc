import java.util.Scanner;
public class LinearCalcRunner {
    public static void main(String[] args) {
        Scanner quantumCalc = new Scanner(System.in);
        System.out.println("input your first coordinate: ");
        String firstPoint = quantumCalc.nextLine();

        int comma = firstPoint.indexOf(",");

        String x1 = firstPoint.substring(1,comma);

    }
}
