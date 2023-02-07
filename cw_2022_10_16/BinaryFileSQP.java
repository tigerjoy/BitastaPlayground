import java.util.Scanner;
import java.io.*;
class BinaryFileSQP
{
  static Scanner sc=new Scanner(System.in);
  void addRecords(String filename) throws IOException
  {
    FileOutputStream fout=new FileOutputStream(filename,true);
    DataOutputStream out=new DataOutputStream(fout);
    System.out.print("Enter number of items: ");
    int items=sc.nextInt();
    for(int i=1;i<=items;i++)
    {
      System.out.print("Enter product code: ");
      int pc=sc.nextInt();
      System.out.print("Enter unit price: ");
      double up=sc.nextDouble();
      System.out.print("Enter quantity: ");
      int q=sc.nextInt();
      out.writeInt(pc);
      out.writeDouble(up);
      out.writeInt(q);
    }
    out.close();
    fout.close();
  }
  void displayRecords(String filename) throws IOException 
  {
    File inFile = new File(filename);
    if(inFile.exists())
    {
      FileInputStream fin=new FileInputStream(inFile);
      DataInputStream in=new DataInputStream(fin);
      System.out.printf("%-12s %-10s %-8s\n","Product Code","Unit Price","Quantity");
      boolean eof=false;
      while(eof==false)
      {
        try
        {
          int pc=in.readInt();
          double up=in.readDouble();
          int q=in.readInt();
          System.out.printf("%-12d ₹ %-10.2f %-8d\n",pc,up,q);
        }
        catch(EOFException e)
        {
          eof=true;
        }
      }
      in.close();
      fin.close();
    }
    else
    {
      System.out.println(filename+" does not exist.");
    }
  }
  void findpro(String filename, int p) throws IOException 
  // void findpro(int p) 
  {
    File inFile = new File(filename);
    // File inFile = new File("ABC.DAT");
    if(inFile.exists())
    {
      FileInputStream fin=new FileInputStream(inFile);
      DataInputStream in=new DataInputStream(fin);
      boolean eof=false;
      boolean isFound=false;
      while(eof==false)
      {
        try
        {
          int pc=in.readInt();
          double up=in.readDouble();
          int q=in.readInt();
          if(p==pc)
          {
            System.out.printf("%-12s %-10s %-8s\n","Product Code","Unit Price","Quantity");
            System.out.printf("%-12s ₹ %-10.2f %-8d\n",pc,up,q);
            isFound=true;
            break;
          }
        }
        catch(EOFException e)
        {
          eof=true;
        }
      }
      in.close();
      fin.close();
      if(isFound==false)
      {
        System.out.println("Product code not found.");
      }
    }
    else
    {
      System.out.println(filename+" does not exist.");
    }
  }
  void displayMenu() {
    System.out.println("MENU");
    System.out.println("1. Add item(s)");
    System.out.println("2. Diplay item(s)");
    System.out.println("3. Seach item");
    System.out.println("4. Quit");
    System.out.print("Enter your choice (1-4): ");
  }

  public static void main(String args[]) {
    BinaryFileSQP obj = new BinaryFileSQP();
    System.out.print("Enter name of the file: ");
    String inFileName = sc.nextLine();
    try {
      int choice;
      do {
        obj.displayMenu();
        choice = sc.nextInt();
        switch (choice) {
          case 1: {
            obj.addRecords(inFileName);
            break;
          }
          case 2: {
            obj.displayRecords(inFileName);
            break;
          }
          case 3: {
            System.out.print("Enter the product code of item to search: ");
            int p = sc.nextInt();
            obj.findpro(inFileName, p);
            break;
          }
          case 4: {
            System.out.println("Quitting...");
            break;
          }
          default: {
            System.out.println("Invalid choice");
          }
        }
      } while (choice != 4);
    } catch (IOException e) {
      System.out.println("An IO error has occurred.");
      e.printStackTrace();
    }
  }
}