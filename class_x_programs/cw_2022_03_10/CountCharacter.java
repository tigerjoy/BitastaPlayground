import java.util.Scanner;
class CountCharacter
{
  static Scanner sc=new Scanner(System.in);
  void input(char arr[])
  {
    for(int i=0;i<=arr.length-1;i++)
    {
      System.out.print("Enter element "+(i+1)+": ");
      arr[i]=sc.nextLine().charAt(0);
    }
  }
  int countUpperCase(char arr[])
  {
    int count=0;
    for(int i=0;i<=arr.length-1;i++)
    {
      if(Character.isUpperCase(arr[i]))
      {
        count++;
      }
    }
    return count;
  }
  int countVowels(char arr[])
  {
    int count=0;
    for(int i=0;i<=arr.length-1;i++)
    {
      if("aeiouAEIOU".indexOf(arr[i])!=-1)
      {
        count++;
      }
    }
    return count;
  }
  public static void main(String args[])
  {
    CountCharacter obj=new CountCharacter();
    char arr[]=new char[10];
    obj.input(arr);
    System.out.println("No. of uppercase letters are: "+obj.countUpperCase(arr));
    System.out.println("No. of vowels are: "+obj.countVowels(arr));
  }// End of main()
}// End of class