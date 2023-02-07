import java.util.Scanner;

class Date {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the date in ddmmyyyy format:");
    String date = sc.next(); // 01011998
    int day = Integer.parseInt(date.substring(0, 2)); // 1
    int month = Integer.parseInt(date.substring(2, 4)); // 1
    int year = Integer.parseInt(date.substring(4)); // 1998
    String monthNames[] = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
        "October", "November", "December" };
    // dd/mm/yyyy
    System.out.printf("%02d/%02d/%04d\n", day, month, year);
    // 1 January, 1998
    // System.out.printf("%d %s, %d\n",day,monthNames[month-1],year);
    System.out.println(day + " " + monthNames[month - 1] + ", " + year);
  }
}