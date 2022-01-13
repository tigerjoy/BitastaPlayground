import java.util.Scanner;
class ScalarProduct
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
  int[] scalarProduct(int arr[],int scalar)
  {
    int product[]=new int[arr.length];
    for(int i=0;i<=arr.length-1;i++)
    {
      product[i]=scalar*arr[i];
    }
    return product;
  }
  public static void main(String args[])
  {
    ScalarProduct obj=new ScalarProduct();
    System.out.println("Enter size of the array: ");
    int size=sc.nextInt();
    int arr[]=new int[size];
    System.out.println("Enter elements of arr ");
    obj.input(arr);
    System.out.println("Enter a scalar number: ");
    int scalar=sc.nextInt();
    int product[]=obj.scalarProduct(arr,scalar);
    System.out.println("The elements of arr: ");
    obj.display(arr);
    System.out.println("The scalar product is: ");
    obj.display(product);
  }//End of main()
}//End of class