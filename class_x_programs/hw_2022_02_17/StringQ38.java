// Scored - 5 points
import java.util.Scanner;
class StringQ38
{
    void change(String str)
    {
        int length=str.length();
        char firstLetter=str.charAt(0);
        char lastLetter=str.charAt(length-1);
        String str2=str.substring(1,length-1);
        String newWord=lastLetter+str2+firstLetter;
        System.out.println("The changed word: "+newWord);
    }
    
    public static void main(String args[])
    {
        StringQ38 obj=new StringQ38();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word=sc.next();
        System.out.println("The original word :"+word);
        obj.change(word);
    }//End of main()
}//End of class
    