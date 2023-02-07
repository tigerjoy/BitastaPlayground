// Scored - 7.5 points
import java.util.Scanner;
class FillMatrix
{
    static Scanner sc=new Scanner(System.in);
    int N;
    FillMatrix(int N)
    {
        this.N=N;
    }
    void input(int arr[])
    {
        for(int i=0;i<=arr.length-1;i++)
        {
            System.out.print("Enter element "+(i+1)+": ");
            arr[i]=sc.nextInt();
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
    void display(int arr[])
    {
        for(int i=0;i<=arr.length-1;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    void displayMat(int mat[][])
    {
        for(int i=0;i<=N-1;i++)
        {
            for(int j=0;j<=N-1;j++)
            {
                System.out.print(mat[i][j]+"\t");
            }
            System.out.println();
        }
    }
    void fillMatrix(int mat[][],int arr[])
    {
        for(int i=0;i<=N-1;i++)
        {
            int col=0;
            for(int j=0;j<=N-i-1;j++)
            {
                mat[i][col]=arr[j];
                col++;
            }
            for(int j=0;j<=i-1;j++)
            {
                mat[i][col]=arr[j];
                col++;
            }
        }
    }
    public static void main(String args[])
    {
       System.out.print("N = ");
       int size=sc.nextInt();
       if(size>2 && size<10)
       {
           FillMatrix obj=new FillMatrix(size);
           int a[]=new int[size];
           int b[][]=new int[size][size];
           obj.input(a);
           obj.bubbleSort(a);
           System.out.println("THE SORTED ARRAY");
           obj.fillMatrix(b,a);
           System.out.println("FILLED MATRIX");
           obj.displayMat(b);
       }
       else
       {
           System.out.println("MATRIX SIZE OUT OF RANGE");
       }
    }//End of main()
}//End of class
            