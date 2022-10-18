
public class LinearEquation {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private double daSlope;
    private double yIntercept;
//    double daSlope, double yIntercept
    public LinearEquation(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        /* this.daSlope = daSlope;
        this.yIntercept = yIntercept;
         */
    }

    public static void pointUno(int x1, int y1){

       System.out.println ("(" + x1 + ", " + y1 + ")");
    }


    public String pointTwo(){
        return "(" + x2 + ", " + y2 + ")";
    }

    public String pointDos(String baraket1, int x, String comma, int y, String baraket2){
        x2 = x;
        y2 = y;
        return baraket1 + x2 + comma + y2 + baraket2;
    }

    public double slope(){
        daSlope = ((double)y2 - y1)/(x2 - x1);
        return daSlope;
    }

    public double yInt(){
// missing mathamatical equation.
        return yIntercept;
    }

    public double distanceBetweenPoints(){
        return x1;
    }

    public double randomXValue(double anyX){
return y1;
    }

    public String slopeInterceptForm(){
        return daSlope + " * " + yIntercept;
    }

}
