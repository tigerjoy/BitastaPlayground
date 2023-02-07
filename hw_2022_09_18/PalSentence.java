// Scored - 7.5 points
import java.util.Scanner;
import java.util.StringTokenizer;
//import java.util.Arrays;
class PalSentence
{
    static String reverse(String str)
    {
        int length=str.length();
        String rev="";//Empty String
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
        if (str.equalsIgnoreCase(rev))
        {
            return true;
        }
        else
        {
            return false;
        }
    } 
    String[] extractWords(String str)
    {
       StringTokenizer strTok=new StringTokenizer(str.trim()," .!?");
       String words[]=new String[strTok.countTokens()];
       int index=0;
       while(strTok.hasMoreTokens())
       {
           words[index]=strTok.nextToken();
           index++;
       }
       return words;
    }
    String createNewWord(String word)
    {
        int li=word.length()-1;
        while(li >= 1 && word.charAt(li)==word.charAt(li-1))
        {
            li--;
        }
        String newWord=word.substring(0,li);
        String newPal=word+(reverse(newWord));
        return newPal;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str=sc.nextLine();
        char terminator=str.charAt(str.length()-1);
        str=str.substring(0,str.length()-1);
        if(terminator=='?'||terminator=='!'||terminator=='.')
        {
            PalSentence obj=new PalSentence();
            String words[]=obj.extractWords(str);
            //System.out.println("words = " + Arrays.toString(words));
            String newStr="";//Empty string
            for(int i=0;i<=words.length-1;i++)
            {
                String word=words[i];
                //System.out.println("word = " + word);
                //System.out.println("newStr = " + newStr);
                if(obj.isPalindrome(word))
                {
                    newStr+=word+" ";
                }
                else
                {
                    String newPal=obj.createNewWord(word);
                    //System.out.println("newPal = " + newPal);
                    newStr+=newPal+" ";
                }
            }
            System.out.println(str);
            System.out.println(newStr);
        }
        else
        {
            System.out.println("INVALID INPUT");
        }
    }//End of main()
}//End of class
        
        
            