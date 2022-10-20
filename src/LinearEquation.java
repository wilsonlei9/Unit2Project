public class LinearEquation {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private double slope;
    private int yIntercept;
    private double distance;

    public LinearEquation(int x1, int y1, int x2, int y2)
    {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double calculateSlope()
    {
        slope = (y2 - y1) / (x2 - x1);
        return slope;
    }

    public int yIntercept()
    {
        yIntercept = (int) ((-x1) * calculateSlope() + y1);
        return yIntercept;
    }

    public double calculateDistance()
    {
        distance = Math.round(Math.sqrt((Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)))*100/100);
        return distance;
    }

    public String toString()
    {
        String str = "First pair: " + "(" + x1 + "," + y1 + ")\n";
        str += "Second pair : " + "(" + x2 + "," + y2 + ")\n";
        str += "Slope of line: " + slope + "\n";
        str += "Y intercept: " + yIntercept + "\n";
        str += "Slope intercept form: " + slope + "x" + " + " + yIntercept + "\n";
        str += "Distance between two points: " + distance + "\n";
        return str;
    }
}
