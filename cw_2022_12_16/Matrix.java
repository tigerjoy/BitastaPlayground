import java.util.Scanner;
class Matrix
{
    int M,N;
    int A[][], boundary[];
    static Scanner sc=new Scanner(System.in);
    Matrix(int M, int N)
    {
      this.M=M;
      this.N=N;
      A=new int[M][N];
      boundary=new int[(2*(M+N))-4];
    }
    void input()
    {
        for(int i=0;i<=M-1;i++)
        {
            for(int j=0;j<=N-1;j++)
            {
                System.out.printf("Enter elements at %d,%d: ",i+1,j+1);
                A[i][j]=sc.nextInt();
            }
        }
    }
    void processBoundaryElements()
    {
        int sum=0;
        int index=0;
        for(int i=0;i<=M-1;i++)
        {
            for(int j=0;j<=N-1;j++)
            {
                if(i==0||i==M-1||j==0||j==N-1)
                {
                    sum+=A[i][j];
                    boundary[index]=A[i][j];
                    index++;
                    // boundary[index++]=A[i][j];
                }
            }
        }
        System.out.println("Sum = "+sum);
        bubbleSort(boundary);
        // Fill the matrix in a clockwise spiral fashion
        index=0;
        // Rightwards Filling
        for(int col=0;col<=N-1;col++)
        {
          A[0][col]=boundary[index];
          index++;
        }
        // Downwards Filling
        for(int row=1;row<=M-1;row++)
        {
          A[row][N-1]=boundary[index];
          index++;
        }
        // Leftwards Filling
        for(int col=N-2;col>=0;col--)
        {
          A[M-1][col]=boundary[index];
          index++;
        }
        // Upwards Filling
        for(int row=M-2;row>=1;row--)
        {
          A[row][0]=boundary[index];
          index++;
        }
        System.out.println("BOUNDARY ELEMENTS AFTER SORTING CLOCKWISE= ");
        displayBoundaryElements();
    }
    void displayBoundaryElements()
    {
        for(int i=0;i<=M-1;i++)
        {
            for(int j=0;j<=N-1;j++)
            {
                if(i==0||i==M-1||j==0||j==N-1)
                {
                    System.out.print(A[i][j]+"\t");
                }
                else
                {
                  System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
    void bubbleSort(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<=n-2;i++)
        {
          for(int j=0;j<=n-i-2;j++)
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
    void display()
    {
      for(int i=0;i<=M-1;i++)
      {
        for(int j=0;j<=N-1;j++)
        {
          System.out.print(A[i][j]+"\t");
        }
        System.out.println();
      }
    }
    public static void main(String args[])
    {
      System.out.print("M = ");
      int rows=sc.nextInt();
      System.out.print("N = ") ;   
      int cols=sc.nextInt();
      if(rows>=2 && rows<=cols && cols<6)
      {
        Matrix obj=new Matrix(rows,cols);
        obj.input();
        System.out.println("ORIGINAL MATRIX A[][] = ");
        obj.display();
        System.out.println("BOUNDARY ELEMENTS OF MATRIX A[][] = ");
        obj.displayBoundaryElements();
        obj.processBoundaryElements();
      }
    }//End of main()
}//End of class
                    