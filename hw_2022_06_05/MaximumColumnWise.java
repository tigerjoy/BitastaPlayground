
import java.util.Scanner;
public class MaximumColumnWise
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
    void largestColWise(int arr[][])
    {
        int rows=arr.length;
        int cols=arr[0].length;
        for(int j=0;j<=cols-1;j++)
        {
            int max=arr[0][j];
            for(int i=0;i<=rows-1;i++)
            {
                if(arr[i][j]>max)
                {
                    max=arr[i][j];
                }
            }
            System.out.println("The maximum number in column "+(j+1)+": "+max);
        } 
    }
    public static void main(String args[])
    {
        MaximumColumnWise obj=new MaximumColumnWise();
        System.out.print("Enter number of rows:");
        int rows=sc.nextInt();
        System.out.print("Enter number of columns:");
        int cols=sc.nextInt();
        int arr[][]=new int[rows][cols];
        obj.input(arr);
        obj.largestColWise(arr);
    }//End of main()
}//End of class
            
    