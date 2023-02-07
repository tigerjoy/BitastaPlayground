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
 