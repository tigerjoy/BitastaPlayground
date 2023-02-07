import java.util.Scanner;
// import java.util.Arrays;
class ArrangeWords
{
  String str;
  String wordArray[];
  char terminator;
  String output;
  ArrangeWords(String str,char terminator)
  {
    this.str=str;
    this.terminator=terminator;
    output="";//Empty string
  }
  // Displays the original and the modified sentence
  void display()
  {
    System.out.println(str.trim()+terminator);
    System.out.println(output+terminator);
  }
  // Sorts wordArray with respect to the size of 
  // each word
  void bubbleSort()
  {
    int n=wordArray.length;
    for(int i=0;i<=n-2;i++)
    {
      for (int j=0;j<=n-i-2;j++)
      {
        if(wordArray[j].length()>wordArray[j+1].length())
        {
          String temp=wordArray[j];
          wordArray[j]=wordArray[j+1];
          wordArray[j+1]=temp;
        }
      }
    }
  }
  // Counts the number of words in str
  int countWords()
  {
    str=str.trim();
    int length=str.length();
    int count=0;
    for(int i=0;i<=length-1;i++)
    {
      if(str.charAt(i)==' ')
      {
        count++;
      }
    }
    return count+1;
  }
  // Converts str into array of words
  void wordsToArray()
  {
    wordArray=new String[countWords()];
    str=str.trim()+" ";
    int length=str.length();
    int index=0;
    int startIndex=0;
    for(int i=0;i<=length-1;i++)
    {
      if(str.charAt(i)==' ')
      {
        String word=str.substring(startIndex,i);
        wordArray[index]=word;
        startIndex=i+1;
        index++;
      }
    }
  }
  // Capitalizes the first letter of str and output
  void capitalize()
  {
    str=Character.toUpperCase(str.charAt(0))
      +str.substring(1);
    output=Character.toUpperCase(output.charAt(0))
      +output.substring(1);
  }
  // Creates a string from wordArray
  void createOutputString()
  {
    for(int i=0;i<=wordArray.length-1;i++)
    {
      output+=wordArray[i]+" ";
    }
    output=output.trim();
  }
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a sentence: ");
    String s=sc.nextLine();
    char ch=s.charAt(s.length()-1);
    s=s.substring(0,s.length()-1);
    if(ch=='.'||ch=='?'||ch=='!')
    {
      ArrangeWords obj=new ArrangeWords(s,ch);
      obj.wordsToArray();
      // System.out.println(
      //   Arrays.toString(obj.wordArray)
      // );
      obj.bubbleSort();
      // System.out.println(
      //   Arrays.toString(obj.wordArray)
      // );
      obj.createOutputString();
      obj.capitalize();
      obj.display();
    }
    else
    {
      System.out.println("INVALID SENTENCE");
    }
  }//End of main()
}//End of class