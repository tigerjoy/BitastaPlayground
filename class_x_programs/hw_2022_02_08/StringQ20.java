// Scored - 5 points
import java.util.Scanner;
class StringQ20
{
    String reverse(String str)
    {
        String rev="";// Empty string
        int length=str.length();
        for(int i=length-1;i>=0;i--)
        {
            char ch=str.charAt(i);
            rev+=ch;
        }
        return rev;
    }
    boolean isPalindrome(String str)
    {
        String rev=reverse(str);
        if(str.equalsIgnoreCase(rev))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    void displayWords(String str)
    {
        str=str.trim()+" ";
        int startIndex=0;
        int length=str.length();
        for(int i=0;i<=length-1;i++)
        {
            if(str.charAt(i)==' ')
            {
                String word=str.substring(startIndex,i);
                if(isPalindrome(word)==true)
                {
                    System.out.print(word+", ");
                }
                startIndex=i+1;
            }
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        StringQ20 obj=new StringQ20();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str=sc.nextLine();
        System.out.println("The palindrome words of the sentence are: ");
        obj.displayWords(str);
    }// End of main()
}// End of class

        
        
        
        
        
        
        
        
        
        
        
        