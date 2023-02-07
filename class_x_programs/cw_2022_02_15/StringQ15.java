import java.util.Scanner;
class StringQ15
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter your name: ");
    String name=sc.nextLine().trim();
    int lastSpaceIndex=name.lastIndexOf(" ");
    String surname=name.substring(lastSpaceIndex+1);
    name=name.substring(0,lastSpaceIndex);
    System.out.println(surname+", "+name);
  }// End of main()
}// End of class