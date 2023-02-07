
// Scored - 4.5 points
import java.util.Scanner;

class ArrangeMatrix {
  static Scanner sc = new Scanner(System.in);
  int M;
  int mat[][];

  ArrangeMatrix(int M) {
    this.M = M;
    mat = new int[M][M];
  }

  void input() {
    for (int i = 0; i <= M - 1; i++) {
      for (int j = 0; j <= M - 1; j++) {
        System.out.printf("Enter element at %d,%d: ", i + 1, j + 1);
        mat[i][j] = sc.nextInt();
      }
    }
  }

  void bubbleSort(int arr[]) {
    int n = arr.length;
    for (int i = 0; i <= n - 2; i++) {
      for (int j = 0; j <= n - i - 2; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
  }

  int countNonBoundaryElements() {
    int count = 0;
    for (int i = 0; i <= M - 1; i++) {
      for (int j = 0; j <= M - 1; j++) {
        if ((i != 0) && (i != M - 1) && (j != 0) && (j != M - 1)) {
          count++;
        }
      }
    }
    return count;
  }

  void arrangeElements() {
    int nonBoundaryElements[] = new int[countNonBoundaryElements()];
    int index = 0;
    for (int i = 0; i <= M - 1; i++) {
      for (int j = 0; j <= M - 1; j++) {
        if ((i != 0) && (i != M - 1) && (j != 0) && (j != M - 1)) {
          nonBoundaryElements[index] = mat[i][j];
          index++;
        }
      }
    }
    bubbleSort(nonBoundaryElements);
    index = 0;
    for (int i = 0; i <= M - 1; i++) {
      for (int j = 0; j <= M - 1; j++) {
        if ((i != 0) && (i != M - 1) && (j != 0) && (j != M - 1)) {
          mat[i][j] = nonBoundaryElements[index];
          index++;
        }
      }
    }
  }

  int sumDiagonalElements() {
    int sum = 0;
    for (int i = 0; i <= M - 1; i++) {
      sum += mat[i][i];
      sum += mat[i][M - i - 1];
    }
    if (M % 2 == 0) {
      return sum;
    } else {
      return sum - (mat[M / 2][M / 2]);
    }
  }

  void displayDiagonals() {
    for (int i = 0; i <= M - 1; i++) {
      for (int j = 0; j <= M - 1; j++) {
        if (j == i || j == M - i - 1) {
          System.out.print(mat[i][j] + "\t");
        } else {
          System.out.print("\t");
        }
      }
      System.out.println();
    }
  }

  void display() {
    for (int i = 0; i <= M - 1; i++) {
      for (int j = 0; j <= M - 1; j++) {
        System.out.print(mat[i][j] + "\t");
      }
      System.out.println();
    }
  }

  public static void main(String args[]) {
    System.out.print("M = ");
    int m = sc.nextInt();
    if (m > 3 && m < 10) {
      ArrangeMatrix obj = new ArrangeMatrix(m);
      obj.input();
      System.out.println("ORIGINAL MATRIX");
      obj.display();
      obj.arrangeElements();
      System.out.println("REARRANGED MATRIX");
      obj.display();
      System.out.println("DIAGONAL ELEMENTS");
      obj.displayDiagonals();
      System.out.print("SUM OF THE DIAGONAL ELEMENTS = " + obj.sumDiagonalElements());
    } else {
      System.out.println("THE MATRIX SIZE IS OUT OF RANGE.");
    }
  }// End of main
}// End of class