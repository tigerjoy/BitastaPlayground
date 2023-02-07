import java.util.Scanner;
class ArrayUnionWithDuplicates
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
  int[] removeDuplicates(int arr[])
  {
    int temp[]=new int[arr.length];
    int inIndex=0;
    boolean isZeroInserted=false;
    // Inserting non-duplicate elements
    for(int i=0;i<=arr.length-1;i++)
    {
      // If the element is zero, and it has not been
      // previously inserted into temp
      if(arr[i]==0 && 
         isZeroInserted==false)
      {
        temp[inIndex]=arr[i];
        inIndex++;
        isZeroInserted=true;
      }
      // If the element is non-zero and it is not
      // present in temp (not previously inserted 
      // into temp)
      else if(arr[i]!=0 && 
             (linearSearch(temp,arr[i])==-1))
      {
        temp[inIndex]=arr[i];
        inIndex++;
      }
    }
    // Removing redundant elements
    int finalArray[]=new int[inIndex];
    for(int i=0;i<=finalArray.length-1;i++)
    {
      finalArray[i]=temp[i];
    }
    return finalArray;
  } 
  int[] findUnion(int arr1[], int arr2[])
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
    }
    else
    {
      small=arr1;
      large=arr2;
    }
    temp= new int[len1+len2];
    int index=0;
    // Copy all elements from large to temp
    for(int i=0;i<=large.length-1;i++)
    {
      temp[index]=large[i];
      index++;
    }
    // Insert elements from small to temp
    for(int i=0;i<=small.length-1;i++)
    {
      if(linearSearch(large,small[i])==-1)
      {
        temp[index]=small[i];
        index++;
      }
    }
    // Cleaning the temp array to remove
    // zero elements
    int union[]=new int[index];
    for(int i=0;i<=index-1;i++)
    {
      union[i]=temp[i];
    }
    return union;
  }
  public static void main(String args[])
  {
    ArrayUnionWithDuplicates obj=new ArrayUnionWithDuplicates();
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
    int arr1NoDuplicates[]=obj.removeDuplicates(arr1);
    int arr2NoDuplicates[]=obj.removeDuplicates(arr2);
    int union[]=obj.findUnion(arr1NoDuplicates,arr2NoDuplicates);
    System.out.println("Elements of the first array are:");
    obj.display(arr1NoDuplicates);
    System.out.println("Elements of the second array are:");
    obj.display(arr2NoDuplicates);
    System.out.println("Elements of the union array are:");
    obj.display(union);
  }//End of main()
}//End of class