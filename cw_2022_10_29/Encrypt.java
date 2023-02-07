import java.util.Scanner;
class Encrypt
{
  String wrd;
  int len;
  String newwrd;
  Encrypt()
  {
    wrd="";
    len=0;
    newwrd="";
  }
  void acceptword()
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a word: ");
    wrd=sc.next().toUpperCase();
    len=wrd.length();
  }
  void freqvowcon()
  {
    int countVowel=0;
    int countConsonant=0;
    for(int i=0;i<=len-1;i++)
    {
      char ch=wrd.charAt(i);
      if("AEIOU".indexOf(ch)!=-1)
      {
        countVowel++;
      }
      else if(Character.isLetter(ch))
      {
        countConsonant++;
      }
    }
    System.out.println("Frequency of vowels: "+countVowel);
    System.out.println("Frequency of consonants: "+countConsonant);
  }
  void nextVowel()
  {
    String vowels="AEIOU";
    for(int i=0;i<=len-1;i++)
    {
      char ch=wrd.charAt(i);
      int vowelIndex=vowels.indexOf(ch);
      // If ch is a vowel, append the next vowel in newwrd
      if(vowelIndex!=-1)
      {
        int nextVowelIndex=(vowelIndex+1)%5;
        newwrd=newwrd+vowels.charAt(nextVowelIndex);
      }
        // If ch is not a vowel, append it as it is in newwrd
      else
      {
        newwrd+=ch;
      }
    }
  }
  void disp()
  {
    System.out.println("The original word: "+wrd);
    System.out.println("The encrypted word: "+newwrd);
  }
  public static void main(String args[])
  {
    Encrypt obj=new Encrypt();
    obj.acceptword();
    obj.freqvowcon();
    obj.nextVowel();
    obj.disp();
  }//End of main()
}//End of class