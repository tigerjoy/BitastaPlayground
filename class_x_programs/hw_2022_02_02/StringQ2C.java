// Scored - 5 points
import java.util.Scanner;
class StringQ2C
{
    int count(String str, char ch)
    {
        int length=str.length();
        int count=0;
        for(int i=0;i<=length-1;i++)
        {
            if(str.charAt(i)==ch)
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String args[])
    {
        StringQ2C obj=new StringQ2C();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str=sc.nextLine();
        System.out.println("Enter the character to be searched: ");
        char ch=sc.nextLine().charAt(0);
        int count=obj.count(str,ch);
        System.out.println(ch+" occurs "+count+" times");
    }//End of main()
}// End of class