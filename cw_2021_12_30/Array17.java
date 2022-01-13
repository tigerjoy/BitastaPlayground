import java.util.Scanner;

public class Array17 {
  static Scanner sc = new Scanner(System.in);

  void input(int arr[]) {
    for (int i = 0; i <= arr.length - 1; i++) {
      System.out.print("Enter element " + (i + 1) + ": ");
      arr[i] = sc.nextInt();
    }
  }

  int smallestOfArray(int arr[]) {
    int smallest = arr[0];
    for (int i = 1; i <= arr.length - 1; i++) {
      if (arr[i] < smallest) {
        smallest = arr[i];
      }
    }
    return smallest;
  }

  int largestOfArray(int arr[]) {
    int largest = arr[0];
    for (int i = 1; i <= arr.length - 1; i++) {
      if (arr[i] > largest)
        largest = arr[i];
    }
    return largest;
  }

  public static void main(String args[]) {
    Array17 obj = new Array17();
    System.out.println("Enter the size of the array: ");
    int size = sc.nextInt();
    int arr[] = new int[size];
    obj.input(arr);
    int smallest = obj.smallestOfArray(arr);
    int largest = obj.largestOfArray(arr);
    int diff=largest-smallest;
    System.out.println("The difference of the largest and the smallest element is: " +diff);
  }// End of main()
}// End of class
