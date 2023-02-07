import java.util.*;
class RemoveDuplicatesQ49
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
  int linearSearch(int arr[],int key)
  {
    int pos=-1;
    for(int i=0;i<=arr.length-1;i++)
    {
      if(arr[i]==key)
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
  public static void main(String args[])
  {
    RemoveDuplicatesQ49 obj=new RemoveDuplicatesQ49();
    System.out.println("Enter the size of the array: ");
    int size=sc.nextInt();
    int arr[]=new int[size];
    obj.input(arr);
    int finalArray[]=obj.removeDuplicates(arr);
    System.out.println("The original array is:");
    obj.display(arr);
    System.out.println("The modified array is:");
    obj.display(finalArray);
  }//End of main()
}//End of class