import java.util.Scanner;
public class LargestOfArray15
{
  static Scanner sc=new Scanner(System.in);
  void input(int arr[])
  {
    for(int i=0;i<=arr.length-1;i++)
    {
      System.out.print("Enter element "+(i+1)+": ");
      arr[i]=sc.nextInt();
    }
  }
  int largestOfArray(int arr[])
  {
   int largest=arr[0];
   for(int i=1;i<=arr.length-1;i++)
   {
     if(arr[i]>largest)
     largest=arr[i];
   }
   return largest;
  }
  public static void main(String args[])
  {
    LargestOfArray15 obj=new LargestOfArray15();
    System.out.println("Enter the size of the array: ");
    int size=sc.nextInt();
    int arr[]=new int[size];
    obj.input(arr);
    int largest=obj.largestOfArray(arr);
    System.out.println("Largest element of the array is: "+largest);
  }//End of main()
}//End of class