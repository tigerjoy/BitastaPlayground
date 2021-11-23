// Scored - 5 points
import java.util.*;
public class MovieMagic
{
    String title;
    int year;
    float rating;
    MovieMagic()
    {
        title="";
        year=0;
        rating=0f;
    }
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER NAME OF THE MOVIE:");
        title=sc.nextLine();
        System.out.println("ENTER THE YEAR OF RELEASE OF THE MOVIE:");
        year=sc.nextInt();
        System.out.println("ENTER POPULARITY RATING OF THE MOVIE:");
        rating=sc.nextFloat();
    }
    void display()
    {
        System.out.println("YEAR OF RELEASE:"+title);
        System.out.println("NAME OF THE MOVIE:"+year);
        if(rating>=0.0 && rating<=2.0)
        {
          System.out.println("FLOP");  
        }
        else if(rating>=2.1 && rating<=3.4)
        {
           System.out.println("SEMI-HIT");  
        }
        else if(rating>=3.5 && rating<=4.5)
        {
          System.out.println("HIT");   
        }
        else if(rating>=4.6 && rating<=5.0)
        {
           System.out.println("SUPER-HIT");  
        }
    }
    
    public static void main(String args[])
    {
        MovieMagic obj=new MovieMagic();
        obj.accept();
        obj.display();
    }
}

        
        
    
        
    
    