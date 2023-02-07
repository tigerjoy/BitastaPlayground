import java.util.Scanner;
import java.io.*;
class FileMergeMultiple
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter name of output file: ");
    String outFileName=sc.nextLine();
    System.out.print("Enter no. of files to merge: ");
    int n=sc.nextInt();
    sc.nextLine();
    for(int i=1;i<=n;i++)
    {
      System.out.print("Enter name of input file "+i+": ");
      String inFileName=sc.nextLine();
      try
      {
        File inFile = new File(inFileName);
        File outFile = new File(outFileName);
        if(inFile.exists())
        {
          FileInputStream fin = new FileInputStream(inFile);
          FileOutputStream fout = new FileOutputStream(outFile,true);
          int readByte=fin.read();
          while(readByte!=-1)
          {
            fout.write(readByte);
            readByte=fin.read();
          }
          fin.close();
          fout.close();
        }
        else
        {
          System.out.println(inFileName+" does not exist");
        }
      }
      catch(IOException e)
      {
        System.out.print("An I/O error occurred");
        e.printStackTrace();
      }
    }
    System.out.println("Some files were merged");
  }// End of main()
}// End of class