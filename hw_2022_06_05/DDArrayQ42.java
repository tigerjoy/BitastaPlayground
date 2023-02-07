import java.util.Scanner;
public class DDArrayQ42
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
    void maxValueRowWise(int arr[][])
    {
        int rows=arr.length;
        int cols=arr[0].length;
        for(int i=0;i<=rows-1;i++)
        {
            int max=arr[i][0];
            for(int j=0;j<=cols-1;j++)
            {
                if(arr[i][j]>max)
                {
                    max=arr[i][j];
                }
            }
            System.out.println("Maximum value of row "+(i+1)+" is: "+max);
        }
    }
    public static void main(String args[])
    {
        DDArrayQ42 obj=new DDArrayQ42();
        System.out.print("Enter number of rows: ");
        int rows=sc.nextInt();
        System.out.print("Enter number of cols: ");
        int cols=sc.nextInt();
        int arr[][]=new int[rows][cols];
        obj.input(arr);
        obj.maxValueRowWise(arr);
    }//End of main()
}//End of class
        
        
                