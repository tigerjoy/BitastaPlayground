// Scored - 5 points
import java.util.Scanner;
class StringQ2
{
    void display(String str)
    {
        int length=str.length();
        for (int i=0;i<=length-1;i++)
        {
            System.out.print(str.charAt(i)+" ,");
        }
        System.out.println();
    }
    String reverse(String str)
    {
        String rev="";//Empty String
        int length=str.length();
        for(int i=length-1;i>=0;i--)
        {
            char ch=str.charAt(i);
            rev+=ch;
        }
        return rev;
    }
    public static void main(String args[])
    {
        StringQ2 obj=new StringQ2();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word=sc.next();
        String rev=obj.reverse(word);
        System.out.println("The string in the reversed order is: ");
        obj.display(rev);
    }// End of main()
}// End of class
