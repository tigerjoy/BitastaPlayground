
import java.util.Scanner;
import java.util.Arrays;
import java.util.StringTokenizer;
public class Sentence
{
    String vowelWords;
    String str,sortedSentence;
    String sentences[];
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter sentences in a paragraph: ");
        str=sc.nextLine();
        vowelWords="";
        sortedSentence="";
    }
    void extractSentences()
    {
        StringTokenizer strTok=new StringTokenizer(str.trim(),"!?,.");
        sentences=new String[strTok.countTokens()];
        int index=0;
        while(strTok.hasMoreTokens())
        {
            sentences[index]=strTok.nextToken();
            index++;
        }
        //System.out.println(Arrays.toString(arr));
        index=0;
        int length=str.length();
        for(int i=0;i<=length-1;i++)
        {
            char ch=str.charAt(i);
            if("!?,.".indexOf(ch)!=-1)
            {
                sentences[index]+=ch;
                index++;
            }
        }
        //System.out.println(Arrays.toString(arr)); 
    }
    void bubbleSort(String sent[])
    {
        int n=sent.length;
        for(int i=0;i<=n-2;i++)
        {
            for(int j=0;j<=n-i-2;j++)
            {
                if(sent[j].compareTo(sent[j+1])>0)
                {
                    String temp=sent[j];
                    sent[j]=sent[j+1];
                    sent[j+1]=temp;
                }
            }
        }
    }
    void processSentence(String sent)
    {
        int length=sent.length();
        StringTokenizer strTok=new StringTokenizer(sent.trim()," !?,.");
        String words[]=new String[strTok.countTokens()];
        int index=0;
        while(strTok.hasMoreTokens())
        {
            words[index]=strTok.nextToken();
            index++;
        }
        bubbleSort(words);
        String output="";
        for(String word:words)
        {
            output+=word+" ";
        }
        output=output.trim();
        output+=sent.charAt(length-1);
        sortedSentence+=output;
    } 
    void extractVowels(String sent)
    {
        StringTokenizer strTok=new StringTokenizer(sent.trim()," !?,.");
        String words[]=new String[strTok.countTokens()];
        int index=0;
        while(strTok.hasMoreTokens())
        {
            words[index]=strTok.nextToken();
            index++;
        }
        //System.out.println(Arrays.toString(words));
        for(String word:words)
        {
            char ch=word.charAt(0);
            if("aeiouAEIOU".indexOf(ch)!=-1)
            {
                if(vowelWords.indexOf(word)==-1)
                {
                    vowelWords+=word+" ";
                }
            }
        }
    }
    void display()
    {
        for(int i=0;i<=sentences.length-1;i++)
        {
            processSentence(sentences[i]);
            extractVowels(sentences[i]);
        }
        System.out.println("OUTPUT :"+sortedSentence);
        System.out.println("VOWELS :"+vowelWords);
    }
    public static void main(String args[])
    {
        Sentence obj=new Sentence();
        obj.input();
        obj.extractSentences();
        obj.display();
    }
}
   