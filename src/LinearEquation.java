public class LinearEquation {
    int x;
    int y;
    int x2;
    int y2;

    public String slope(int x, int y, int x2, int y2){
        return (double)(y2 - y) / (x2 - x) + "x";
    }

    public double getSlope(){
        return (double)((y2 - y) / (x2 - x));
    }

    public int yIntercept(int x, int y){
        return  (int)(-x*getSlope()+y) ;
    }

    public int getYIntercept(){
        return (int) (-x*getSlope()+y);
    }

    public double distance(int x, int y, int x2, int y2){
        return Math.sqrt((Math.pow(x2-x, 2)+Math.pow(y2-y, 2)));
    }

    public LinearEquation(double slope, int yIntercept){
        slope = getSlope();
        yIntercept = getYIntercept();
        System.out.print(slope + "x" + yIntercept);
    }

    public String toString(){
        return "First pair: " + "(" + x + (",") + y + ")\n" + "Second pair: " + "(" + x2 + (",") + y2 + ")";
    }
}
