import java.util.Scanner;
class ConvertCaseQ12
{
  String convertCase(String str)
  {
    String strConverted="";//Empty String
    int length=str.length();
    for(int i=0;i<=length-1;i++)
    {
      char ch=str.charAt(i);
      if(Character.isUpperCase(ch))
      {
        ch=Character.toLowerCase(ch);
      }
      else
      {
        ch=Character.toUpperCase(ch);
      }
      strConverted+=ch;
    }
    return strConverted;
  }
  public static void main(String args[])
  {
    ConvertCaseQ12 obj=new ConvertCaseQ12();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a name: ");
    String name=sc.nextLine();
    String converted=obj.convertCase(name);
    System.out.println("Original name: "+name);
    System.out.println("New name: "+converted);
  }// End of main()
}// End of class