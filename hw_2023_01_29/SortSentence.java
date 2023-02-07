// Scored - 7.5 points
import java.util.Scanner;
import java.util.StringTokenizer;
class SortSentence
{
    String str,output;
    int length,count;
    String words[];
    char lastChar;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("INPUT: ");
        // OBSERVATION #1
        // Though the questions tells us to assume
        // that the words are in UPPER CASE
        // Better to convert the entire sentence in
        // uppercase and then work with it
        str=sc.nextLine().toUpperCase();
        length=str.length();
        lastChar=str.charAt(length-1);
    }
    void extractWords()
    {
        StringTokenizer strTok=new StringTokenizer(str.trim(),"!?,. ");
        words=new String[strTok.countTokens()];
        int index=0;
        while(strTok.hasMoreTokens())
        {
            words[index]=strTok.nextToken();
            index++;
        }
    }
    // OBSERVATION #2
    // There is way using which you can
    // use just one loop to achieve this
    void sortWords()
    {
        count=0;
        output="";
        for(int i=0;i<=words.length-1;i++)
        {
            char ch1=words[i].charAt(0);
            char ch2=words[i].charAt(words[i].length()-1);
            if("AEIOU".indexOf(ch1)!=-1 && "AEIOU".indexOf(ch2)!=-1)
            {
                count++;
                output+=words[i]+" ";
            }
        }
        for(int i=0;i<=words.length-1;i++)
        {
            char ch1=words[i].charAt(0);
            char ch2=words[i].charAt(words[i].length()-1);
            if("AEIOU".indexOf(ch1)==-1 || "AEIOU".indexOf(ch2)==-1)
            {
                output+=words[i]+" ";
            }
        }
        output=output.trim();
        System.out.println("NUMBER OF WORDS BEGINNING AND ENDING WITH A VOWEL = "+count);
        System.out.println(output);
    }
    void sortWordsAlternate()
    {
      count=0;
      output="";
      String vowelWords=""; 
      String consonantWords="";
      for(int i=0;i<=words.length-1;i++)
      {
          char ch1=words[i].charAt(0);
          char ch2=words[i].charAt(words[i].length()-1);
          if("AEIOU".indexOf(ch1)!=-1 && "AEIOU".indexOf(ch2)!=-1)
          {
              count++;
              vowelWords+=words[i]+" ";
          }
          else
          {
            consonantWords+=words[i]+" ";
          }
      } 
      output=vowelWords+consonantWords;
      System.out.println("NUMBER OF WORDS BEGINNING AND ENDING WITH A VOWEL = "+count);
      System.out.println(output.trim());
    }
    public static void main(String args[])
    {
        SortSentence obj=new SortSentence();
        obj.input();
        if(".?!".indexOf(obj.lastChar)!=-1)
        {
            obj.extractWords();
            obj.sortWordsAlternate();
        }
        else
        {
            System.out.println("INVALID OUTPUT");
        }
    }//End of main()
}//End of class
            
    