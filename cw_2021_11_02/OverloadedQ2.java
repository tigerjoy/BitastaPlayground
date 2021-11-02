class OverloadedQ2
{
  double SumSeries(int n, double x)
  {
    double sum=0.0;
    for(int i=1;i<=n;i++)
    {
      if(i%2==0)
      {
        sum=sum-(x/i);
      }
      else{
        sum=sum+(x/i);
      }
    }
    return sum;
  }
  
}