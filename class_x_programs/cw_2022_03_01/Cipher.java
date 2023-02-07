import java.util.Scanner;
class Cipher
{
  String encrypt(String str, int key)
  {
    int length=str.length();
    String output="";//Empty String
    for(int i=0;i<=length-1;i++)
    {
      char ch=str.charAt(i);
      int value=(int)(ch-65);
      value=(value+key)%26;
      ch=(char)(value+65);
      output+=ch;
    }
    return output;
  }
  String decrypt(String str, int key)
  {
    int length=str.length();
    String output="";//Empty String
    for(int i=0;i<=length-1;i++)
    {
      char ch=str.charAt(i);
      int value=(int)(ch-65);
      value=(value-key)%26;
      if(value<0)
      {
        value+=26;
      }
      ch=(char)(value+65);
      output+=ch;
    }
    return output;
  }
  public static void main(String args[])
  {
    Cipher obj=new Cipher();
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a word: ");
    String word=sc.next();
    System.out.print("Enter a key value (1-25): ");
    int key=sc.nextInt();
    System.out.println("Original word: "+word);
    String cipherText=obj.encrypt(word,key);
    System.out.println("Encrypted word: "+cipherText);
    String plainText=obj.decrypt(cipherText,key);
    System.out.println("Decrypted word: "+plainText);
  }// End of main()
}// End of class