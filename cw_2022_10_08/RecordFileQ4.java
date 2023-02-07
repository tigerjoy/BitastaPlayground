import java.util.Scanner;
import java.io.*;
class RecordFileQ4
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
      System.out.print("Enter name of the president "+i+": ");
      String name=sc.nextLine();
      System.out.print("Enter name of the country: ");
      String country=sc.nextLine();
      System.out.print("Enter name of the capital: ");
      String capital=sc.nextLine();
      fout.println(name);
      fout.println(country);
      fout.println(capital);
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
      System.out.print("Enter the name of the president to be searched: ");
      String presidentName=sc.nextLine();
      Scanner fin=new Scanner(inFile);
      boolean isFound = false;
      while(fin.hasNextLine())
      {
        String name=fin.nextLine();
        String country=fin.nextLine();
        String capital=fin.nextLine();
        if(presidentName.equalsIgnoreCase(name))
        {
          isFound=true;
          System.out.printf("%-20s %-20s %-20s\n","President Name","Country","Capital");
          System.out.printf("%-20s %-20s %-20s\n",name,country,capital);
          break;
        }
      }
      if(isFound==false)
      {
        System.out.println("President's name is not found in the list.");
      }
      fin.close();
    }
    else
    {
      System.out.println(filename+" does not exist");
    }
  }
  void displayMenu()
  {
    System.out.println("MENU");
    System.out.println("1. Add records");
    System.out.println("2. Search and display record");
    System.out.println("3. Quit");
    System.out.println("Enter your choice (1-3): ");
  }
  public static void main(String args[])
  {
    RecordFileQ4 obj=new RecordFileQ4();
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