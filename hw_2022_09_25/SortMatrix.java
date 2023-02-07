// Scored - 7.5 points
import java.util.Scanner;
class SortMatrix
{
    static Scanner sc=new Scanner(System.in);
    int M,N;
    int mat[][];
    SortMatrix(int M, int N)
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
                mat[i][j]=sc.nextInt();
            }
            System.out.println();
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
    void sortMatrix()
    {
        for(int i=0;i<=M-1;i++)
        {
            bubbleSort(mat[i]);
        }
    }
    public static void main(String args[])
    {
        System.out.print("M = ");
        int rows=sc.nextInt();
        System.out.print("N = ");
        int cols=sc.nextInt();
        if(rows>2 && rows<10 && cols>2 && cols<10)
        {
            SortMatrix obj=new SortMatrix(rows,cols);
            System.out.println("ENTER ELEMENTS OF MATRIX");
            obj.input();
            System.out.println("ORIGINAL MATRIX");
            obj.display();
            obj.sortMatrix();
            System.out.println("MATRIX AFTER SORTING ROWS");
            obj.display();
        }
        else
        {
            System.out.println("MATRIX SIZE OUT OF RANGE");
        }
    }//End of main()
}//End of class
                
        