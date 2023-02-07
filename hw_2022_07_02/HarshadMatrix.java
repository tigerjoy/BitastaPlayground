// Scored - 10 points
import java.util.Scanner;
public class HarshadMatrix
{
    void display(int arr[][])
    {
        int rows=arr.length;
        int cols=arr[0].length;
        for(int i=0;i<=rows-1;i++)
        {
            for(int j=0;j<=cols-1;j++)
            {
                System.out.print(arr[i][j]+"\t");
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
           num=num/10;
        }
        return sum;
    }
    boolean isHarshad(int num)
    {
        int sum=sumOfDigits(num);
        if(num%sum==0)
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
    int[] generateNHarshad(int N)
    {
        int arr[]=new int[N];
        int index=0,currNum=1;
        while(N>0)
        {
            if(isHarshad(currNum))
            {
                arr[index]=currNum;
                index++;
                N--;
            }
            currNum++;
        }
        return arr;
    }
    void fillArray(int mat[][])
    {
        int rows=mat.length;
        int cols=mat[0].length;
        int arr[]=generateNHarshad(rows*cols);
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
        HarshadMatrix obj=new HarshadMatrix();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows=sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols=sc.nextInt();
        int arr[][]=new int[rows][cols];
        obj.fillArray(arr);
        System.out.println("The elements of the array are: ");
        obj.display(arr);
    }//End of main()
}//End of class
    
    
            
        