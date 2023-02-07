// Scored - 10 points
import java.io.*;
import java.util.Scanner;
class File3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String desktopPath=System.getProperty("user.home")+"\\Desktop\\";
        System.out.println("Enter the name of the input file: ");
        String inFileName=sc.nextLine();
        System.out.print("Enter the number of copies to be made: ");
        int n=sc.nextInt();
        inFileName=desktopPath+inFileName;
        int length=inFileName.length();
        int dotIndex=inFileName.indexOf('.');
        String name=inFileName.substring(0,dotIndex);
        String extension=inFileName.substring(dotIndex+1,length);
        try
        {
            File inFile=new File(inFileName);
            if(inFile.exists())
            {
                for(int i=1;i<=n;i++)
                {
                    String outFileName=name+i+"."+extension;
                    FileInputStream fin=new FileInputStream(inFile);
                    FileOutputStream fout=new FileOutputStream(outFileName);
                    int readByte=fin.read();
                    while(readByte!=-1)
                    {
                        fout.write(readByte);
                        readByte=fin.read();
                    }
                    System.out.println(outFileName+" created successfully");
                    fin.close();
                    fout.close();
                }
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
    }//End of main()
}//End of class
