import java.util.Scanner;
class ArrangeNumberMatrix
{
  static Scanner sc=new Scanner(System.in);
  int mat[][];
  int M,N;
  ArrangeNumberMatrix(int M, int N)
  {
    this.M=M;
    this.N=N;
    mat=new int[M][N];
  }
  void input()
  {
    for(int i=0;i<=M-1;i++)
    {
      for(int j=0;j<=N-1;j++)
      {
        System.out.printf("Enter element at %d,%d: ",i+1,j+1);
        mat[i][j]=sc.nextInt();
      }
    }
  }
  int countDigits(int num)
  {
     int count=Integer.toString(num).length();
     return count;
  }
  void bubbleSort(char arr[])
  {
    int n=arr.length;
    for(int i=0;i<=n-2;i++)
    {
      for(int j=0;j<=n-i-2;j++)
      {
        if(arr[j]>arr[j+1])
        {
          char temp=arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=temp;
        }
      }
    }
  }
  // display o lagbe pore likhe nis
  // continue
  void arrange()
  {
    for(int i=0;i<=M-1;i++)
    {
      for(int j=0;j<=N-1;j++)
      {
        int num = mat[i][j];
        String strNum=Integer.toString(num);
        char arr[]=strNum.toCharArray();
        bubbleSort(arr);
        String sorted=new String(arr);
        int newNum=Integer.parseInt(sorted);
        mat[i][j]=newNum;
      }
    }
  }
  void display()
  {
    for(int i=0;i<=M-1;i++)
    {
      for(int j=0;j<=N-1;j++)
      {
        System.out.print(mat[i][j]+"\t");
      }
      System.out.println();
    }
  }
  boolean check()
  {
    boolean result = true; // IMP
    for(int i = 0; i <= M-1; i++)
    {
      for(int j = 0; j <= N-1; j++)
      {
        result = result && 
                (countDigits(mat[i][j]) >= 3);
      }
    }
    return result;
  }
  public static void main(String args[])
  {
    System.out.print("Enter number of rows: ");
    int rows=sc.nextInt();
    System.out.print("Enter number of columns: ");
    int cols=sc.nextInt();
    ArrangeNumberMatrix obj=new ArrangeNumberMatrix(rows,cols);
    obj.input();
    if(obj.check())
    {
      System.out.println("The original matrix: ");
      obj.display();
      obj.arrange();
      System.out.println("The new matrix: ");
      obj.display();
    }
    else
    {
      System.out.println("INVALID MATRIX");
    }
  }//End of main()
}//End of class