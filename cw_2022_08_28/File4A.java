import java.io.*;
import java.util.Scanner;
class File4A
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter name of the first input file: ");
    String inFile1Name=sc.nextLine();
    System.out.println("Enter name of the second input file: ");
    String inFile2Name=sc.nextLine();
    System.out.println("Enter name of the output file: ");
    String outFileName=sc.nextLine();
    try
    {
      File inFile1=new File(inFile1Name);
      File inFile2=new File(inFile2Name);
      File outFile=new File(outFileName);
      if(inFile1.exists() && inFile2.exists())
      {
        FileInputStream fin1=new FileInputStream(inFile1);
        FileInputStream fin2=new FileInputStream(inFile2);
        FileOutputStream fout=new FileOutputStream(outFile);
        // Reading from first input file
        int readByte=fin1.read();
        while(readByte != -1)
        {
          fout.write(readByte);
          readByte=fin1.read();
        }
        // Reading from second input file
        readByte=fin2.read();
        while(readByte != -1)
        {
          fout.write(readByte);
          readByte=fin2.read();
        }
        System.out.println(outFileName+" created successfully.");
        fin1.close();
        fin2.close();
        fout.close();
      }
      else
      {
        System.out.println("One of the files does not exist");
      }
    }
    catch(IOException e)
    {
      System.out.println("An I/O error occurred");
      e.printStackTrace();
    }
  }// End of main()
}// End of class