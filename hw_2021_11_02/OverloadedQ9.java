// Scored - 4 points
public class OverloadedQ9
{
    void Volume(double s)
    {
        double v=s*s*s;
        System.out.println("VOLUME OF CUBE:"+v);
    }
    void Volume(double l, double b, double h)
    {
        double v=l*b*h;
        System.out.println("VOLUME OF CUBOID:"+v);
    }
    void Volume()
    {
        double r;
        // OBSERVATION #1
        // Object of the scanner class needs to be 
        // created
        System.out.println("ENTER RADIUS:");
        r=sc.nextDouble();
        double v=4.0/3.0*Math.PI*r*r*r;
        System.out.println("VOLUME OF CIRCLE:"+v);
    }
}
    