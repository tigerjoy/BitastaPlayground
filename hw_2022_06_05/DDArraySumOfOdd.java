
import java.util.Scanner;
public class DDArraySumOfOdd
{
    static Scanner sc=new Scanner(System.in);
    void input(int arr[][])
    {
        int rows=arr.length;
        int cols=arr[0].length;
        for(int i=0;i<=rows-1;i++)
        {
            for(int j=0;j<=cols-1;j++)
            {
                System.out.printf("Enter element %d,%d: ",i+1,j+1);
                arr[i][j]=sc.nextInt();
            }
        }
    }
    int sumOfOdd(int arr[][])
    {
        int rows=arr.length;
        int cols=arr[0].length;
        int sum=0;
        for(int i=0;i<=rows-1;i++)
        {
            for(int j=0;j<=cols-1;j++)
            {
                if(arr[i][j]%2==1)
                {
                    sum+=arr[i][j];
                }
            }
        }
        return sum;
    }
    public static void main(String args[])
    {
        DDArraySumOfOdd obj=new DDArraySumOfOdd();
        System.out.print("Enter number of rows:");
        int rows=sc.nextInt();
        System.out.print("Enter number of columns:");
        int cols=sc.nextInt();
        int arr[][]=new int[rows][cols];
        obj.input(arr);
        System.out.println("The sum of the odd numbers in the 2D array is:"+obj.sumOfOdd(arr));
    }//End of main()
}//End of class
