import java.util.Scanner;
import java.util.Arrays;

class FillMatrixPrimes {
  int primeNumbers[];
  int matrix[][];
  int M, N;
  int lowerLimit, upperLimit;
  int maxPossiblePrimeNumbers;
  int countOfPrimes;
  static Scanner sc = new Scanner(System.in);
  
  FillMatrixPrimes(int M, int N, 
                   int lowerLimit, int upperLimit) {
    this.M = M;
    this.N = N;
    this.lowerLimit = lowerLimit;
    this.upperLimit = upperLimit;
    maxPossiblePrimeNumbers = upperLimit - lowerLimit + 1;
    primeNumbers = new int[maxPossiblePrimeNumbers];
    matrix = new int[this.M][this.N];
    countOfPrimes = 0;
  }

  boolean isPrime(int num) {
    if (num == 1) {
      return false;
    } else {
      int limit = num / 2;
      int i;
      for(i = 2; i <= limit; i++) {
        if (num % i == 0) {
          return false;
        }
      }
      return true;
    }
  }
  
  void generatePrimeNumbersInRange() {
    int index = 0;
    for(int i = lowerLimit; i <= upperLimit; i++) {
      if (isPrime(i)) {
        primeNumbers[index] = i;
        index++;
      }
    }
    countOfPrimes = index;
  }

  void displayMatrix() {
    for(int[] row: matrix) {
      System.out.println(Arrays.toString(row));
    }
    System.out.println("------------");
  }
  
  void fillMatrix() {
    int k = 0;
    int limit = M * N;
    int startRow = 0, startCol = 0;
    int endRow = M-1, endCol = N-1;
    outer:
    while(k < limit) {
      // Fill right-wards
      for(int col = startCol; col <= endCol; col++) {
        if (k == countOfPrimes) {
          break outer;
        }
        matrix[startRow][col] = primeNumbers[k];
        k++;
      }
      // Fill down-wards
      for(int row = startRow+1; row <= endRow; row++) {
        if (k == countOfPrimes) {
          break outer;
        }
        matrix[row][endCol] = primeNumbers[k];
        k++;
      }
      // Fill left-wards
      for(int col = endCol - 1; col >= startCol; col--) {
        if (k == countOfPrimes) {
          break outer;
        }
        matrix[endRow][col] = primeNumbers[k];
        k++;
      }
      // Fill up-wards
      for(int row = endRow-1; row >= startRow + 1; row--) {
        if (k == countOfPrimes) {
          break outer;
        }
        matrix[row][startCol] = primeNumbers[k];
        k++;
      }
      startRow++;
      startCol++;
      endRow--;
      endCol--;
    }
  }

  void display() {
    int limit = M*N;
    if (countOfPrimes < limit) {
      System.out.println("INSUFFICIENT ELEMENTS");
    } else if (countOfPrimes > limit) {
      System.out.println("EXCESS ELEMENTS");
    }

    for(int i = 0; i < M; i++) {
      for(int j = 0; j < N; j++) {
        System.out.printf("%3d ", matrix[i][j]);
      }
      System.out.println();
    }
  }
  
  public static void main(String args[]) {
    System.out.print("M = ");
    int rows = sc.nextInt();
    System.out.print("N = ");
    int cols = sc.nextInt();
    System.out.print("ENTER LOWER LIMIT: ");
    int lb = sc.nextInt();
    System.out.print("ENTER UPPER LIMIT: ");
    int ub = sc.nextInt();

    if (lb > ub) {
      System.out.println(
        "LOWER LIMIT CANNOT BE GREATER THAN UPPER LIMIT");
    } else if (rows < 0 || cols < 0) {
      System.out.println("ROWS OR COLUMNS CANNOT BE NEGATIVE");
    } else {
      FillMatrixPrimes obj = new FillMatrixPrimes(rows, cols, lb, ub);
      obj.generatePrimeNumbersInRange();
      obj.fillMatrix();
      obj.display();
    }
  }
}