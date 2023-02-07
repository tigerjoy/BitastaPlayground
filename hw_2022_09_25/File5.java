// Scored - 5 points
import java.io.*;
import java.util.Scanner;
class File5
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String desktopPath=System.getProperty("user.home")+"\\Desktop\\";
        System.out.println("Enter the name of the input file: ");
        String inFileName=sc.nextLine();
        // inFileName=desktopPath+inFileName;
        int dotIndex=inFileName.indexOf(".");
        String fileName=inFileName.substring(0,dotIndex);
        String extension=inFileName.substring(dotIndex+1);
        String outFileName1=fileName+"1."+extension;
        String outFileName2=fileName+"2."+extension;
        try
        {
            File inFile=new File(inFileName);
            if(inFile.exists())
            {
                FileInputStream fin=new FileInputStream(inFile);
                FileOutputStream fout1=new FileOutputStream(outFileName1);
                for(int j=0;j<=fin.available()/2;j++)
                {
                    int readByte=fin.read();
                    fout1.write(readByte);
                }
                fout1.close();
                FileOutputStream fout2=new FileOutputStream(outFileName2);
                int readByte=fin.read();
                while(readByte!=-1)
                {
                    fout2.write(readByte);
                    readByte=fin.read();
                }
                fin.close();
                fout2.close();
                System.out.println("Files are created successfully!");
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