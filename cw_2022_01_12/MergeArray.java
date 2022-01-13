import java.util.Scanner;
class MergeArray
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
  void display(int arr[])
  {
    for(int i=0;i<=arr.length-1;i++)
    {
      System.out.print(arr[i]+", ");
    }
    System.out.println();
  }
  int[] mergeArray(int arr1[], int arr2[])
  {
    int merge[]=new int[arr1.length+arr2.length];
    int destIndex=0;
    for(int i=0;i<=arr1.length-1;i++)
    {
      merge[destIndex]=arr1[i];
      destIndex++;
    }
    for(int i=0;i<=arr2.length-1;i++)
    {
      merge[destIndex]=arr2[i];
      destIndex++;
    }
    return merge;
  }
  public static void main(String args[])
  {
    MergeArray obj=new MergeArray();
    System.out.println("Enter size of the first array");
    int size1=sc.nextInt();
    int arr1[]=new int[size1];
    System.out.println("Enter the elements of the first array");
    obj.input(arr1);
    System.out.println("Enter size of the second array");
    int size2=sc.nextInt();
    int arr2[]=new int[size2];
    System.out.println("Enter the elements of the first array");
    obj.input(arr2);
    int merged[]=obj.mergeArray(arr1,arr2);
    System.out.println("Elements of arr1");
    obj.display(arr1);
    System.out.println("Elements of arr2");
    obj.display(arr2);
    System.out.println("The merged array is");
    obj.display(merged);
  }//End of main()
}//End of class