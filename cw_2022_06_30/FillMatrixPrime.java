import java.util.Scanner;
class FillMatrixPrime
{
  void display(int arr[][])
  {
    int rows=arr.length;
    int cols=arr[0].length;
    for(int i=0;i<=rows-1;i++)
    {
      for(int j=0;j<=cols-1;j++)
      {
        System.out.print(arr[i][j]+"\t");
      }
      System.out.println();
    }
  }
  boolean isPrime(int num)
  {
    int count=0;
    for(int i=1;i<=num;i++)
    {
      if(num%i==0)
      {
        count++;
      }    
    }
    return count==2;
  }
  int[] generateNPrimes(int N)
  {
    int arr[]=new int[N];
    int index=0, currNum=1;
    while(N>0)
    {
      if(isPrime(currNum)) 
      {
        arr[index]=currNum;
        index++;
        N--;
      }
      currNum++;
    }
    return arr;
  }
  // Prefix Increment -> ++x
  // Change then Use
  // Postfix Increment -> x++
  // Use then Change
  void fillArray(int mat[][])
  {
    int rows=mat.length;
    int cols=mat[0].length;
    int arr[]=generateNPrimes(rows*cols);
    int index=0;
    for(int i=0;i<=rows-1;i++)
    {
      for(int j=0;j<=cols-1;j++)
      {
        mat[i][j]=arr[index];
        index++;
        // mat[i][j]=arr[index++];
      }
    }
  }
  public static void main(String args[])
  {
    FillMatrixPrime obj=new FillMatrixPrime();
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter number of rows: ");
    int rows=sc.nextInt();
    System.out.print("Enter number of columns: ");
    int cols=sc.nextInt();
    int mat[][]=new int[rows][cols];
    obj.fillArray(mat);
    System.out.println("The matrix elements are: ");
    obj.display(mat);
  }//End of main
}//End of class