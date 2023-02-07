import java.util.Scanner;
import java.io.*;
class RecordTextFile
{
  static Scanner sc=new Scanner(System.in);
  void addRecords(String filename) throws IOException
  {
    FileWriter fr=new FileWriter(filename,true);
    BufferedWriter br=new BufferedWriter(fr);
    PrintWriter fout=new PrintWriter(br,true);
    System.out.print("Enter number of items to be added: ");
    int items=sc.nextInt();
    for(int i=1;i<=items;i++)
    {
      System.out.print("Enter product code of item "+i+": ");
      int pc=sc.nextInt();
      System.out.print("Enter unit price of item "+i+": ");
      double up=sc.nextInt();
      System.out.print("Enter quantity of item "+i+": ");
      int q=sc.nextInt();
      fout.println(pc);
      fout.println(up);
      fout.println(q);
    }
    fout.close();
    br.close();
    fr.close();
  }
  void displayRecords(String filename) throws IOException
  {
    File inFile=new File(filename);
    if(inFile.exists())
    {
      Scanner fin=new Scanner(inFile);
      System.out.printf("%-12s %-10s %-8s\n","Product Code","Unit Price","Quantity");
      while(fin.hasNextLine())
      {
        int pc=Integer.parseInt(fin.nextLine());
        double up=Double.parseDouble(fin.nextLine());
        int q=Integer.parseInt(fin.nextLine());
        System.out.printf("%-12d ₹%-10.2f %-8d\n",pc,up,q);
      }
      fin.close();
    }
    else
    {
      System.out.println(filename+" does not exist");
    }
  }
  void searchProduct(String filename, int p) throws IOEception
  {
    File inFile=new File(filename);
    if(inFile.exists())
    {
      Scanner fin=new Scanner(inFile);
      boolean isFound=false;
      while(fin.hasNextLine())
      {
        int pc=Integer.parseInt(fin.nextLine());
        double up=Double.parseDouble(fin.nextLine());
        int q=Integer.parseInt(fin.nextLine());
        if(pc==p)
        {
          System.out.printf("%-12s %-10s %-8s\n","Product Code","Unit Price","Quantity");
          System.out.printf("%-12d ₹%-10.2f %-8d\n",pc,up,q);
          isFound=true;
          break;
        }
      }
      fin.close();
      if(isFound==false)
      {
        System.out.println("The product with code "+p+" was not found.");
      }
    }
    else
    {
      System.out.println(filename+" does not exist");
    }
  }
}