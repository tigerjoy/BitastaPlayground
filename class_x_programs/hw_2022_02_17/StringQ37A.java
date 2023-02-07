// Scored - 5 points
import java.util.Scanner;
class StringQ37A
{
    // OBSERVATION #1
    // Although the program works fine, do you really need
    // to extract the words in order to replace it via
    // replace() ?
    String replaceWords(String str, String oldWord, String newWord)
    {
        // str=str.trim()+" ";
        // int startIndex=0;
        // int length=str.length();
        // for(int i=0;i<=length-1;i++)
        // {
        //     if(str.charAt(i)==' ')
        //     {
        //         String word=str.substring(startIndex,i);
        //         if(word.equalsIgnoreCase(oldWord))
        //         {
        //             str=str.replace(word,newWord);
        //         }
        //     startIndex=i+1;
        //     }
        // }
        // return str;
        return str.replace(oldWord, newWord);
    }
    public static void main(String args[])
    {
        StringQ37A obj=new StringQ37A();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str=sc.nextLine();
        System.out.print("Enter a old word: ");
        String oldWord=sc.next();
        System.out.print("Enter a new word: ");
        String newWord=sc.next();
        System.out.println("The original sentence: "+str);
        System.out.println("The new sentence: "+obj.replaceWords(str,oldWord,newWord));
    }// End of main()
}// End of class
        
        
                
        