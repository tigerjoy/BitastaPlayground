// Scored - 10 points
import java.util.Scanner;
public class DuckMatrix
{
    int mat[][];
    int rows, cols;
    DuckMatrix(int rows, int cols)
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
    boolean checkFirstDig(int num)
    {
        String strNum=Integer.toString(num);
        if(strNum.charAt(0)=='0')
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    boolean isDuck(int num)
    {
        int count=0;
        if(num!=0 && checkFirstDig(num)==false)
        {
           while(num>0)
           {
               int dig=num%10;
               if(dig==0)
               {
                   count++;
               }
               num/=10;
           }
        }
        return count>0;
    }
    int[] generateNDuck(int N)
    {
        int arr[]=new int[N];
        int index=0, currNum=1;
        while(N>0)
        {
            if(isDuck(currNum))
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
        int arr[]=generateNDuck(rows*cols);
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
        DuckMatrix obj=new DuckMatrix(r,c);
        obj.fillArray();
        System.out.println("The matrix is: ");
        obj.display();
    }//End of main()
}//End of class
                