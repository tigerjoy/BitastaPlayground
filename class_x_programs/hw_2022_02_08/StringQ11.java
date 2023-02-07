// Scored - 5 points
import java.util.Scanner;
class StringQ11
{
    int countConsonants(String str)
    {
        int count=0;
        int length=str.length();
        for(int i=0;i<=length-1;i++)
        {
            char ch=str.charAt(i);
            if(Character.isLetter(ch))
            {
                if("aeiouAEIOU".indexOf(ch)==-1)
                {
                    count++;
                }
            }
        }
        return count;
    }
    int countVowels(String str)
    {
        int count=0;
        int length=str.length();
        for(int i=0;i<=length-1;i++)
        {
            char ch=str.charAt(i);
            if(Character.isLetter(ch))
            {
                if("aeiouAEIOU".indexOf(ch)!=-1)
                {
                    count++;
                }
            }
        }
        return count;
    }
    void displayWords(String str)
    {
        str=str.trim()+" ";
        int startIndex=0;
        int length=str.length();
        System.out.printf("%-15s %15s %20s\n", "WORD","VOWEL COUNT","CONSONANT COUNT");
        for(int i=0;i<=length-1;i++)
        {
            if(str.charAt(i)==' ')
            {
                String word=str.substring(startIndex,i);
                System.out.printf("%-15s %15d %20d\n", word,countVowels(word),countConsonants(word));
                startIndex=i+1;
            }
        }
    }
    public static void main(String args[])
    {
        StringQ11 obj=new StringQ11();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a sentence:");
        String str=sc.nextLine();
        System.out.println("The number of consonants and vowels in each word of the sentence are:");
        obj.displayWords(str);
    }// End of main()
}// End of class
        
        
        
        
        
        
        
        
        
        
        
        