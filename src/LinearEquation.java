
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

    }

    public String pointUno(){
        return "(" + x1 + ", " + y1 + ")";
    }

    public String pointDos(){
        return "(" + x2 + ", " + y2 + ")";
    }



    public double laSlope(){
        daSlope = ((double)y2 - y1)/(x2 - x1);
        return daSlope;
    }

    public double yInt(){
        double inverseValue = daSlope * x1 * -1;
        yIntercept = inverseValue + y1;
        return yIntercept;
    }
    public double distanceBetweenPoints(){
        double daDistance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return daDistance;
    }

    public double randomXValue(double anyX){
return y1;
    }

    public String slopeInterceptForm(){
        return "y= " + String.format("%.2f", daSlope) + "X" + "+" + String.format("%.2f", yIntercept);
    }

    public String allNeededInfo(){
        return "\nfirst coordinate: " + pointUno() + "\nsecond coordinate: " +  pointDos() + "\nSlope: " + String.format("%.2f", laSlope()) + "\ny-intercept: ";
    }
}
