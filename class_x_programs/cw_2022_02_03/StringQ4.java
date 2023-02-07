import java.util.Scanner;
class StringQ4
{
  int countConsonants(String str)
  {
    int count=0;
    for(int i=0;i<=str.length()-1;i++)
    {
      char ch=str.charAt(i);
      if(Character.isLetter(ch)&&"aeiouAEIOU".indexOf(ch)==-1)
      {
        count++;
      } 
    }
    return count;
  }
  int countVowels(String str)
  {
    int count=0;
    for(int i=0;i<=str.length()-1;i++)
    {
      char ch=str.charAt(i);
      if("aeiouAEIOU".indexOf(ch)!=-1)
      {
        count++;
      } 
    }
    return count;
  }
  int countDigit(String str)
  {
    int count=0;
    for(int i=0;i<=str.length()-1;i++)
    {
      char ch=str.charAt(i);
      if(ch>='0'&& ch<='9')
      {
        count++;
      } 
    }
    return count;
  }
  int countSpecial(String str)
  {
    int count=0;
    for(int i=0;i<=str.length()-1;i++)
    {
      char ch=str.charAt(i);
      if(!Character.isLetterOrDigit(ch))
      {
        count++;
      } 
    }
    return count;
  }
  public static void main(String args[])
  {
    StringQ4 obj=new StringQ4();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a sentence:");
    String str=sc.nextLine();
    System.out.println("The no. of consonants are: "+obj.countConsonants(str));
    System.out.println("The no. of vowels are: "+obj.countVowels(str));
    System.out.println("The no. of digits are: "+obj.countDigit(str));
    System.out.println("The no. of special characters are: "+obj.countSpecial(str));
  }// End of main()
}// End of class