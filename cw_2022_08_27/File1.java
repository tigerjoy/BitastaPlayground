import java.io.*;
import java.util.Scanner;
// C:/Users/<account-name>/Desktop/
class File1 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    // String desktopPath = System.getProperty("user.home") + "\\Desktop\\";
    System.out.println("Enter the name of the input file: ");
    String inFileName = sc.nextLine();
    // inFileName = desktopPath + inFileName;
    System.out.println("Enter the name of the output file: ");
    String outFileName = sc.nextLine();
    // outFileName = desktopPath + outFileName;
    // The code which may cause an error is written
    // inside of try{} block
    try {
      // Creating objects of File class
      File inFile = new File(inFileName);
      File outFile = new File(outFileName);

      // Checking if the input file exists
      if (inFile.exists()) {
        // Creating the stream objects
        FileInputStream fin = new FileInputStream(inFile);
        FileOutputStream fout = new FileOutputStream(outFile);

        // Reading from the input file
        // int readByte = fin.read();
        // while (readByte != -1) {
        int readByte;
        while((readByte = fin.read()) != -1) {
          // Write to the output file
          fout.write(readByte);
          
          // Read the next byte in the input file
          // readByte = fin.read();
        }

        System.out.println(outFileName + " created successfully!");

        // Close the files
        fin.close();
        fout.close();
      } else {
        System.out.println(inFileName + " does not exist");
      }
    }
    // If an IOException error occurs, the error message
    // to be displayed, in written inside of catch{} block
    catch (IOException e) {
      System.out.println("An I/O error occurred.");
      e.printStackTrace();
    }
  } // End of main()
} // End of class