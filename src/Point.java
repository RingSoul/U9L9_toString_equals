public class Point {
    private int x;
    private int y;
    private String label;

    public Point(String label, int x, int y)
    {
        this.x = x;
        this.y = y;
        this.label = label;
    }

    // accessor methods
    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }
    public String getLabel()
    {
        return label;
    }

    public boolean equals(Object obj)
    {
        if (obj == null)
        {
            return false;
        }
        else if (obj instanceof Point == false)
        {
            return false;
        }

        Point p = (Point) obj;
        if (this.x == p.x && this.y == p.y)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public String toString()
    {
        return "Point " + label + " is at x = " + x + ", y = " + y;
    }
}
