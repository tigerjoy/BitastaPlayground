// Scored - 5 points
import java.util.Scanner;
import java.io.*;
class RecordFileQ8
{
  static Scanner sc=new Scanner(System.in);
  void addRecords(String filename) throws IOException
  {
    FileWriter fr=new FileWriter(filename,true);
    BufferedWriter br=new BufferedWriter(fr);
    PrintWriter fout=new PrintWriter(br,true);
    System.out.print("Enter no. of employees' details to be added: ");
    int employee=sc.nextInt();
    sc.nextLine();
    for(int i=1;i<=employee;i++)
    {
      System.out.print("Enter name of employee " + i + ": ");
      String name=sc.nextLine();
      System.out.print("Enter basic salary of employee "+i+": ");
      double basic=sc.nextDouble();
      sc.nextLine();
      fout.println(name);
      fout.println(basic);
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
      System.out.printf("%-20s %-12s %-10s %-8s %-12s\n","Name","Basic Salary","DA","HRA","Gross Salary");
      double da=0.0;
      double hra=0.0;
      double grossSalary=0.0;
      while(fin.hasNextLine())
      {
        String name=fin.nextLine();
        double basic=Double.parseDouble(fin.nextLine());
        da=(20.0/100.0)*basic;
        hra=(10.0/100.0)*basic;
        grossSalary=basic+da+hra;
        System.out.printf("%-20s ₹%-12.2f ₹%-10.2f ₹%-8.2f ₹%-12.2f\n",name,basic,da,hra,grossSalary);
      }
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
    RecordFileQ8 obj=new RecordFileQ8();
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