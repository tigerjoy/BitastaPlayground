// Score - 9 points
import java.util.Scanner;
public class CompositeMatrix
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
    boolean isComposite(int num)
    {
      // Is 1 a composite number?
        int count=0;
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                count++;
            }
        }
        return num != 1 && count != 2;
    }
    int[] generateNComposite(int N)
    {
        int arr[]=new int[N];
        int index=0,currNum=1;
        while(N>0)
        {
            if(isComposite(currNum))
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
        int arr[]=generateNComposite(rows*cols);
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
        CompositeMatrix obj=new CompositeMatrix();
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
    
    
   