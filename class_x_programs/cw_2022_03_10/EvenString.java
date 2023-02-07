import java.util.Scanner;
class EvenString
{
  static Scanner sc=new Scanner(System.in);
  void input(String arr[])
  {
    for(int i=0;i<=arr.length-1;i++)
    {
      System.out.print("Enter element "+(i+1)+": ");
      arr[i]=sc.nextLine();
    }
  }
  void display(String arr[])
  {
    for(int i=0;i<=arr.length-1;i++)
    {
      if(arr[i].length()%2==0)
      {
        System.out.print(arr[i]+", ");
      }
    }
    System.out.println();
  }
  public static void main(String args[])
  {
    EvenString obj=new EvenString();
    String arr[]=new String[10];
    obj.input(arr);
    System.out.println("The strings with even number of characters are: ");
    obj.display(arr);
  }//End of main()
}//End of class