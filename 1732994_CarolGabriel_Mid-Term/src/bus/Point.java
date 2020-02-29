package bus;

public class Point
{
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    private double x;
    private double y;
    public String toString()
    {
        return "(" + this.y + ", " + this.x + ")";
    }
}
