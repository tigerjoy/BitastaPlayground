// Scored - 5 points
import java.util.Scanner;
class StringQ23
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word=sc.next();
        int length=word.length();
        for(int i=0;i<=length-1;i++)
        {
            int asci=(int)word.charAt(i);
            System.out.print(asci);
        }
        System.out.println();
    }// End of main
}// End of class