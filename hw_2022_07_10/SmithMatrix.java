// Scored - 10 points
import java.util.Scanner;
class SmithMatrix
{
    int mat[][];
    int rows,cols;
    SmithMatrix(int rows, int cols)
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
    int sumOfDigits(int num)
    {
        int sum=0;
        while(num>0)
        {
            int dig=num%10;
            sum+=dig;
            num/=10;
        }
        return sum;
    }
    int sumOfPrimeFactors(int num)
    {
        int sum=0;
        int fact=2;
        while(num>1)
        {
            if(num%fact==0)
            {
                num/=fact;
                sum+=sumOfDigits(fact);
            }
            else
            {
                fact++;
            }
        }
        return sum;
    }
    boolean isSmith(int num)
    {
        return sumOfDigits(num)==sumOfPrimeFactors(num);
    }
    int[] generateNSmith(int N)
    {
        int arr[]=new int[N];
        int index=0, currNum=1;
        while(N>0)
        {
            if(isSmith(currNum))
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
        int arr[]=generateNSmith(rows*cols);
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
        SmithMatrix obj=new SmithMatrix(r,c);
        obj.fillArray();
        System.out.println("The matrix is: ");
        obj.display();
    }//End of main()
}//End of class
    
            
            