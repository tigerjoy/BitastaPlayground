// Scored - 10 points
import java.util.Scanner;
class AutomorphicMatrix
{
    int mat[][];
    int rows,cols;
    AutomorphicMatrix(int rows, int cols)
    {
        this.rows=rows;
        this.cols=cols;
        mat=new int[rows][cols];
    }
    void display()
    {
        for(int i=0;i<=rows-1;i++)
        {
            for(int j=0;j<=cols-1;j++)
            {
                System.out.print(mat[i][j]+"\t");
            }
            System.out.println();
        }
    }
    boolean isAutomorphic(int num)
    {
        int square=num*num;
        while(num>0)
        {
            if(square%10!=num%10)
            {
                return false;
            }
            square/=10;
            num/=10;
        }
        return true;
    }
    int[] generateNAutomorphic(int N)
    {
        int arr[]=new int[N];
        int index=0, currNum=1;
        while(N>0)
        {
            if(isAutomorphic(currNum))
            {
                arr[index]=currNum;
                index++;
                N--;
            }
            currNum++;
        }
        return arr;
    }
    void fillArray()
    {
        int arr[]=generateNAutomorphic(rows*cols);
        int index=0;
        for(int i=0;i<=rows-1;i++)
        {
            for(int j=0;j<=cols-1;j++)
            {
                mat[i][j]=arr[index];
                index++;
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int r=sc.nextInt();
        System.out.print("Enter number of columns: ");
        int c=sc.nextInt();
        AutomorphicMatrix obj=new AutomorphicMatrix(r,c);
        obj.fillArray();
        System.out.println("The matrix is: ");
        obj.display();
    }//End of main()
}//End of class
