// Scored - 5 points
import java.util.Scanner;
class StringQ31
{
    int linearSearch(String arr[], String key)
    {
        int pos=-1;
        for(int i=0;i<=arr.length-1;i++)
        {
            if(arr[i].equals(key))
            {
                pos=i;
                break;
            }
        }
        return pos;
    }
    public static void main(String args[])
    {
        StringQ31 obj=new StringQ31();
        Scanner sc=new Scanner(System.in);
        String sevenWonders[]={"CHICHEN ITZA", "CHRIST THE REMEMBER", "TAJMAHAL", "GREAT WALL OF CHINA", "MACHU PICCHU", "PETRA COLOSSEUM"};
        String locations[]={"MEXICO", "BRAZIL", "INDIA", "CHINA", "PERU", "JORDAN", "ITALY"};
        System.out.print("Enter the location to be searched: ");
        String key=sc.nextLine();
        key=key.toUpperCase();
        int pos=obj.linearSearch(locations,key);
        if(pos==-1)
        {
            System.out.println("Sorry not found!");
        }
        else
        {
            System.out.print(locations[pos]+", "+sevenWonders[pos]);
        }
    }// End of main()
}// End of class
            
            
            
            
            
            
            
            