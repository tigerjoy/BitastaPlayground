// Scored - 5 points
import java.util.Scanner;
class StringQ2B
{
    void charAtOddIndices(String str)
    {
        int length=str.length();
        for(int i=0;i<=length-1;i++)
        {
            if(i%2==1)
            {
                System.out.print(str.charAt(i)+" ,");
            }
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        StringQ2B obj=new StringQ2B();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the word: ");
        String word=sc.next();
        obj.charAtOddIndices(word);
    }//End of main()
}//End of class