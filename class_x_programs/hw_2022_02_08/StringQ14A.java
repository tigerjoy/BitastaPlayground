// But you solved, Q14 not Q14A
// Scored - 5 points
import java.util.Scanner;
class StringQ14A
{
    void displayWords(String str)
    {
        str=str.trim();
        int startIndex=0;
        int length=str.length();
        for(int i=0;i<=length-1;i++)
        {
            int lastIndex=str.lastIndexOf(" ");
            if(str.charAt(i)==' ')
            {
               String word=str.substring(startIndex,i);
               System.out.print(str.charAt(startIndex)+".");
               startIndex=i+1;
            }
        }
        System.out.print(str.substring(startIndex,length));
        System.out.println();
    }
    public static void main(String args[])
    {
        StringQ14A obj=new StringQ14A();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter name:");
        String name=sc.nextLine();
        obj.displayWords(name);
    }// End of main()
}// End of class
        
        
        
        
        
        
        