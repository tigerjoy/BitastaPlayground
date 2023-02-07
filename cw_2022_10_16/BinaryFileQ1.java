import java.util.Scanner;
import java.io.*;

class BinaryFileQ1 {
  static Scanner sc = new Scanner(System.in);

  void addRecords(String filename) throws IOException {
    FileOutputStream fout = new FileOutputStream(filename, true);
    DataOutputStream out = new DataOutputStream(fout);
    System.out.print("Enter number of records: ");
    int records = sc.nextInt();
    sc.nextLine();
    for (int i = 1; i <= records; i++) {
      System.out.print("Enter roll number of student " + i + ": ");
      int roll = sc.nextInt();
      sc.nextLine();
      System.out.print("Enter name of student "+i+": ");
      String name=sc.nextLine();
      System.out.print("Enter class of student " + i + ": ");
      int std = sc.nextInt();
      System.out.print("Enter total marks of student " + i + ": ");
      double total = sc.nextDouble();
      out.writeInt(roll);
      out.writeUTF(name);
      out.writeInt(std);
      out.writeDouble(total);
    }
    out.close();
    fout.close();
  }

  void displayRecords(String filename) throws IOException
  {
    File inFile=new File(filename);
    if(inFile.exists())
    {
      FileInputStream fin=new FileInputStream(filename);
      DataInputStream in=new DataInputStream(fin);
      System.out.printf("%-5s %-20s %-11s\n","Roll","Name","Total Marks");
      boolean eof=false;
      while(eof==false)
      {
        try
        {
          int roll=in.readInt();
          String name=in.readUTF();
          int std=in.readInt();
          double total=in.readDouble();
          System.out.printf("%-5d %-20s %-11.2f\n",roll,name,total);
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

  void displayMenu() {
    System.out.println("MENU");
    System.out.println("1. Add records");
    System.out.println("2. Diplay records");
    System.out.println("3. Quit records");
    System.out.print("Enter your choice (1-3): ");
  }

  public static void main(String args[]) {
    BinaryFileQ1 obj = new BinaryFileQ1();
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
            System.out.println("Quitting...");
            break;
          }
          default: {
            System.out.println("Invalid choice");
          }
        }
      } while (choice != 3);
    } catch (IOException e) {
      System.out.println("An IO error has occurred.");
      e.printStackTrace();
    }
  }// End of main()
}// End of class