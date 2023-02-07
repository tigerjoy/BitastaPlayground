import java.util.Scanner;
class AlterCaseQ21
{
  String alterCase(String str)
  {
    char arr[]=str.toCharArray();
    boolean isUpper=true;
    for(int i=0;i<=arr.length-1;i++)
    {
      if(Character.isLetter(arr[i]))
      {
        if(isUpper)
        {
          arr[i]=Character.toUpperCase(arr[i]);
        }
        else
        {
          arr[i]=Character.toLowerCase(arr[i]);
        }
        isUpper=!isUpper;
      }
    }
    String modified=new String(arr);
    return modified;
  }
  public static void main(String args[])
  {
    AlterCaseQ21 obj=new AlterCaseQ21();
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a string: ");
    String str=sc.nextLine();
    String modified=obj.alterCase(str);
    System.out.println("The original String is: "+str);
    System.out.println("The modified String is: "+modified);
  }// End of main()
}// End of class