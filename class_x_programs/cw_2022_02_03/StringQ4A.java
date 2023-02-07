import java.util.Scanner;
class StringQ4A
{
  void displayVowelConsonant(String str)
  {
    String vowels="";// Empty string
    String consonants="";// Empty string
    for(int i=0;i<=str.length()-1;i++)
    {
      char ch=str.charAt(i);
      if("aeiouAEIOU".indexOf(ch)!=-1)
      {
        vowels+=ch;
      }
      else if(Character.isLetter(ch)&&"aeiouAEIOU".indexOf(ch)==-1)
      {
        consonants+=ch;
      }
    }
    System.out.println("Vowel words: "+vowels);
    System.out.println("consonant words: "+consonants);
  }
  public static void main(String args[])
  {
    StringQ4A obj=new StringQ4A();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a word: ");
    String word=sc.next();
    word=word.toUpperCase();
    obj.displayVowelConsonant(word);
  }// End of main()
}// End of class