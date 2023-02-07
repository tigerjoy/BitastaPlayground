import java.util.Scanner;
class AllFrequencyQ28
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
  int countItems(int arr[], boolean isUsed[], int item)
  {
    int count=0;
    for(int i=0;i<=arr.length-1;i++)
    {
      if(item==arr[i])
      {
        count++;
        isUsed[i]=true;
      }
    }
    return count;
  }
  void displayFrequency(int arr[])
  {
    boolean isUsed[]=new boolean[arr.length];
    for(int i=0;i<=arr.length-1;i++)
    {
      // checking if arr[i] has not been checked
      if(isUsed[i]==false)
      {
        int count=countItems(arr,isUsed,arr[i]);
        System.out.println(arr[i]+" was present "+count+" time(s)");
      }
    }
  }
  public static void main(String args[])
  {
    AllFrequencyQ28 obj=new AllFrequencyQ28();
    System.out.println("Enter size of the array: ");
    int size=sc.nextInt();
    int arr[]=new int[size];
    obj.input(arr);
    System.out.println("The frequency of all elements are: ");
    obj.displayFrequency(arr);
  }//End of main()
}//End of class