import java.util.*;
public class FruitJuice
{
    int product_code;
    String flavour;
    String pack_type;
    int pack_size;
    int product_prize;
    FruitJuice()
    {
       product_code=0;
       flavour="";
       pack_type="";
       pack_size=0;
       product_prize=0;
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the flavor of the juice:");
        flavour=sc.nextLine();
        System.out.println("Enter the type of packaging :");
        pack_type=sc.nextLine();
        System.out.println("Enter the product code number :");
        product_code=sc.nextInt();
        System.out.println("Enter package size :");
        pack_size=sc.nextInt();
        System.out.println("Enter the price of the product :");
        product_prize=sc.nextInt();
    }
    void discount()
    {
        product_prize=product_prize-10;
    }
    void display()
    {
       System.out.println("Product code number:"+product_code);
       System.out.println("Flavor of the juice:"+flavour);
       System.out.println("Type of packaging:"+pack_type);
       System.out.println("Package size:"+pack_size);
       System.out.println("Price of the product:"+product_prize);
    }
    public static void main(String args[])
    {
        FruitJuice obj=new FruitJuice();
        obj.input();
        obj.discount();
        obj.display();
    }
}

        
        
    
        
    