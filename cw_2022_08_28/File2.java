import java.io.*;
import java.util.Scanner;
class File2
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter name of the input file: ");
    String inFileName=sc.nextLine();
    try
    {
      File inFile=new File(inFileName);
      if(inFile.exists())
      {
        FileInputStream fin = new FileInputStream(inFile);
        System.out.println("Contents of " + inFileName + " are");
        int readByte=fin.read();
        while(readByte != -1)
        {
          System.out.print((char)readByte); // <---
          readByte=fin.read();
        }
        fin.close();
      }
      else
      {
        System.out.println(inFileName+" does not exist");
      }
    }
    catch(IOException e)
    {
      System.out.println("An I/O error occured");
      e.printStackTrace();
    }
  }// End of main()
}// End of class