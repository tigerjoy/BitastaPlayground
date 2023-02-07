import java.io.*;
import java.util.Scanner;
class File12
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter name of the input file: ");
    String inFileName=sc.nextLine();
    System.out.print("Enter name of the output file: ");
    String outFileName=sc.nextLine();
    System.out.print("Enter old pattern: ");
    String oldPat=sc.nextLine();
    System.out.print("Enter new pattern: ");
    String newPat=sc.nextLine();
    try
    {
      File inFile=new File(inFileName);
      File outFile=new File(outFileName);
      if(inFile.exists())
      {
        FileInputStream fin=new FileInputStream(inFile);
        FileOutputStream fout=new FileOutputStream(outFile);
        String content="";// Empty string
        int readByte=fin.read();
        while(readByte!=-1)
        {
          content+=(char)(readByte);
          readByte=fin.read();
        }
        content=content.replace(oldPat,newPat);
        int length=content.length();
        for(int i=0;i<=length-1;i++)
        {
          fout.write((int)(content.charAt(i)));
        }
        System.out.println(outFileName+" is created successfully.");
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
      System.out.println("An I/O error occured.");
      e.printStackTrace();
    }
  }//End of main()
}//End of class