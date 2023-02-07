import java.util.Scanner;
class ReplaceCharQ16
{
  String replaceChar(String str)
  {
    char arr[]=str.toCharArray();
    for(int i=0;i<=arr.length-1;i++)
    {
      if("aeiouAEIOU".indexOf(arr[i])!=-1)
      {
        arr[i]='*';
      }
      else if(arr[i]==' ')
      {
        arr[i]='-';
      }
    }
    String modified=new String(arr);
    return modified;
  }
  public static void main(String args[])
  {
    ReplaceCharQ16 obj=new ReplaceCharQ16();
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a string: ");
    String str=sc.nextLine();
    String modified=obj.replaceChar(str);
    System.out.println("The original string is: "+str);
    System.out.println("The modified string is: "+modified);
  }// End of main()
}// End of class