
public class LinearEquation {
    final private int x1;
    final private int y1;
    final private int x2;
    final private int y2;
    private double daSlope;
    private double yIntercept;
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
        /*if(daSlope < 1 && daSlope > 0){
            String convertFraction = String.valueOf(daSlope);
            int conversion = convertFraction.indexOf(".");
            String noPoint = convertFraction.substring(0, conversion) + convertFraction.substring(conversion+1);;
         */
        return daSlope;
    }

    public double yInt(){
        double inverseValue = daSlope * x1 * -1;
        yIntercept = inverseValue + y1;
        return yIntercept;
    }
    public double distanceBetweenPoints(){
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public String slopeInterceptForm(){
        return "y= " + String.format("%.2f", daSlope) + "X" + "+" + String.format("%.2f", yIntercept);
    }

    public String allNeededInfo(){
        return "\nfirst coordinate: " + pointUno() + "\nsecond coordinate: " +  pointDos() + "\nSlope: " + String.format("%.2f", laSlope()) + "\ny-intercept: " + String.format("%.2f", yInt()) + "\nslope intercept form: " + slopeInterceptForm() + "\ndistance between the points: " + String.format("%.2f", distanceBetweenPoints());
    }
}
