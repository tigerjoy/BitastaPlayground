// Scored - 5 points
import java.util.Scanner;
class StringQ30
{
    String replaceVowels(String str)
    {
        str=str.toLowerCase();
        String replace="";// Empty string
        int length=str.length();
        for(int i=0;i<=length-1;i++)
        {
            char ch=str.charAt(i);
            if("aeiouAEIOU".indexOf(ch)!=-1)
            {
                replace+=(char)(ch+1);
            }
            else
            {
                replace+=ch;
            }
        }
        return replace;
    }
    public static void main(String args[])
    {
        StringQ30 obj=new StringQ30();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word=sc.next();
        String replacedWord=obj.replaceVowels(word);
        System.out.println("The word with its replaced vowels are: "+replacedWord);
    }// End of main()
}// End of class
        
        
        
        
        
        
        
        
        