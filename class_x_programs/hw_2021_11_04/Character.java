// Scored - 5 points
import java.util.*;
public class Character
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A CHARACTER:");
        char ch=sc.nextLine().charAt(0);
        if(ch>='A' && ch<='Z'||ch>='a' && ch<='z')
        {
           System.out.println("A LETTER");
        }
        else if(ch>='A' && ch<='Z')
        {
            System.out.println("A UPPERCASE LETTER");
        }
        else if(ch>='a' && ch<='z')
        {
            System.out.println("A LOWERCASE LETTER");
        }
        else if(ch>='0' && ch<='9')
        {
            System.out.println("A DIGIT");
        }
    }
}
    
            
            
    