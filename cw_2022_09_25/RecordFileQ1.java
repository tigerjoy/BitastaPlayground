import java.io.*;
import java.util.Scanner;
class RecordFileQ1
{
  static Scanner sc=new Scanner(System.in);
  void addRecords(String filename) throws IOException
  {
    FileWriter fr=new FileWriter(filename,true);
    BufferedWriter br=new BufferedWriter(fr);
    PrintWriter fout=new PrintWriter(br,true);
    System.out.print("Enter number of records to be added: ");
    int records=sc.nextInt();
    for(int i=1;i<=records;i++)
    {
      System.out.print("Enter roll number of student "+i+": ");
      int roll=sc.nextInt();
      sc.nextLine();
      System.out.print("Enter name of student "+i+": ");
      String name=sc.nextLine();
      System.out.print("Enter class of student "+i+": ");
      int std=sc.nextInt();
      System.out.print("Enter total marks of student "+i+": ");
      int total=sc.nextInt();
      // Writing the record to the file
      fout.println(roll);
      fout.println(name);
      fout.println(std);
      fout.println(total);
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
      System.out.printf("%-5s %-20s %-11s\n","Roll","Name","Total marks");
      while(fin.hasNextLine())
      {
        int roll=Integer.parseInt(fin.nextLine());
        String name=fin.nextLine();
        int std=Integer.parseInt(fin.nextLine());
        int total=Integer.parseInt(fin.nextLine());
        System.out.printf("%-5d %-20s %-11d\n",roll,name,total);
      }
      fin.close();
    }
    else
    {
      System.out.println(filename+" does not exist.");
    }
  }
  void displayMenu()
  {
    System.out.println("MENU");
    System.out.println("1. Add records to the file");
    System.out.println("2. Display records");
    System.out.println("3. Quit");
    System.out.print("Enter your choice(1-3): ");
  }
  public static void main(String args[])
  {
    RecordFileQ1 obj=new RecordFileQ1();
    System.out.print("Enter the name of the file: ");
    String inFileName=sc.nextLine();
    try
    {
      int choice;
      do
      {
        obj.displayMenu();
        choice=sc.nextInt();
        switch(choice)
        {
          case 1: {
            obj.addRecords(inFileName);
            break;
          }
          case 2: {
            obj.displayRecords(inFileName);
            break;
          }
          case 3: {
            System.out.println("Quitting...");
            break;
          }
          default: {
            System.out.println("Invalid choice.");
          }
        }
      } while(choice!=3);
    }
    catch(IOException e)
    {
      System.out.println("An I/O error occurred.");
      e.printStackTrace();
    }
  }//End of main()
}//End of class
