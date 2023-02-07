// Scored - 5 points
import java.util.Scanner;
class StringQ19
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
                String revWord=reverse(word);
                System.out.print(revWord+" ");
                startIndex=i+1;
            }
        }
    }
    public static void main(String args[])
    {
        StringQ19 obj=new StringQ19();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a sentence:");
        String str=sc.nextLine();
        System.out.println("The sentence with the characters of each words reversed is: ");
        obj.displayWords(str);
    }// End of main()
}// End of class
    
    
    
    
    
    
    
    
    
    
            