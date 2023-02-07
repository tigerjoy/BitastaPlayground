import java.util.Scanner;
import java.io.*;
class File13
{
  int countVowels(String fileName) throws IOException
  {
    int count=0;
    FileInputStream fin=new FileInputStream(fileName);
    int readByte = fin.read();
    while(readByte != -1)
    {
      char ch= (char)readByte;
      if("AEIOUaeiou".indexOf(ch) != -1)
      {
        count++;
      }
      readByte=fin.read();
    }
    fin.close();
    return count;
  }
  int countConsonants(String fileName) throws IOException
  {
    int count=0;
    FileInputStream fin=new FileInputStream(fileName);
    int readByte = fin.read();
    while(readByte != -1)
    {
      char ch= (char)readByte;
      if(Character.isLetter(ch) && 
        "AEIOUaeiou".indexOf(ch) == -1)
      {
        count++;
      }
      readByte=fin.read();
    }
    fin.close();
    return count;
  }
  int countAlphabets(String fileName) throws IOException
  {
    int count=0;
    FileInputStream fin=new FileInputStream(fileName);
    int readByte = fin.read();
    while(readByte != -1)
    {
      char ch= (char)readByte;
      if(Character.isLetter(ch))
      {
        count++;
      }
      readByte=fin.read();
    }
    fin.close();
    return count;
  }
  int countDigits(String fileName) throws IOException
  {
    int count=0;
    FileInputStream fin=new FileInputStream(fileName);
    int readByte = fin.read();
    while(readByte != -1)
    {
      char ch= (char)readByte;
      if(Character.isDigit(ch))
      {
        count++;
      }
      readByte=fin.read();
    }
    fin.close();
    return count;
  }
  int countSpecial(String fileName) throws IOException
  {
    int count=0;
    FileInputStream fin=new FileInputStream(fileName);
    int readByte = fin.read();
    while(readByte != -1)
    {
      char ch= (char)readByte;
      if(!Character.isLetter(ch) && 
         !Character.isDigit(ch))
      {
        count++;
      }
      readByte=fin.read();
    }
    fin.close();
    return count;
  }
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the name of the input file: ");
    String inFileName=sc.nextLine();
    File13 obj=new File13();
    try
    {
      File inFile=new File(inFileName);
      if(inFile.exists())
      {
        System.out.println("Number of vowels: "+obj.countVowels(inFileName));
        System.out.println("Number of consonants: "+obj.countConsonants(inFileName));
        System.out.println("Number of digits: "+obj.countDigits(inFileName));
        System.out.println("Number of alphabets: "+obj.countAlphabets(inFileName));
        System.out.println("Number of special characters: "+obj.countSpecial(inFileName));
      }
      else
      {
        System.out.println(inFileName+" does not exists.");
      }
    }
    catch(IOException e)
    {
      System.out.println("An I/O error occured.");
      e.printStackTrace();
    }
  }
}