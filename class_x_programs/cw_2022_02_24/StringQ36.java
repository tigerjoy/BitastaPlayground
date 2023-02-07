import java.util.Scanner;
class StringQ36
{
    String reverse(String str)
    {
        String rev="";// Enter String
        int length=str.length();
        for(int i=length-1;i>=0;i--)
        {
            char ch=str.charAt(i);
            rev+=ch;
        }
        return rev;
    }
    boolean isPalindrome(String str)
    {
        String rev=reverse(str);
        if(str.equalsIgnoreCase(rev))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    boolean isSpecial(String str)
    {
        return str.charAt(0)==str.charAt(str.length()-1);  
    }
    void displayPalindromeWords(String str)
    {
        str=str.toUpperCase();
        str=str.trim()+" ";
        int startIndex=0;
        int length=str.length();
        System.out.print("Palindrome words: ");
        for(int i=0;i<=length-1;i++)
        {
            if(str.charAt(i)==' ')
            {
                String word=str.substring(startIndex,i);
                if(isPalindrome(word))
                {
                    
                    System.out.print(word+", ");   
                } 
                startIndex=i+1;
            }
        }
        System.out.println();
    }
    void displaySpecialWords(String str)
    {
        str=str.toUpperCase();
        str=str.trim()+" ";
        int startIndex=0;
        int length=str.length();
        System.out.print("Special words: ");
        for(int i=0;i<=length-1;i++)
        {
            if(str.charAt(i)==' ')
            {
                String word=str.substring(startIndex,i);
                if(isSpecial(word))
                {
                    
                    System.out.print(word+", ");   
                } 
                startIndex=i+1;
            }
        }
        System.out.println();
    }
    
    public static void main(String args[])
    {
        StringQ36 obj=new StringQ36();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str=sc.nextLine();
        obj.displayPalindromeWords(str);
        obj.displaySpecialWords(str);
    }//End of main()
}// End of class
    
                
                    
            
            
            
            
            
            
            
            
            
            
            
            
            
    
    
    
    
    
    
    
    
    
    
    
    
    
    