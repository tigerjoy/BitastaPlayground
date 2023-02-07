import java.io.*;
import java.util.Scanner;
class File9
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the name of the input file: ");
    String inFileName=sc.nextLine();
    int length=inFileName.length();
    int dotIndex=inFileName.indexOf('.');
    String name=inFileName.substring(0,dotIndex);
    String extension=inFileName.substring(dotIndex+1,length);
    String outFileName=name+"_capital."+extension;
    try
    {
      File inFile=new File(inFileName);
      if(inFile.exists())
      {
        FileInputStream fin=new FileInputStream(inFile);
        FileOutputStream fout=new FileOutputStream(outFileName);
        int readByte=fin.read();
        while(readByte != -1)
        {
          char ch=(char)readByte;
          ch=Character.toUpperCase(ch);
          // char ch = Character.toUpperCase((char) readByte);
          fout.write((int)ch);
          readByte=fin.read();
        }
        System.out.println(outFileName+" created successfully.");
        fin.close();
        fout.close();
      }
      else
      {
        System.out.println(inFileName+" does not exist.");
      }
    }
    catch(IOException e)
    {
      System.out.println("An I/O error occurred");
      e.printStackTrace();
    }
  }// End of main()
}// End of class