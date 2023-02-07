import java.util.Scanner;
class ArrayIntersection
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
  int linearSearch(int arr[], int key)
  {
    int pos=-1;
    for(int i=0;i<=arr.length-1;i++)
    {
      if(key==arr[i])
      {
        pos=i;
        break;
      }
    }
    return pos;
  }
  int[] findIntersection(int arr1[], int arr2[])
  {
    int len1=arr1.length;
    int len2=arr2.length;
    int small[]; int large[]; int temp[];
    // int[] small,large,temp;
    // int small[], large[], temp[];
    if(len1>len2)
    {
      small=arr2;
      large=arr1;
      temp=new int[len2];
    }
    else
    {
      small=arr1;
      large=arr2;
      temp=new int[len1];
    }
    int index=0;
    // Fillling up the temp arry with common 
    // elements from arr1 and arr2
    for(int i=0;i<=small.length-1;i++)
    {
      if(linearSearch(large,small[i])>=0)
      {
        temp[index]=small[i];
        index++;
      }
    }
    // Cleaning the temp array to remove
    // zero elements
    int intersection[]=new int[index];
    for(int i=0;i<=index-1;i++)
    {
      intersection[i]=temp[i];
    }
    return intersection;
  }
  public static void main(String args[])
  {
    ArrayIntersection obj=new ArrayIntersection();
    System.out.println("Enter the size of the first array:");
    int size1=sc.nextInt();
    int arr1[]=new int[size1];
    System.out.println("Enter the elements of the first array:");
    obj.input(arr1);
    System.out.println("Enter the size of the second array:");
    int size2=sc.nextInt();
    int arr2[]=new int[size2];
    System.out.println("Enter the elements of the second array:");
    obj.input(arr2);
    int intersection[]=obj.findIntersection(arr1,arr2);
    System.out.println("Elements of the first array are:");
    obj.display(arr1);
    System.out.println("Elements of the second array are:");
    obj.display(arr2);
    System.out.println("Elements of the intersection array are:");
    obj.display(intersection);
  }//End of main()
}//End of class