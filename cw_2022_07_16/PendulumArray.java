import java.util.Scanner;
class PendulumArray
{
  static Scanner sc=new Scanner(System.in);
  int arr[];
  int size;
  int output[];
  PendulumArray(int size)
  {
    this.size=size;
    arr=new int[size];
    output=new int[size];
    //arr=new int[this.size=size];
    // 1. this.size = size happens first
    // 2. new int[this.size], value of this.size
    //    is substituted next
  }
  void input()
  {
    for(int i=0;i<=size-1;i++)
    {
      System.out.print("Enter element: "+(i+1)+": ");
      arr[i]=sc.nextInt();
    }
  }
  void display()
  {
    System.out.println("Original array: ");
    for(int i=0;i<=size-1;i++)
    {
      System.out.print(arr[i]+", ");
    }
    System.out.println();
    System.out.println("Pendulum array: ");
    for(int i=0;i<=size-1;i++)
    {
      System.out.print(output[i]+", ");
    }
    System.out.println();
  }
  // Array Rotation
  // [1 2 3 4] 1 time left shift by an element
  // [2 1 3 4]
  // [2 3 1 4]
  // [2 3 4 1]
  // [2 3 4 1] left shift again
  // [3 4 1 2]
  void bubbleSort()
  {
    for(int i=0;i<=size-2;i++)
    {
      for(int j=0;j<=size-i-2;j++)
      {
        if(arr[j]>arr[j+1])
        {
          int temp=arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=temp;
        }
      }
    }
  }
  void createPendulum()
  {
    int mid=(size-1)/2;
    int left=mid-1;
    int right=mid+1;
    output[mid]=arr[0];
    for(int i=1;i<=size-1;i++)
    {
      // insert left, if i is odd 
      // and left is valid
      if(i%2==1 && left>=0)
      {
        output[left]=arr[i];
        left--;
      }
      else
      {
        output[right]=arr[i];
        right++;
      }
    }
  }
  public static void main(String args[])
  {
    System.out.print("Enter size of the array: ");
    int s=sc.nextInt();
    PendulumArray obj=new PendulumArray(s);
    obj.input();
    obj.bubbleSort();
    obj.createPendulum();
    obj.display();
  }//End of main()
}//End of class