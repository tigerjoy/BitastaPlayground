// Scored - 7.5 points
import java.util.Scanner;
import java.util.StringTokenizer;
class CaesarCipher
{
    String str;
    int key;
    CaesarCipher(String str)
    {
        this.str=str;
        key=13;
    }
    String encrypt()
    {
        int length=str.length();
        String output="";//Empty String
        for(int i=0;i<=length-1;i++)
        {
            char ch=str.charAt(i);
            if(Character.isLetter(ch))
            {
                if(Character.isUpperCase(ch))
                {
                    int value=(int)(ch-65);
                    value=(value+key)%26;
                    ch=(char)(value+65);
                    output+=ch;
                }
                else
                {
                    int value=(int)(ch-97);
                    value=(value+key)%26;
                    ch=(char)(value+97);
                    output+=ch;
                }
            }
            else
            {
                output+=ch;
            }
        }
        return output;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Sentence: ");
        String s=sc.nextLine();
        // OBSERVATION #1
        // You could've stored the length in a variable
        // to reduce call to length by 1.
        if(s.length()>3 && s.length()<100)
        {
            CaesarCipher obj=new CaesarCipher(s);
            String output=obj.encrypt();
            System.out.println("The cipher text is: "+output);
        }
        else
        {
            System.out.println("INVALID LENGTH");
        }
    }//End of main()
}//End of class
    