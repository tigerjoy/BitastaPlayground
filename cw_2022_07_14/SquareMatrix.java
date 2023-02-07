import java.util.Scanner;
public class SquareMatrix
{
    static Scanner sc=new Scanner(System.in);
    char M[][];
    char c1,c2,c3;
    int n;
    SquareMatrix(int n1)
    {
        n=n1;
        M=new char[n][n];
    }
    void input()
    {
        System.out.print("Enter character 1: ");
        c1=sc.nextLine().charAt(0);
        System.out.print("Enter character 2: ");
        c2=sc.nextLine().charAt(0);
        System.out.print("Enter character 3: ");
        c3=sc.nextLine().charAt(0);
    }
    void display()
    {
        int rows=M.length;
        int cols=M[0].length;
        for(int i=0;i<=rows-1;i++)
        {
            for(int j=0;j<=cols-1;j++)
            {
                System.out.print(M[i][j]+"\t");
            }
            System.out.println();
        }
    }
    void fillMatrix()
    {
       int rows=M.length;
        int cols=M[0].length;
        for(int i=0;i<=rows-1;i++)
        {
            for(int j=0;j<=cols-1;j++)
            { 
                // Checking for corner element
                // if(i==0 && j==0 || i==0 && j==cols-1 || i==rows-1 && j==0 || i==rows-1 && j==cols-1)
                // {
                //     M[i][j]=c1;
                // }
                // Checking for boundary element  
                if(i==0||i==rows-1||j==0||j==cols-1)
                {
                    M[i][j]=c2;
                }
                // It is a non-boundary element
                else
                {
                    M[i][j]=c3;
                }
            }
        }
        // Corner filling
        M[0][0] = M[0][cols-1] = M[rows-1][0] =   M[rows-1][cols-1] = c1;
    }
    public static void main(String args[])
    {
        System.out.print("Enter the size of the matrix: ");
        int s=sc.nextInt();
        sc.nextLine();
        SquareMatrix obj=new SquareMatrix(s);
        obj.input();
        obj.fillMatrix();
        System.out.println("The elements of the array: ");
        obj.display();
    }//End of main()
}//End of class
                    