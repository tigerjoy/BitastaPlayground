// Scored - 5 points
import java.util.Scanner;
class StringQ32
{
    // OBSERVATION #1
    // Why do you need to return the array
    // after sorting? Doesn't the sorting
    // happen in-place? Moreover, what is 
    // the type of parameter used here?
    // char[] bubbleSort(char arr[])
    void bubbleSort(char arr[])
    {
        int n=arr.length;
        for(int i=0;i<=n-1;i++)
        {
            for(int j=0;j<=n-i-2;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    char temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    void sortedString(String str)
    {
        str=str.toUpperCase();
        char arr[]=str.toCharArray();
        // OBSERVATION #2
        // Returning the array is not required.
        // char modified[]=bubbleSort(arr);
        bubbleSort(arr);
        //String sorted=new String(modified);
        String sorted=new String(arr);
        System.out.println("The word in uppercase: "+str);
        System.out.println("The word after sorting: "+sorted);
    }
    public static void main(String args[])
    {
        StringQ32 obj=new StringQ32();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word=sc.next();
        obj.sortedString(word);
    }// End of main()
}// End of class
        
        
        
        
        
        
        
        
        
        