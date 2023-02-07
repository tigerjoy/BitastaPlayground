import java.util.Scanner;
class StringQ14
{
    void displayWords(String str)
    {
        str=str.trim();
        // Extract the last word
        int lastSpaceIndex=str.lastIndexOf(" ");
        String lastWord=str.substring(lastSpaceIndex+1);
        // Store all words except for the last word
        str=str.substring(0,lastSpaceIndex+1);
        int startIndex=0;
        int length=str.length();
        for(int i=0;i<=length-1;i++)
        {
            if(str.charAt(i)==' ')
            {
               String word=str.substring(startIndex,i);
               System.out.print(str.charAt(startIndex)+".");
               startIndex=i+1;
            }
        }
        System.out.println(lastWord);
    }
    public static void main(String args[])
    {
        StringQ14 obj=new StringQ14();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter name:");
        String name=sc.nextLine();
        obj.displayWords(name);
    }// End of main()
}// End of class
        
        
        
        
        
        
        