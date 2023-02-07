import java.util.Scanner;
class DeleteWord
{
    String str,cleanedStr,delWord;
    char lastChar;
    String wordArray[];
    int wordCount;
    int delPos;
    DeleteWord(String str,char lastChar,String delWord,int delPos)
    {
        this.str=str;
        this.lastChar=lastChar;
        this.delWord=delWord;
        this.delPos=delPos;
    }
    void cleanString()
    {
        String s=str.trim() + " ";
        cleanedStr="";//Empty string
        int startIndex=0;
        int length=s.length();
        for(int i=0;i<=length-1;i++)
        {
            if(s.charAt(i)==' ')
            {
                String word=s.substring(startIndex,i);
                for(;i<=length-1;i++)
                {
                    if(s.charAt(i)!=' ')
                    {
                        startIndex=i;
                        break;
                    }
                }
                cleanedStr+=word+" ";
            }
        }
        cleanedStr=cleanedStr.trim();
    }
    void countWord()
    {
        wordCount=0;
        String s=cleanedStr.trim();
        int length=s.length();
        for(int i=0;i<=length-1;i++)
        {
            if(s.charAt(i)==' ')
            {
                wordCount++;
            }
        }
        wordCount=wordCount+1;
    }
    void wordExtraction()
    {
        countWord();
        wordArray=new String[wordCount];
        String s=cleanedStr.trim()+" ";
        int startIndex=0;
        int length=s.length();
        int index=0;
        for(int i=0;i<=length-1;i++)
        {
            if(s.charAt(i)==' ')
            {
                String word=s.substring(startIndex,i);
                wordArray[index]=word;
                startIndex=i+1;
                index++;
            }
        }
    }
    void display()
    {
        String output="";//Empty string
        for(int i=0;i<=wordArray.length-1;i++)
        {
          // We display only those words 
          // whose position does not match with the
          // current position and where the 
          // current word is not equal to the delWord
            // if(i!=delPos-1 &&
            //    !wordArray[i].equals(delWord))
            // System.out.println("----------------");
            // System.out.println("i:"+i);
            // System.out.println("delPos:"+delPos);
            // System.out.println("wordArray[i]:"+
            //                    wordArray[i]);
            // System.out.println("delWord:"+
            //                    delWord);
            // System.out.println("(i == delPos - 1):"+
            //                    (i == delPos - 1));
            // System.out.println(
            //       "wordArray[i].equals(delWord):"+                          wordArray[i].equals(delWord));
            // System.out.println("Condition: " + 
            //                   ((i == delPos - 1) &&               
            //     wordArray[i].equals(delWord)));
            // System.out.println("!Condition: " + 
            //                   !((i == delPos - 1) &&               
            //     wordArray[i].equals(delWord)));
            // if(!((i == delPos - 1) &&                wordArray[i].equals(delWord)))
            if(((i != delPos - 1) ||                !wordArray[i].equals(delWord)))
            {
                output+=wordArray[i]+" ";
            }
            // System.out.println("output: " + output);
            // System.out.println("----------------");
        }
        System.out.println(output.trim()+lastChar);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String s=sc.nextLine().trim();
        System.out.print("Enter the word to be deleted: ");
        String word=sc.next();
        System.out.print("Enter the position: ");
        int pos=sc.nextInt();
        char ch=s.charAt(s.length()-1);
        s=s.substring(0,s.length()-1);
        if(ch=='.'||ch=='!'||ch=='?')
        {
            DeleteWord obj=new DeleteWord(s,ch,word,pos);
            obj.cleanString();
            obj.wordExtraction();
            obj.display();
        }
        else
        {
            System.out.println("Invalid sentence");
        }
    }//End of main()
}//End of class
            
    
            
    
        
    