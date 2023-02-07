import java.io.*;
import java.util.Scanner;
class FileMultipleSplit6
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the name of the input file: ");
    String inFileName=sc.nextLine();
    int dotIndex=inFileName.indexOf(".");
    String fileName=inFileName.substring(0,dotIndex);
    String extension=inFileName.substring(dotIndex+1);
    try
    {
      File inFile=new File(inFileName);
      if(inFile.exists())
      {
        FileInputStream fin=new FileInputStream(inFile);
        System.out.print("Enter the number of partitions: ");
        int split=sc.nextInt();
        int partitionSize=fin.available()/split;
        System.out.println("partitionSize = " + partitionSize);
        // Creating n-1 partitions
        for(int i=1;i<=split-1;i++)
        {
          String outFileName=fileName+"_"+i+"."+extension;
          FileOutputStream fout=new FileOutputStream(outFileName);
          // Read paritionSize bytes from the input file
          for(int j=1;j<=partitionSize;j++)
          {
            int readByte=fin.read();
            fout.write(readByte);
          }
          fout.close();
        }
        // Create the last partition
        String outFileName=fileName+"_"+split+"."+extension;
        FileOutputStream fout=new FileOutputStream(outFileName);
        // Write the remaining bytes from the input file
        int readByte=fin.read();
        while(readByte!=-1)
        {
          fout.write(readByte);
          readByte=fin.read();
        }
        fin.close();
        fout.close();
        System.out.println(split + " file(s) created successfully!");
      }
      else
      {
        System.out.println(inFileName+" does not exist.");
      }
    }
    catch(IOException e)
    {
      System.out.println("An I/O error ocurred.");
      e.printStackTrace();
    }
  }//End of main()
}//End of class