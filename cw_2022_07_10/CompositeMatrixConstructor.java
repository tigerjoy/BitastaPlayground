import java.util.Scanner;
public class CompositeMatrixConstructor
{
    int mat[][]; // Array Declaration
    int rows, cols;

    CompositeMatrixConstructor(int rows, int cols)
    {
      this.rows = rows;
      this.cols = cols;
      mat = new int[rows][cols];
    }
    // void display(int arr[][])
    void display()
    {
        // Already done by the constructor
        // int rows=mat.length;
        // int cols=mat[0].length;
        for(int i=0;i<=rows-1;i++)
        {
            for(int j=0;j<=cols-1;j++)
            {
                System.out.print(mat[i][j]+"\t");
            }
            System.out.println();
        }
    }
    // Independent Method
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
    // Independent Method
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
    // void fillArray(int mat[][])
    void fillArray()
    {
        // Already done by the constructor
        // int rows=mat.length;
        // int cols=mat[0].length;
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
        Scanner sc=new Scanner(System.in);
        // Variable names other than rows and cols
        // needs to be used, as we already have
        // a data member with the same name
        System.out.print("Enter the number of rows: ");
        int r=sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int c=sc.nextInt();
        // Parameterized Constructor Call
        CompositeMatrixConstructor obj=new CompositeMatrixConstructor(r, c);
        // Scanner sc=new Scanner(System.in);
        // System.out.print("Enter the number of rows: ");
        // int rows=sc.nextInt();
        // System.out.print("Enter the number of columns: ");
        // int cols=sc.nextInt();
        // int arr[][]=new int[rows][cols];
        // obj.fillArray(arr);
        obj.fillArray();
        System.out.println("The elements of the array are: ");
        // obj.display(arr);
        obj.display();
    }//End of main()
}//End of class
    
    
   