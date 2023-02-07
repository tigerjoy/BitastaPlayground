import java.util.Scanner;
class MergeStrings
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the first string: ");
    String str1=sc.next();
    System.out.print("Enter the first string: ");
    String str2=sc.next();
    int length1=str1.length();
    int length2=str2.length();
    String str3="";//Empty string
    String merged="";//Empty string
    if(length1>length2)
    {
      int length3=length1-length2;
      str3=str1.substring(length3);
      merged=str3+str2;
    }
    // else if(length2>length1)
    // {
    //   int length3=length2-length1;
    //   str3=str2.substring(length3);
    //   merged=str1+str3;
    // }
    // else
    // {
    //   merged=str1+str2;
    // }
    else 
    {
      int length3=length2-length1;
      str3=str2.substring(length3);
      merged=str1+str3;
    }
    
    System.out.println("The merged string is: "+merged);
  }//End of main()
}//End of class