// Scored - 10 points
import java.util.Scanner;
class KrishnaMurthyMatrix
{
    int mat[][];
    int rows, cols;
    KrishnaMurthyMatrix(int rows, int cols)
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
    int factorial(int num)
    {
        int prod=1;
        for(int i=1;i<=num;i++)
        {
            prod=prod*i;
        }
        return prod;
    }
    boolean isKrishnaMurthy(int num)
    {
        int sum=0;
        while(num>0)
        {
            int dig=num%10;
            int fact=factorial(dig);
            sum+=fact;
            num/=10;
        }
        return sum==num;
    }
    int[] generateNKrishnaMurthy(int N)
    {
        int arr[]=new int[N];
        int index=0, currNum=1;
        while(N>0)
        {
            if(isKrishnaMurthy(currNum))
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
        int arr[]=generateNKrishnaMurthy(rows*cols);
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
        KrishnaMurthyMatrix obj=new KrishnaMurthyMatrix(r,c);
        obj.fillArray();
        System.out.println("The matrix is: ");
        obj.display();
    }//End of main()
}//End of class