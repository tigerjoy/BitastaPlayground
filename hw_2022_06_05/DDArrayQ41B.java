
import java.util.Scanner;
public class DDArrayQ41B
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
                System.out.printf("Enter element %d,%d:",i+1,j+1);
                arr[i][j]=sc.nextInt();
            }
        }
    }
    int smallestOfArray(int arr[][])
    {
        int rows=arr.length;
        int cols=arr[0].length;
        int min=arr[0][0];
        for(int i=0;i<=rows-1;i++)
        {
            for(int j=0;j<=cols-1;j++)
            {
                if(arr[i][j]<min)
                {
                    min=arr[i][j];
                }
            }
        }
        return min;
    }
    public static void main(String args[])
    {
        DDArrayQ41B obj=new DDArrayQ41B();
        System.out.print("Enter number of rows: ");
        int rows=sc.nextInt();
        System.out.print("Enter number of cols: ");
        int cols=sc.nextInt();
        int arr[][]=new int[rows][cols];
        obj.input(arr);
        System.out.println("The minimum number is: "+obj.smallestOfArray(arr));
    }//End of main
}//End of class
        
                
    