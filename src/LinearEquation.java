
public class LinearEquation {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private double daSlope;
    private double yIntercept;
    public LinearEquation(int x1, int y1, int x2, int y2, double daSlope, double yIntercept){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.daSlope = daSlope;
        this.yIntercept = yIntercept;
    }

    public String pointUno(int x1, int y1){
        return x1 + ", " + y1;
    }

    public String pointTwo(int x2, int y2){
        return x2 + ", " + y2;
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

    }

    public double randomXValue(double anyX){

    }

    public String slopeInterceptForm(){
        return daSlope + "X" + yIntercept;
    }

}