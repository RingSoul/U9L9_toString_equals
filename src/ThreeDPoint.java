public class ThreeDPoint extends Point {
    private int z;

    public ThreeDPoint(String label, int x, int y, int z)
    {
        super(label, x, y);
        this.z = z;
    }

    // accessor method
    public int getZ()
    {
        return z;
    }

    public boolean equals(Object obj)
    {
        if (obj == null)
        {
            return false;
        }
        else if (obj instanceof ThreeDPoint == false)
        {
            return false;
        }

        ThreeDPoint p = (ThreeDPoint) obj;
        if (p.getX() == this.getX() && p.getY() == this.getY() && p.getZ() == this.getZ())
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
        return super.toString() + ", z = " + z;
    }
}
