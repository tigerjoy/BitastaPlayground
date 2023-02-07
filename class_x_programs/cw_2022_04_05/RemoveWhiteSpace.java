import java.util.Scanner;
class RemoveWhiteSpace
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a sentence:");
    String str=sc.nextLine();
    str=str.replace(" ","");
    System.out.println("The string without spaces "+str);
  }// End of main()
}// End of class