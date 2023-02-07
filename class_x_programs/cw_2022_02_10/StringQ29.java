import java.util.Scanner;
class StringQ29
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a file path: ");
    String str=sc.nextLine();
    int lastSIndex=str.lastIndexOf('/');
    int dotIndex=str.indexOf('.');
    String path=str.substring(0,lastSIndex+1);
    String fileName=str.substring(lastSIndex+1,dotIndex);
    String extension=str.substring(dotIndex+1);
    System.out.println("Path: "+path);
    System.out.println("File name: "+fileName);
    System.out.println("File extension: "+extension);
  }// End of main()
}// End of class