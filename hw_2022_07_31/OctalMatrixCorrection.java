// Scored - 5.5 points
import java.util.Scanner;
class OctalMatrixCorrection
{
    static Scanner sc=new Scanner(System.in);
    int mat[][];
    int M,N;
    OctalMatrixCorrection(int M,int N)
    {
        this.M=M;
        this.N=N;
        mat=new int[M][N];
    }
    boolean input()
    {  
        // Approach#2
        // boolean result = true;
        // outer:
        for(int i=0;i<=M-1;i++)
        {
            System.out.print("Enter elements for row "+(i+1)+": ");
            for(int j=0;j<=N-1;j++)
            {
                mat[i][j]=sc.nextInt();
                // But wouldn't the program still
                // continue to run even if invalid
                // input is given?
                if(mat[i][j]<0 || mat[i][j]>7)
                {
                    System.out.println("INVALID INPUT");
                    return false;
                    // Approach#2
                    // result = false;
                    // break outer;
                }
            }
            System.out.println();
        }
        return true;
        // Approach#2
        // return result;
    }
    int octal2decimal(int num)
    {
        int dec=0;
        int n=0;
        while(num>0)
        {
            int dig=num%10;
            dec=(int)(dig*Math.pow(8,n))+dec;
            n++;
            num/=10;
        }
        return dec;
    }
    void display()
    {
        System.out.print("FILLED MATRIX \t\t DECIMAL EQUIVALENT");
        System.out.println();
        for(int i=0;i<=M-1;i++)
        {
            int num=0;
            for(int j=0;j<=N-1;j++)
            {
                num=(num*10)+mat[i][j];
                System.out.print(mat[i][j]+"\t");
            }
            int dec=octal2decimal(num);
            System.out.println("\t\t"+dec);
        }
    }
    public static void main(String args[])
    {
        System.out.print("M = ");
        int rows=sc.nextInt();
        System.out.print("N = ");
        int cols=sc.nextInt();
        if(rows>0 && rows<10 && cols>2 && cols<6)
        {
            OctalMatrixCorrection obj=new OctalMatrixCorrection(rows,cols);
            if(obj.input() == true)
            {
              obj.display();
            }
        }
        else
        {
            System.out.println("OUT OF RANGE");
        }
    }//End of main()
}//End of class

        
        
    
        
    
            
            
            
    