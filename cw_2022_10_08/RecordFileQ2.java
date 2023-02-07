import java.util.Scanner;
import java.io.*;
class RecordFileQ2
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
      sc.nextLine();
      System.out.print("Enter name of student "+i+": ");
      String name=sc.nextLine();
      System.out.print("Enter marks in computer: ");
      double comp=sc.nextDouble();
      System.out.print("Enter marks in english: ");
      double eng=sc.nextDouble();
      System.out.print("Enter marks in psychology: ");
      double psy=sc.nextDouble();
      fout.println(name);
      fout.println(comp);
      fout.println(eng);
      fout.println(psy);
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
      System.out.printf("%-20s %-11s %-13s\n","Name","Total Marks","Average Marks");
      while(fin.hasNextLine())
      {
        String name=fin.nextLine();
        double comp=Double.parseDouble(fin.nextLine());
        double eng=Double.parseDouble(fin.nextLine());
        double psy=Double.parseDouble(fin.nextLine());
        double total=comp+eng+psy;
        double avg=total/3.0;
        System.out.printf("%-20s %-11.2f %-13.2f\n",name,total,avg);
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
    System.out.println("1. Add records");
    System.out.println("2. Display records");
    System.out.println("3. Quit");
    System.out.println("Enter your choice (1-3): ");
  }
  public static void main(String args[])
  {
    RecordFileQ2 obj=new RecordFileQ2();
    System.out.print("Enter name of the file: ");
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