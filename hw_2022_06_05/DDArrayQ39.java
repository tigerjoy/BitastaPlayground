import java.util.Scanner;
public class DDArrayQ39
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
    void sumColumnWise(int arr[][])
    {
        int rows=arr.length;
        int cols=arr[0].length;
        for(int j=0;j<=cols-1;j++)
        {
            int sum=0;
            for(int i=0;i<=rows-1;i++)
            {
                sum+=arr[i][j];
            }
            System.out.println("Sum of column "+(j+1)+" elements: "+sum);
        }
    }
    public static void main(String args[])
    {
        DDArrayQ39 obj=new DDArrayQ39();
        System.out.print("Enter number of rows: ");
        int rows=sc.nextInt();
        System.out.print("Enter number of cols: ");
        int cols=sc.nextInt();
        int arr[][]=new int[rows][cols];
        obj.input(arr);
        obj.sumColumnWise(arr);
    }//End of main()
}//End of class
        
        
                