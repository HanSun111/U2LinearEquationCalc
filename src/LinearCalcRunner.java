import java.util.Scanner;
public class LinearCalcRunner {
    public static void main(String[] args) {
        Scanner quantumCalc = new Scanner(System.in);
        System.out.println("input your first coordinate: ");
        String firstPoint = quantumCalc.nextLine();

        int comma = firstPoint.indexOf(",");
        int closingBracket = firstPoint.indexOf(")");

        String x1 = firstPoint.substring(1,comma);
        String y1 = firstPoint.substring(comma+1, closingBracket);
        int realX1 = Integer.parseInt(x1);
        int realY1 = Integer.parseInt(y1);
        System.out.println("input your second coordinate: ");
        String secondPoint = quantumCalc.nextLine();

        String x2 = secondPoint.substring(1,comma);
        String y2 = secondPoint.substring(comma+1, closingBracket);
        int realX2 = Integer.parseInt(x2);
        int realY2 = Integer.parseInt(y2);

        LinearEquation theData = new LinearEquation(realX1, realY1, realX2, realY2);
        System.out.println(theData.allNeededInfo());

        System.out.println("\nwanna know the coordinates given any real x? " + "enter any real x-value, decimal, negative, go nuts: ");
        double x = quantumCalc.nextDouble();
        double y = theData.laSlope() * x + theData.yInt();
        System.out.print( "the coordinate for that x is: " + "(" + x + ", " + String.format("%.2f", y) + ")");
    }
}


