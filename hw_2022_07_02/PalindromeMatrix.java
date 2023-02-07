// Scored - 10 points
import java.util.Scanner;
public class PalindromeMatrix
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
    int reverse(int num)
    {
        int rev=0;
        while(num>0)
        {
            int dig=num%10;
            rev=(rev*10)+dig;
            num/=10;
        }
        return rev;
    }
    boolean isPalindrome(int num)
    {
        int rev=reverse(num);
        return rev==num;
    }
    int[] generateNPalindrome(int N)
    {
        int arr[]=new int[N];
        int index=0,currNum=1;
        while(N>0)
        {
            if(isPalindrome(currNum))
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
        int arr[]=generateNPalindrome(rows*cols);
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
        PalindromeMatrix obj=new PalindromeMatrix();
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
    
    
            
        