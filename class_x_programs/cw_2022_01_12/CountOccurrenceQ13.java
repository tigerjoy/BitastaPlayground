import java.util.Scanner;
class CountOccurrenceQ13
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
  int countItems(int arr[], int key)
  {
    int count=0;
    for(int i=0;i<=arr.length-1;i++)
    {
      if (key==arr[i])
      {
        count++;
      }
    }
    return count;
  }
  public static void main(String args[])
  {
    CountOccurrenceQ13 obj=new CountOccurrenceQ13();
    System.out.println("Enter size of the array: ");
    int size=sc.nextInt();
    int arr[]=new int[size];
    obj.input(arr);
    System.out.println("Enter the element to be counted:");
    int key=sc.nextInt();
    int count=obj.countItems(arr,key);
    System.out.println("The number of times "+key+" occurs: "+count);
  }//End of main()
}//End of class