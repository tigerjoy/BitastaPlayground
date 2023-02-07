// Scored - 10 points
import java.util.Scanner;
class DisariumMatrix
{
    int mat[][];
    int rows, cols;
    DisariumMatrix(int rows, int cols)
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
    int countDigits(int num)
    {
        int c=0;
        while(num>0)
        {
            int dig=num%10;
            c++;
            num=num/10;
        }
        return c;
    }
    int sumOfDigits(int num)
    {
        int sum=0;
        int n=countDigits(num);
        while(num>0)
        {
            int dig=num%10;
            sum=sum+(int)(Math.pow(dig,n));
            n--;
            num=num/10;
        }
        return sum;
    }
    boolean isDisarium(int num)
    {
        int sum=sumOfDigits(num);
        return sum==num;
    }
    int[] generateNDisarium(int N)
    {
        int arr[]=new int[N];
        int index=0, currNum=1;
        while(N>0)
        {
            if(isDisarium(currNum))
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
        int arr[]=generateNDisarium(rows*cols);
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
        DisariumMatrix obj=new DisariumMatrix(r,c);
        obj.fillArray();
        System.out.println("The matrix is: ");
        obj.display();
    }//End of main()
}//End of class
    
    