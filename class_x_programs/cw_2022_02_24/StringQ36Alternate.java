import java.util.Scanner;
class StringQ36Alternate
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
    void displayWords(String str)
    {
        String palindrome="";//Empty string
        String special="";//Empty string
        str=str.toUpperCase();
        str=str.trim()+" ";
        int startIndex=0;
        int length=str.length();
        for(int i=0;i<=length-1;i++)
        {
            if(str.charAt(i)==' ')
            {
                String word=str.substring(startIndex,i);
                if(isPalindrome(word))
                {
                   palindrome+=word+",";   
                } 
                if(isSpecial(word))
                {
                   special+=word+",";   
                } 
                startIndex=i+1;
            }
        }
        System.out.println("Palindrome words: "+palindrome);
        System.out.println("Special words: "+special);
    }
    public static void main(String args[])
    {
        StringQ36Alternate obj=new StringQ36Alternate();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str=sc.nextLine();
        obj.displayWords(str);
    }//End of main()
}// End of class
    
                
                    
            
            
            
            
            
            
            
            
            
            
            
            
            
    
    
    
    
    
    
    
    
    
    
    
    
    
    