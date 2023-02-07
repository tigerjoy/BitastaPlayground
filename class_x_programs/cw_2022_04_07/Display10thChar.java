import java.util.Scanner;
class Display10thChar
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a character: ");
    char ch=sc.nextLine().charAt(0);
    System.out.println("The next 10th character: "+(char)((ch+10)%65536));
  }//End of main()
}//End of class