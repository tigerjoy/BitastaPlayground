import java.util.Scanner;
import java.io.*;
class RecordFileQ3
{
  static Scanner sc=new Scanner(System.in);
  void addRecords(String filename) throws IOException
  {
    FileWriter fr=new FileWriter(filename,true);
    BufferedWriter br=new BufferedWriter(fr);
    PrintWriter fout=new PrintWriter(br,true);
    System.out.print("Enter no. of records to be added: ");
    int records=sc.nextInt();
    sc.nextLine();
    for(int i=1;i<=records;i++)
    {
      System.out.print("Enter code of product " + i + ": ");
      String pCode=sc.nextLine();
      System.out.print("Enter quantity of product "+i+": ");
      int qty=sc.nextInt();
      System.out.print("Enter unit price of product "+i+": ");
      double unitPrice=sc.nextDouble();
      sc.nextLine();
      fout.println(pCode);
      fout.println(qty);
      fout.println(unitPrice);
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
      System.out.printf("%-12s %-8s %-16s\n","Product Code","Quantity","Total Item Price");
      double totalPrice=0.0;
      while(fin.hasNextLine())
      {
        String pCode=fin.nextLine();
        int qty=Integer.parseInt(fin.nextLine());
        double unitPrice=Double.parseDouble(fin.nextLine());
        double totalItemPrice=unitPrice*qty;
        totalPrice+=totalItemPrice;
        System.out.printf("%-12s %-8d Rs. %-16.2f\n",pCode,qty,totalItemPrice);
      }
      double discount=0.0;
      if(totalPrice>10000)
      {
        discount=0.1*totalPrice;
      }
      double amount=totalPrice-discount;
      System.out.println("Total price: Rs. "+totalPrice);
      System.out.println("Discount amount: Rs. "+discount);
      System.out.println("Amount to be paid: Rs. "+amount);
      fin.close();
    }
    else
    {
      System.out.println("An I/O error occurred.");
    }
  }
  void displayMenu()
  {
    System.out.println("MENU");
    System.out.println("1. Add records");
    System.out.println("2. Display records");
    System.out.println("3. Quit");
    System.out.println("Enter your choice (1-3): ");
  }
  public static void main(String args[])
  {
    RecordFileQ3 obj=new RecordFileQ3();
    System.out.print("Enter name of the file: ");
    String inFileName=sc.nextLine();
    try
    {
      int choice;
      do
      {
        obj.displayMenu();
        choice=sc.nextInt();
        sc.nextLine();
        switch(choice)
        {
          case 1:{
            obj.addRecords(inFileName);
            break;
          }
          case 2:{
            obj.displayRecords(inFileName);
            break;
          }
          case 3:{
            System.out.println("Quitting...");
            break;
          }
          default:{
            System.out.println("Invalid choice");
          }
        }
      }
      while(choice!=3);
    }
    catch(IOException e)
    {
      System.out.println("An I/O error occurred");
      e.printStackTrace();
    }
  }// End of main()
}// End of class