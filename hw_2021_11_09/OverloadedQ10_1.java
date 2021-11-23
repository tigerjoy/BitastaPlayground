// Scored - 4 points
public class OverloadedQ10_1
{
    // OBSERVATION #1
    // Wrong formula used.
    // Wrong value returned.
    double volume(double r)
    {
        double v=4.0/3.0*Math.PI*r*r;
        return r;
    }
    double volume(double r, double h)
    {
        double v=1.0/3.0*Math.PI*r*r*h;
        return v;
    }
    double volume(double l, double b, double h)
    {
        double v=l*b*h;
        return v;
    }
}
    