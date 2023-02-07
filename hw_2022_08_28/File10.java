// Scored - 10 points
import java.io.*;
import java.util.Scanner;
class File10
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    String desktopPath=System.getProperty("user.home")+"\\Desktop\\";
    System.out.println("Enter the name of the input file: ");
    String inFileName=sc.nextLine();
    inFileName=desktopPath+inFileName;
    int length=inFileName.length();
    int dotIndex=inFileName.indexOf('.');
    String name=inFileName.substring(0,dotIndex);
    String extension=inFileName.substring(dotIndex+1,length);
    String outFileName=name+"_lower."+extension;
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
          ch=Character.toLowerCase(ch);
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