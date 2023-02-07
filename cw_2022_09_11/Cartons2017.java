import java.util.Scanner;
class Cartons2017
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter total number of boxes: ");
    int N=sc.nextInt();
    int temp=N;
    if(N > 1000)
    {
      System.out.println("INVALID INPUT");
    }
    else
    {
      int cartonSizes[]={48,24,12,6};
      int totalCartons=0;
      int remainingBoxes=0;
      for(int i=0;i<=cartonSizes.length-1;i++)
      {
        int cartonSize=cartonSizes[i];
        int cartonsUsed=N/cartonSize;
        if(cartonsUsed>0)
        {
          System.out.println(cartonSize+ " x "+cartonsUsed+" = "+(cartonSize*cartonsUsed));
          totalCartons+=cartonsUsed;
        }
        remainingBoxes=N%cartonSize;
        N=remainingBoxes;
      }
      if(N!=0)
      {
        System.out.println("Remaining boxes  "+N+" x 1 = "+N);
        totalCartons+=1;
      }
      else
      {
        System.out.println("Remaining boxes = 0");
      }
      System.out.println("Total number of boxes = "+temp);
      System.out.println("Total number of cartons = "+totalCartons);
    }
  }//End of main()
}//End of class