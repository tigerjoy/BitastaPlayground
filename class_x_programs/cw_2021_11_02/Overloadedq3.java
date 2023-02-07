class Overloadedq3
{
  double area(double a, double b, double c)
  {
    double s=(a+b+c)/2;
    double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
    return area;
  }
  double area(int a, int b, int height)
  {
    double area=(1.0/2.0)*height*(a+b);
    return area;
  }
  double area(double diagonal1, double diagonal2)
  {
    double area=(1.0/2.0)*(diagonal1*diagonal2);
    return area;
  }
}